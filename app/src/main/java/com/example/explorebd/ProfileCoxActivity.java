package com.example.explorebd;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ZoomControls;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class ProfileCoxActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView1;
    SliderLayout sliderLayout;

    //zoom
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_cox);

        //imageView = (ImageView) findViewById(R.id.imageViewId);
        textView1 = (TextView) findViewById(R.id.textView1);
        // textView1 =(TextView)findViewById(R.id.textView1);

        //zoom


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);




        sliderLayout = findViewById(R.id.imageSlider1);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();


    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home);
        {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSlideRight(this);
    }




    private void setSliderViews() {


        for (int i = 0; i <= 4; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.cox3);
                    sliderView.setDescription("");

                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.cox8);
                    sliderView.setDescription("");


                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.cox4);
                    sliderView.setDescription("");


                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.cox5);
                    sliderView.setDescription("");


                    break;

                case 4:
                    sliderView.setImageDrawable(R.drawable.cox2);
                    sliderView.setDescription("");
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            // sliderView.setDescription("setDescription"+(i+1));
           // final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(ProfileCoxActivity.this, "কক্সবাজার " , Toast.LENGTH_SHORT).show();
                }
            });

            sliderLayout.addSliderView(sliderView);
        }
    }



}

