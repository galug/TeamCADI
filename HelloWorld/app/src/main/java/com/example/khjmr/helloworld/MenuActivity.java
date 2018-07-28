package com.example.khjmr.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent=getIntent();

        if(intent!=null)
        {
            String title=intent.getStringExtra("title");
            int age=intent.getIntExtra("age",0);
            Toast.makeText(getApplicationContext(),"Title:"+title+"age:"+age,Toast.LENGTH_LONG).show();
        }

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("name","mike");
                setResult(RESULT_OK,intent);

                finish();
            }
        });
    }
}
