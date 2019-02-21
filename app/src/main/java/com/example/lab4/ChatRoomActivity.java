package com.example.lab4;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChatRoomActivity extends ProfileActivity {

    String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
            "WebOS", "Ubuntu", "Windows7", "Max OS X"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, R.layout.activity_listview, mobileArray);

        ListView listView = findViewById(R.id.visualDisplayList);
        listView.setAdapter(adapter);
    }


}