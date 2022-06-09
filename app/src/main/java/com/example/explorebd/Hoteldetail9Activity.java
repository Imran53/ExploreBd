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

public class Hoteldetail9Activity extends AppCompatActivity {

    int[] images = {R.drawable.aronnokranga,R.drawable.tajranga,R.drawable.jumranga, R.drawable.holidayranga,R.drawable.motiranga,R.drawable.greenranga,R.drawable.shangai};
    int[]images9 = {R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn};
    Hotel9Adapter hotel9Adapter;

    String[] title9,desc9,title99,title999,tumi9;
    RecyclerView recyclerView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail9);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView9=findViewById(R.id.recyclerViewId9);

        title9 = getResources().getStringArray(R.array.hotel_Names9);
        desc9=getResources().getStringArray(R.array.hotel_desc9);

        //add two
        title99 = getResources().getStringArray(R.array.hotel_Names99);
        title999=getResources().getStringArray(R.array.hotel_Names999);
        tumi9=getResources().getStringArray(R.array.hotel_Places9);

        hotel9Adapter=new Hotel9Adapter(this,title9,desc9,title99,title999,tumi9,images,images9);

        recyclerView9.setAdapter(hotel9Adapter);
        recyclerView9.setLayoutManager(new LinearLayoutManager(this));

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
