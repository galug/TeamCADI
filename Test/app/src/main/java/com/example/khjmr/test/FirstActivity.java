package com.example.khjmr.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FirstActivity extends AppCompatActivity
{
    ImageView iv1;
    ImageView iv2;
    int imageIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        iv1=(ImageView)findViewById(R.id.iv1);
        iv2=(ImageView)findViewById(R.id.iv2);

        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                changeImage();
            }
        });

        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
    private void changeImage()
    {
        if(imageIndex==0)
        {
            iv1.setVisibility(View.VISIBLE);
            iv2.setVisibility(View.INVISIBLE);

            imageIndex=1;
        }
        else if(imageIndex==1)
        {
            iv1.setVisibility(View.INVISIBLE);
            iv2.setVisibility(View.VISIBLE);

            imageIndex=0;
        }
    }

}
