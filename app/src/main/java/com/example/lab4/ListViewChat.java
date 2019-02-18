package com.example.lab4;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SpinnerAdapter;




public class ListViewChat extends SpinnerAdapter <ListView> {


        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_listview);


            // Array of strings...
            String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
                    "WebOS", "Ubuntu", "Windows7", "Max OS X"};

            // ORIGINAL: adapter = new ArrayAdapter<String>(ListViewChat.this, R.layout.activity_listview, R.id.mobile_list, mobileArray);
            ListView listView = (ListView) findViewById(R.id.mobile_list);
            listView.setAdapter(adapter);


            SpinnerAdapter adapter = new SpinnerAdapter(ListViewChat.this, R.layout.activity_listview, R.id.mobile_list, mobileArray) {
                @Override
                public View getDropDownView(int position, View convertView, ViewGroup parent) {
                    return null;
                }

                @Override
                public void registerDataSetObserver(DataSetObserver observer) {

                }

                @Override
                public void unregisterDataSetObserver(DataSetObserver observer) {

                }

                @Override
                public int getCount() {
                    return 0;
                }

                @Override
                public Object getItem(int position) {
                    return null;
                }

                @Override
                public long getItemId(int position) {
                    return 0;
                }

                @Override
                public boolean hasStableIds() {
                    return false;
                }

                @Override
                public View getView(int position, View convertView, ViewGroup parent) {
                    return null;
                }

                @Override
                public int getItemViewType(int position) {
                    return 0;
                }

                @Override
                public int getViewTypeCount() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }
            };

        }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

    /*

public class ListViewChat extends ArrayAdapter<mobileArray> {

    SpinnerAdapter spinnerAddToListAdapter = new SpinnerAdapter(MyActivity.this, R.id.text_view, new ArrayList<>());



    private Context context;
    private List<mobileArray> mobileArray;

    public ListViewChat(Context context, int mobile_list,
                        List<mobileArray> mobileArray) {

        //Pass in the resource id:  R.id.text_view
        super(context, mobile_list, mobileArray);

        this.context = context;
        this.values = mobileArray;
    }
} */