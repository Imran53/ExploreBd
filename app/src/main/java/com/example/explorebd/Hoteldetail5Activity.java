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

public class Hoteldetail5Activity extends AppCompatActivity {

    int[] images = {R.drawable.sairu,R.drawable.venusbandar,R.drawable.nilgiribandar,R.drawable.forestbandar,R.drawable.hillpalacebandar,R.drawable.milonchori,R.drawable.heavenbandar,R.drawable.hillviewbandar,R.drawable.fanush,R.drawable.greenlandbandarb,R.drawable.nil,R.drawable.holi,R.drawable.geenpk,R.drawable.riverview };
    int[]images5 = {R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn};
    Hotel5Adapter hotel5Adapter;

    String[] title5,desc5,title55,title555,tumi5;
    RecyclerView recyclerView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail5);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView5=findViewById(R.id.recyclerViewId5);

        title5 = getResources().getStringArray(R.array.hotel_Names5);
        desc5=getResources().getStringArray(R.array.hotel_desc5);

        //add two
        title55 = getResources().getStringArray(R.array.hotel_Names55);
        title555=getResources().getStringArray(R.array.hotel_Names555);
        tumi5=getResources().getStringArray(R.array.hotel_Places5);

        hotel5Adapter=new Hotel5Adapter(this,title5,desc5,title55,title555,tumi5,images,images5);

        recyclerView5.setAdapter(hotel5Adapter);
        recyclerView5.setLayoutManager(new LinearLayoutManager(this));



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
