package com.example.lab4;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ChatRoomActivity extends MainActivity {

    String tag = "LifeCycle Step: ";


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Log.e(tag, "StateInfo %%%%%%%%%%% onCreate()");

    }
/*
    class ChatRoomActivity extends BaseAdapter {
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        public view getView(int position, view convertView, ViewGroup){
            return null;
        }
    }

*/


}