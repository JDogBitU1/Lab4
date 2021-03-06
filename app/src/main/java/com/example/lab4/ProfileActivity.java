package com.example.lab4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends MainActivity {

    Button chatBttn;
    Button bttnPhoto;
    ImageView mImageButton;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    String tag = "LifeCycle Step: ";
    TextView displayEmail;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.e(tag, "StateInfo %%%%%%%%%%% onCreate()");

        Bundle bundle = getIntent().getExtras();
        //String data_1 = bundle.getString("firstData");

        displayEmail = (TextView) findViewById(R.id.textView4);
        mImageButton = (ImageView) findViewById(R.id.imgView1);
        bttnPhoto = (Button) findViewById(R.id.bttnPhoto);
        chatBttn = (Button) findViewById(R.id.bttnChat);


        displayEmail.setText("jason.tomkins@gmail.com");

        bttnPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(it, REQUEST_IMAGE_CAPTURE);
            }
        });

    // CHAT ROOM
        chatBttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(ProfileActivity.this, ChatRoomActivity.class);
                startActivity(intent);
            }
        });


    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bitmap imageBitmap = (Bitmap) data.getExtras().get("data");
            mImageButton.setImageBitmap(imageBitmap);
        }
    }


    @Override
    public void onStart() {
        Log.e(tag, "StateInfo %%%%%%%%%%% onStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.e(tag, "StateInfo %%%%%%%%%%% onResume()");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(tag, "StateInfo %%%%%%%%%%% onPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(tag, "StateInfo %%%%%%%%%%% onStop()");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Log.e(tag, "StateInfo %%%%%%%%%%% onDestroy()");
        super.onDestroy();
    }

    @Override
    public void onRestart() {
        Log.e(tag, "StateInfo %%%%%%%%%%% onRestart()");
        super.onRestart();
    }


    public void onClick(View view) {
    }
}
