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

public class Hoteldetail10Activity extends AppCompatActivity {

    int[] images = {R.drawable.marinesaintmartin,R.drawable.digantesaint,R.drawable.coralsaint,R.drawable.dreamnignt,R.drawable.somudra,R.drawable.lagon,R.drawable.prasad};
    int[]images10 = {R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn};
    Hotel10Adapter hotel10Adapter;

    String[] title10,desc10,title1010,title101010,tumi10;
    RecyclerView recyclerView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail10);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView10=findViewById(R.id.recyclerViewId10);

        title10 = getResources().getStringArray(R.array.hotel_Names10);
        desc10=getResources().getStringArray(R.array.hotel_desc10);

        //add two
        title1010 = getResources().getStringArray(R.array.hotel_Names1010);
        title101010=getResources().getStringArray(R.array.hotel_Names101010);
        tumi10=getResources().getStringArray(R.array.hotel_Places10);

        hotel10Adapter=new Hotel10Adapter(this,title10,desc10,title1010,title101010,tumi10,images,images10);

        recyclerView10.setAdapter(hotel10Adapter);
        recyclerView10.setLayoutManager(new LinearLayoutManager(this));



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
