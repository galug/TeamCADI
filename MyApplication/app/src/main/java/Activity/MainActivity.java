package Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.khjmr.myapplication.R;

import java.util.ArrayList;

import Class.ViewHolder;

public class MainActivity extends AppCompatActivity
{
    private ListView mListView=null;
    private NewLIstViewAdapter newLIstViewAdapter=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private class NewLIstViewAdapter extends BaseAdapter
    {
        private Context mContext=null;
        private ArrayList<Class.ListData> mListData=new ArrayList<Class.ListData>();

        Class.ViewHolder viewHolder;

        public NewLIstViewAdapter(Context mContext)
        {
            super();
            this.mContext=mContext;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)//position 위치, converView View로 바꾸는 형태
        {
            ViewHolder viewHolder;

            if(convertView==null)
            {
                viewHolder=new ViewHolder();
                LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView=inflater.inflate(R.layout.listview_item,null);

                viewHolder.profile=(ImageView)convertView.findViewById(R.id.profile);
                viewHolder.myNickName=(TextView)convertView.findViewById(R.id.myNickName);
                viewHolder.myContent=(TextView)convertView.findViewById(R.id.myContent);
                viewHolder.profile2=(ImageView)convertView.findViewById(R.id.profile2);

                convertView.setTag(viewHolder);
            }
            else
            {
                convertView.getTag();
            }
            LayoutInflater layoutInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


            return convertView;
        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }
    }


}
