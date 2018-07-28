package com.example.khjmr.windowpopup;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity // OnClick메서드 사용방법: 뒤에 implements View.OnclickListener 붙이기
{

    private Button btnClosePopup;
    private Button btnCreatePopup;
    private PopupWindow popupWindow;
    private int mWidthPixel = 0;//팝업창 너비
    private int mHeightPixel = 0;//팝업창 높이

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager wm = getWindowManager();//팝업창에 관한 클래스
        Display d = wm.getDefaultDisplay();//해상도에 관한 클래스
        DisplayMetrics dm = new DisplayMetrics();
        d.getMetrics(dm);

        mWidthPixel = dm.widthPixels;//가로길이 가져오기
        mHeightPixel = dm.heightPixels;//세로길이 가져오기

        Button popupWin = (Button) findViewById(R.id.popupWin);
        popupWin.setOnClickListener(popupListener);
    }

    private void initiatePopupWindow()
    {
        try
        {
            LayoutInflater inflater = (LayoutInflater) MainActivity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View layout = inflater.inflate(R.layout.popup, (ViewGroup) findViewById(R.id.popup_element));

            popupWindow = new PopupWindow(layout, mWidthPixel - 100, mHeightPixel - 500, true);
            popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    private View.OnClickListener popupListener=new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            Toast.makeText(getApplicationContext(),"popupLIstener실행",Toast.LENGTH_SHORT).show();
        }
    };

    /*public void OnClikc(View view)//OnClick보기
    {
        switch (view.getId())
        {
            case R.id.popupWin;

        }
    }*/
}
