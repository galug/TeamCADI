package com.example.khjmr.blutoothlistexample;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BluetoothAdapter bluetoothAdapter;
    final static int BLUETOOTH_REQUEST_CODE=100;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBlueStart=(Button)findViewById(R.id.btnBlueStart);
        btnBlueStart.setOnClickListener(bluetoothOnLIstener);
    }

    private View.OnClickListener bluetoothOnLIstener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();//기기가 블루투스를 지원하는지 안하는지 선언한다

            if(bluetoothAdapter.isEnabled()==true)
            {
                Toast.makeText(getApplicationContext(),"블루투스가 현재 정상적으로 켜져있습니다.",Toast.LENGTH_SHORT).show();
                goBluetoothLIst();
            }
            else
            {
                Intent bluetoothintent=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(bluetoothintent,BLUETOOTH_REQUEST_CODE);
            }
        }
    };

    private void goBluetoothLIst()
    {
        Intent i=new Intent(MainActivity.this,BluetoothLIstActivty.class);
        startActivity(i);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode)
        {
            case BLUETOOTH_REQUEST_CODE:
                if(resultCode== Activity.RESULT_OK)
                {
                    Toast.makeText(getApplicationContext(),"블루투스를 활성화 중입니다.",Toast.LENGTH_SHORT).show();
                    goBluetoothLIst();
                }
                break;
        }
    }
}