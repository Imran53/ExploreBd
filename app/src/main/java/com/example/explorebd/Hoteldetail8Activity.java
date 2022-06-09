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

public class Hoteldetail8Activity extends AppCompatActivity {

    int[] images = {R.drawable.sikderkuakata,R.drawable.graverkuakata,R.drawable.grandkuakata,R.drawable.khanpalacekuakata,R.drawable.somudrakuakata,R.drawable.queenkuakata,R.drawable.southbangla,R.drawable.kuakataguest};

    int[] images8={R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn};

    Hotel8Adapter hotel8Adapter;

    String[] title8,desc8,title88,title888,tumi8;
    RecyclerView recyclerView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail8);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView8=findViewById(R.id.recyclerViewId8);

        title8 = getResources().getStringArray(R.array.hotel_Names8);
        desc8=getResources().getStringArray(R.array.hotel_desc8);

        //add two
        title88 = getResources().getStringArray(R.array.hotel_Names88);
        title888=getResources().getStringArray(R.array.hotel_Names888);
        tumi8=getResources().getStringArray(R.array.hotel_Places8);

        hotel8Adapter=new Hotel8Adapter(this,title8,desc8,title88,title888,tumi8,images,images8);

        recyclerView8.setAdapter(hotel8Adapter);
        recyclerView8.setLayoutManager(new LinearLayoutManager(this));



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
