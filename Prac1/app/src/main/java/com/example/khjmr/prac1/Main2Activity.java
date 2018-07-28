package com.example.khjmr.prac1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnShowValue=(Button)findViewById(R.id.btnShowValue);
        btnShowValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result=getIntent().getIntExtra("pw",0);
                Toast.makeText(getApplicationContext(),Integer.toString(result), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
