package com.example.khjmr.alerty_plus;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder msgBuilder=new AlertDialog.Builder(this)
                .setTitle("안녕하세요")
                .setMessage("앱을 그만 종료하시겠습니까?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        finish();//종료
                    }
                })
                .setNegativeButton("123", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        Toast.makeText(getApplicationContext(),"나는 아직 살아있다.",Toast.LENGTH_SHORT).show();
                    }
                });
        final AlertDialog msgDialog=msgBuilder.create();//옮겨버리기

        Button popup=(Button)findViewById(R.id.popup);
        popup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                msgDialog.show();
            }
        });
    }
}
