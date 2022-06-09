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

public class Hoteldetail3Activity extends AppCompatActivity {

    int[] images = {R.drawable.peninsula,R.drawable.wellpark,R.drawable.agrabad, R.drawable.foysresort,R.drawable.marinactg,R.drawable.asian,R.drawable.hotelsaintmartin, R.drawable.hotelgolden,R.drawable.grandpark,R.drawable.meridian,R.drawable.hotelstarpark,R.drawable.avenue };

    int[]images3 = {R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn,R.drawable.locationn, R.drawable.locationn,R.drawable.locationn};
    Hotel3Adapter hotel3Adapter;

    String[] title3,desc3,title33,title333,tumi3;
    RecyclerView recyclerView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteldetail3);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView3=findViewById(R.id.recyclerViewId3);

        title3 = getResources().getStringArray(R.array.hotel_Names3);
        desc3=getResources().getStringArray(R.array.hotel_desc3);
        //add two
        title33 = getResources().getStringArray(R.array.hotel_Names33);
        title333=getResources().getStringArray(R.array.hotel_Names333);
        tumi3=getResources().getStringArray(R.array.hotel_Places3);


        hotel3Adapter=new Hotel3Adapter(this,title3,desc3,title33,title333,tumi3,images,images3);

        recyclerView3.setAdapter(hotel3Adapter);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));



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
