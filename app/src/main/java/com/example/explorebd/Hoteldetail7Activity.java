package com.example.explorebd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Hoteldetail7Activity extends AppCompatActivity {

    int[] images = {R.drawable.momobogra,R.drawable.nazbogra,R.drawable.motelbogra, R.drawable.redchilibogra,R.drawable.annexbogra};
    int[]images7 = {R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn};

    Hotel7Adapter hotel7Adapter;

    String[] title7,desc7,title77,title777,tumi7;
    RecyclerView recyclerView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail7);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView7=findViewById(R.id.recyclerViewId7);

        title7 = getResources().getStringArray(R.array.hotel_Names7);
        desc7=getResources().getStringArray(R.array.hotel_desc7);

        //add two
        title77 = getResources().getStringArray(R.array.hotel_Names77);
        title777=getResources().getStringArray(R.array.hotel_Names777);
        tumi7=getResources().getStringArray(R.array.hotel_Places7);

        hotel7Adapter=new Hotel7Adapter(this,title7,desc7,title77,title777,tumi7,images,images7);

        recyclerView7.setAdapter(hotel7Adapter);
        recyclerView7.setLayoutManager(new LinearLayoutManager(this));



    }

    //share

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.example_menu,menu);
        return super.onCreateOptionsMenu(menu);
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

                startActivity(Intent.createChooser(intent,"শেয়ার করুন"));
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
