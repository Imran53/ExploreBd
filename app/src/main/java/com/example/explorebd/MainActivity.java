package com.example.explorebd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    int[] images =  { R.drawable.cox2,R.drawable.sundarban1,R.drawable.saint2,R.drawable.sajek3,R.drawable.nilachal2flickr,R.drawable.kaptai2flickr,R.drawable.foys1,R.drawable.kuakata1, R.drawable.sreemangal2flickr,R.drawable.ratargul3flickr,R.drawable.jaflong2flickr,R.drawable.madhab1, R.drawable.bichanakandipinterest,R.drawable.nijhum1, R.drawable.mohastangharwikipedia,R.drawable.ahsan1,R.drawable.kantojir1,R.drawable.phaharpur1};



    MainAdapter mainAdapter;

    String[] place,place1,place2;
    RecyclerView recyclerVieww;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerVieww=findViewById(R.id.recyclerViewIdd);

        place = getResources().getStringArray(R.array.place_Names);
        place1=getResources().getStringArray(R.array.place_Names1);

        //add two
        place2 = getResources().getStringArray(R.array.place_Names2);
       // title222=getResources().getStringArray(R.array.hotel_Names222);

        mainAdapter=new MainAdapter(this,place,place1,place2,images);

        recyclerVieww.setAdapter(mainAdapter);
        recyclerVieww.setLayoutManager(new LinearLayoutManager(this));



//onclick listener
        mainAdapter.setOnItemClickListener(new MainAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, ProfileCoxActivity.class);
                    startActivity(intent);
                }

                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(MainActivity.this, ProfileSaintActivity.class);
                    startActivity(intent);
                }

                if (position == 3) {
                    Intent intent = new Intent(MainActivity.this, ProfileSajekActivity.class);
                    startActivity(intent);
                }

                if (position == 4) {
                    Intent intent = new Intent(MainActivity.this, ProfileNilacalActivity.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(MainActivity.this, ProfileKaptaiActivity.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(MainActivity.this, ProfileLakeActivity.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(MainActivity.this, ProfileKuakataActivity.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(MainActivity.this, ProfileSreeActivity.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(MainActivity.this, ProfileRatargulActivity.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(MainActivity.this, ProfileJaflongActivity.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(MainActivity.this, ProfileMadhabActivity.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(MainActivity.this, ProfileBichanakandiActivity.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(MainActivity.this, ProfileNijhumActivity.class);
                    startActivity(intent);
                }
                if (position == 14) {
                    Intent intent = new Intent(MainActivity.this, ProfileMohaActivity.class);
                    startActivity(intent);
                }
                if (position == 15) {
                    Intent intent = new Intent(MainActivity.this, ProfileAhsanActivity.class);
                    startActivity(intent);
                }
                if (position == 16) {
                    Intent intent = new Intent(MainActivity.this, ProfileKantojirActivity.class);
                    startActivity(intent);
                }
                if (position == 17) {
                    Intent intent = new Intent(MainActivity.this, ProfilePaharpurActivity.class);
                    startActivity(intent);
                }




            }
        });






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
        }
        return super.onOptionsItemSelected(item);
    }
}
