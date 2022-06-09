package com.example.explorebd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Hoteldetail1Activity extends AppCompatActivity {

    int[] images = {R.drawable.tulipcox,R.drawable.sayemancox, R.drawable.longbeachhotel,R.drawable.hotelcox,R.drawable.mermaid,R.drawable.seagall, R.drawable.ocean,R.drawable.primecox,R.drawable.neeshorgocox,R.drawable.heritagecox,R.drawable.crown,R.drawable.terracecox,R.drawable.surfcox,R.drawable.inanicox,R.drawable.royalbeachcox,R.drawable.elafcox,R.drawable.hilltowercox,R.drawable.seacox,
            R.drawable.saintmartincox, R.drawable.beachwaycox,R.drawable.coastalpeacecox,R.drawable.oceanpalacecox, R.drawable.marineplazacox,R.drawable.orchid,R.drawable.mishukcox,R.drawable.shaibal,R.drawable.regal,R.drawable.media,R.drawable.hyperion,R.drawable.iqra,R.drawable.hilton};

    int[]images1 = {R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn};


    Hotel1Adapter hotel1Adapter;

    String[]title1,desc1,title11,title111,tumi1;
    RecyclerView recyclerView1;

    //day night mode
    FloatingActionButton fabSwitcher;
    boolean isDark = false;
    ConstraintLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail1);

        //day night mode
      //  fabSwitcher = findViewById(R.id.fab_switcher);
        rootLayout = findViewById(R.id.root_layout);
        isDark = getThemeStatePref();
        if(isDark){
            //dark theme is on
            rootLayout.setBackgroundColor(getResources().getColor(R.color.black));
        }
        else
        {
            //light theme is on
            rootLayout.setBackgroundColor(getResources().getColor(R.color.white));
        }

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView1=findViewById(R.id.recyclerViewId1);

        title1 = getResources().getStringArray(R.array.hotel_Names1);
        desc1=getResources().getStringArray(R.array.hotel_desc1);

        //add two
        title11 = getResources().getStringArray(R.array.hotel_Names11);
        title111=getResources().getStringArray(R.array.hotel_Names111);
        tumi1=getResources().getStringArray(R.array.hotel_Places1);
       // title13=getResources().getStringArray(R.array.hotel_Names13);


        hotel1Adapter=new Hotel1Adapter(this,title1,desc1,title11,title111,tumi1,images,images1,isDark);

        recyclerView1.setAdapter(hotel1Adapter);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));


        //day night mode
        fabSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isDark = !isDark;
                if(isDark){
                    rootLayout.setBackgroundColor(getResources().getColor(R.color.black));
                }
                else{
                    rootLayout.setBackgroundColor(getResources().getColor(R.color.white));
                }

                hotel1Adapter = new Hotel1Adapter(getApplicationContext(),title1,desc1,title11,title111,tumi1,images,images1,isDark);
                recyclerView1.setAdapter(hotel1Adapter);
                saveThemeStatePref(isDark);

            }
        });



    }

    //share

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.example_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }



    //day night theme
    private void saveThemeStatePref(boolean isDark) {

        SharedPreferences pref =getApplicationContext().getSharedPreferences("myPref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isDark",isDark);
        editor.commit();

    }
    private boolean getThemeStatePref (){

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref", MODE_PRIVATE);
        boolean isDark = pref.getBoolean("isDark",false);
        return isDark;
    }




    //animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSlideRight(this);
    }


    //add back button to the toolbar

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        {
            if(item.getItemId()==android.R.id.home)
            {
                this.finish();
            }

            else if(item.getItemId()==R.id.shareId1)
            {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");

                String subject="Explore bd";
                String body="This help is very useful.";

                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,body);

                startActivity(Intent.createChooser(intent,"শেয়ার করুন" +
                        ""));
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
