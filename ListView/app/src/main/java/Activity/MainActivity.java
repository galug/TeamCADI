package Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.khjmr.listview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private ListView mListView=null;
    private NewLIstViewAdapter newLIstViewAdapter=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView =(ListView)mListView.findViewById(R.id.mListView);

        NewLIstViewAdapter newLIstViewAdapter=new NewLIstViewAdapter();

        mListView.setAdapter(newLIstViewAdapter);

    }
}
class NewLIstViewAdapter extends BaseAdapter
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
    public int getCount() {
        return mListData.size();
    }

    @Override
    public Object getItem(int position) {
        return mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Class.ViewHolder holder;
        if(convertView==null)
        {
           holder=new Class.ViewHolder();
           LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
           convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }
    }
}

