package com.example.explorebd;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class ProfileNilacalActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView4;
    SliderLayout sliderLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_nilacal);

        //imageView = (ImageView) findViewById(R.id.imageViewId);
        textView4 = (TextView) findViewById(R.id.textView4);
        // textView1 =(TextView)findViewById(R.id.textView1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);




        sliderLayout = findViewById(R.id.imageSlider4);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);

        setSliderViews();


        //  Bundle bundle = getIntent().getExtras();
        //   if (bundle != null) {

        //      String countryName = bundle.getString("name");
        //      showDetails(countryName);

        //   }
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

    //   void showDetails(String countryName) {

    //    if (countryName.equals("Cox Bazar")) {

    //  textView.setText(R.string.coxbazar_text);
    //  }

//    }


    private void setSliderViews() {


        for (int i = 0; i <= 3; i++) {
            DefaultSliderView sliderView = new DefaultSliderView(this);

            switch (i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.nilacal1);
                    sliderView.setDescription("");

                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.nilacal2);
                    sliderView.setDescription("");


                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.nilacal3);
                    sliderView.setDescription("");


                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.nilacal4);
                    sliderView.setDescription("");


                    break;
            }

            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            // sliderView.setDescription("setDescription"+(i+1));
            final int finalI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(ProfileNilacalActivity.this, "নিলাচল " + (finalI + 1), Toast.LENGTH_SHORT).show();
                }
            });

            sliderLayout.addSliderView(sliderView);
        }
    }



}

