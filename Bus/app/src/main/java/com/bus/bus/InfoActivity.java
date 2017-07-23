package com.bus.bus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView mImageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        mImageView = (ImageView) findViewById(R.id.imageView3);


        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null){
            mToolbar.setTitle(mBundle.getString("placeNames"));
            mImageView.setImageResource(mBundle.getInt("placePicture"));
        }
    }
}
