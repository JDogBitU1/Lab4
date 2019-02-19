package com.example.lab4;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ChatRoomActivity extends ProfileActivity {

    String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
            "WebOS", "Ubuntu", "Windows7", "Max OS X"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_row_item);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view_row_item, mobileArray);

        ListView listView = (ListView) findViewById(R.id.textViewItem12);
        listView.setAdapter(adapter);
    }


}