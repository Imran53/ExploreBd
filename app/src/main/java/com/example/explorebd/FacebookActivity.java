package com.example.explorebd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class FacebookActivity extends AppCompatActivity {

    private ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        imageView1=findViewById(R.id.imageView1Id);
        imageView2=findViewById(R.id.imageView2Id);
    }
}
