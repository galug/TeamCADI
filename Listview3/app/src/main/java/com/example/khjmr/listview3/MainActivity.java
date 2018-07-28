package com.example.khjmr.listview3;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);            //액션바 아이콘을 업 네비게이션 형태로 표시합니다.
        actionBar.setDisplayShowTitleEnabled(false);        //액션바에 표시되는 제목의 표시유무를 설정합니다.
        actionBar.setDisplayShowHomeEnabled(false);

        LayoutInflater inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View actionbar=inflater.inflate(R.layout.custom_actionbar,null);
        actionBar.setCustomView(actionbar);
        return true;
    }

    private ListView mListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] strDate = {"오늘", "오늘", "어제", "그제", "2018/07/02",
                "2018/07/01", "2018/06/30","2018/06/29"};
        int nDatSeq=0;
        ArrayList<ItemData> mData = new ArrayList<>();
        for (int i=0; i<8; ++i)
        {
            ItemData oItem = new ItemData();
            oItem.strTitle = "이름" + (i+1);
            oItem.strDate = strDate[nDatSeq++];
            mData.add(oItem);
            if (nDatSeq >= strDate.length) nDatSeq = 0;
        }

        // ListView, Adapter 생성 및 연결 ------------------------
        mListView = (ListView)findViewById(R.id.listView);
        ListAdapter ListAdapter = new ListAdapter(mData);
        mListView.setAdapter(ListAdapter);
    }
}
