package com.example.lab4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChatRoomActivity extends AppCompatActivity {

    String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
            "WebOS", "Ubuntu", "Windows7", "Max OS X"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_row_item);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, R.layout.list_view_row_item, mobileArray);

        ListView listView = findViewById(R.id.visualDisplayList);
        listView.setAdapter(adapter);
    }


}