package com.example.khjmr.alertdiaglog;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputText=(EditText)findViewById(R.id.inputText);
        final EditText removeText=(EditText)findViewById(R.id.removeText);
        Button btnAdd=(Button)findViewById(R.id.btnAdd);
        Button btnDel=(Button)findViewById(R.id.btnDel);
        ListView mListView=(ListView)findViewById(R.id.mListView);
        final ArrayList<String> strList=new ArrayList<String>();
        final ArrayAdapter strAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,strList);
        mListView.setAdapter(strAdapter);
        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String inputStr=inputText.getText().toString();//원래는 바깥에 있어야한다.
                strList.add(inputStr);
                strAdapter.notifyDataSetChanged();
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int count=strAdapter.getCount();
                String removeStr=removeText.getText().toString();
                int removeInt=Integer.parseInt(removeStr);
                if(count>removeInt || removeInt<0)
                {
                    strList.remove(removeInt);
                    strAdapter.notifyDataSetChanged();
                }
                else
                {
                    setDialog();
                }
            }
        });
    }

    private void setDialog()
    {
        AlertDialog.Builder msgBuilder = new AlertDialog.Builder(this)
                .setTitle("에러 확인 메시지")
                .setMessage("앱을 종료하시겠습니까?")
                .setNegativeButton("돌아가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"원래 화면으로 돌아옴",Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog msgDialog = msgBuilder.create();
        msgDialog.show();
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        setDialog();
    }
}
