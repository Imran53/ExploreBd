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

public class Hoteldetail6Activity extends AppCompatActivity {

    int[] images = {R.drawable.castlekhulna,R.drawable.tigerkhulna,R.drawable.royalkhulna,R.drawable.cityinnkhulna, R.drawable.westernkhulna};
    int[]images6 = {R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn};
    Hotel6Adapter hotel6Adapter;

    String[] title6,desc6,title66,title666,tumi6;
    RecyclerView recyclerView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail6);


        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView6=findViewById(R.id.recyclerViewId6);

        title6 = getResources().getStringArray(R.array.hotel_Names6);
        desc6=getResources().getStringArray(R.array.hotel_desc6);

        //add two
        title66 = getResources().getStringArray(R.array.hotel_Names66);
        title666=getResources().getStringArray(R.array.hotel_Names666);
        tumi6=getResources().getStringArray(R.array.hotel_Places6);

        hotel6Adapter=new Hotel6Adapter(this,title6,desc6,title66,title666,tumi6,images,images6);

        recyclerView6.setAdapter(hotel6Adapter);
        recyclerView6.setLayoutManager(new LinearLayoutManager(this));



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
