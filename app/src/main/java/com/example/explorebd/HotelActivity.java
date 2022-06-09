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

public class HotelActivity extends AppCompatActivity {

        int[] images = {

                R.drawable.jaflong2flickrresize,R.drawable.ratargul3flickrresize,R.drawable.nilachal2flickrresize,R.drawable.kaptai2flickr,
                R.drawable.madhabkundawikimedia,R.drawable.jaflong2flickrresize,R.drawable.sreemangal2flickrresize,R.drawable.locationn,
                R.drawable.coxsflickrresize,R.drawable.jaflong2flickr,R.drawable.aam,R.drawable.lichi1,
                R.drawable.sajek1pinterest,R.drawable.nijhumtheasianage



        };

        HotelAdapter hotelAdapter;

        String[] title,desc;
        RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        recyclerView=findViewById(R.id.recyclerViewId);

        title = getResources().getStringArray(R.array.hotel_Names);
        desc=getResources().getStringArray(R.array.hotel_desc1);

        hotelAdapter=new HotelAdapter(this,title,desc,images);

        recyclerView.setAdapter(hotelAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        hotelAdapter.setOnItemClickListener(new HotelAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                if (position == 0) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail1Activity.class);
                    startActivity(intent);
                }

                if (position == 1) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail2Activity.class);
                    startActivity(intent);
                }

                if (position == 2) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail3Activity.class);
                    startActivity(intent);
                }

                if (position == 3) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail4Activity.class);
                    startActivity(intent);
                }

                if (position == 4) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail5Activity.class);
                    startActivity(intent);
                }


                if (position == 5) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail6Activity.class);
                    startActivity(intent);
                }

                if (position == 6) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail7Activity.class);
                    startActivity(intent);
                }

                if (position == 7) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail8Activity.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail9Activity.class);
                    startActivity(intent);
                }

                if (position == 9) {
                    Intent intent = new Intent(HotelActivity.this, Hoteldetail10Activity.class);
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
