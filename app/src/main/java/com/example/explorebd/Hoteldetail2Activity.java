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

public class Hoteldetail2Activity extends AppCompatActivity {

    int[] images = {R.drawable.pacificdhaka,R.drawable.westindhaka,R.drawable.lakeshoredhaka,R.drawable.radisondhaka,R.drawable.meridiandhaka,R.drawable.intercontinentaldhaka,R.drawable.raflesiadhaka,R.drawable.pacificlakedhaka,R.drawable.thecapital,R.drawable.ekattor,R.drawable.hotelamari};
    int[]images2 = {R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn};
    Hotel2Adapter hotel2Adapter;

    String[] title2,desc2,title22,title222,tumi2;
    RecyclerView recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail2);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView2=findViewById(R.id.recyclerViewId2);

        title2 = getResources().getStringArray(R.array.hotel_Names2);
        desc2=getResources().getStringArray(R.array.hotel_desc2);

        //add two
        title22 = getResources().getStringArray(R.array.hotel_Names22);
        title222=getResources().getStringArray(R.array.hotel_Names222);
        tumi2=getResources().getStringArray(R.array.hotel_Places2);
       // title23=getResources().getStringArray(R.array.hotel_Names23);


        hotel2Adapter=new Hotel2Adapter(this,title2,desc2,title22,title222,tumi2,images,images2);

        recyclerView2.setAdapter(hotel2Adapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));



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
