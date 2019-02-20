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
        setContentView(R.layout.list_view_row_item);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_view_row_item,
                R.id.visualDisplayList,
                mobileArray);

        ListView innerLayoutForItems = (ListView)findViewById(R.id.visualDisplayList);
        innerLayoutForItems.setAdapter(adapter);
    }


}