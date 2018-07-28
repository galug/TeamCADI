package com.example.khjmr.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputText=(EditText)findViewById(R.id.inputText);
        Button btnAdd=(Button)findViewById(R.id.btnAdd);
        Button btnDel=(Button)findViewById(R.id.btnDel);


        ListView mListView=(ListView)findViewById(R.id.mListView);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String inputTextStr=inputText.getText().toString();
            }
        });
    }
}
