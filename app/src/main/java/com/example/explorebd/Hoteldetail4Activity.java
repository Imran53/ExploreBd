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

public class Hoteldetail4Activity extends AppCompatActivity {

    int[] images = { R.drawable.rosesylhet,R.drawable.pacificsylhet,R.drawable.mirasylhet,R.drawable.nazimgarhsylhet,
            R.drawable.vistasylhet,R.drawable.valleysylhet,R.drawable.britanniasylhet,R.drawable.metrosylhet,
            R.drawable.nirvanasylhet,R.drawable.gatesylhet,R.drawable.gardeninnsylhet,R.drawable.richmondsylhet,
            R.drawable.noorjahansylhet,R.drawable.larosesylhet,R.drawable.hiltownsylhet,R.drawable.panshiinnsylhet,R.drawable.holyinnsylhet,R.drawable.rainbwsylhet,R.drawable.farmissylhet,R.drawable.south,R.drawable.supreme,R.drawable.dalas,R.drawable.sultan,R.drawable.dusai,R.drawable.fortune,R.drawable.novem,R.drawable.lemon,R.drawable.tearesort};


    int[]images4 = {R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn};


    Hotel4Adapter hotel4Adapter;

    String[] title4,desc4,title44,title444,tumi4;
    RecyclerView recyclerView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail4);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView4=findViewById(R.id.recyclerViewId4);

        title4 = getResources().getStringArray(R.array.hotel_Names4);
        desc4=getResources().getStringArray(R.array.hotel_desc4);

        //add two
        title44 = getResources().getStringArray(R.array.hotel_Names44);
        title444=getResources().getStringArray(R.array.hotel_Names444);
        tumi4=getResources().getStringArray(R.array.hotel_Places4);

        hotel4Adapter=new Hotel4Adapter(this,title4,desc4,title44,title444,tumi4,images,images4);

        recyclerView4.setAdapter(hotel4Adapter);
        recyclerView4.setLayoutManager(new LinearLayoutManager(this));



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
