package com.example.explorebd;



import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class MaterialActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //floating action
    FloatingActionButton fab_plus,fab_twitter,fab_fb;
    Animation FabOpen,FabClose,FabRClockwisw,FabRanticlockwise;
    boolean isOpen = false;

    //navigation view
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    Button btn_place, btn_hotel, btn_food, btn_national, btn_note, btn_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);

        //floating action

        fab_plus=(FloatingActionButton)findViewById(R.id.fab_plus);
        fab_twitter=(FloatingActionButton)findViewById(R.id.fab_twitter);
        fab_fb=(FloatingActionButton)findViewById(R.id.fab_fb);
        FabOpen= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        FabClose= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        FabRClockwisw=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        FabRanticlockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);
        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isOpen)
                {

                    fab_fb.startAnimation(FabClose);
                    fab_twitter.startAnimation(FabClose);
                    fab_plus.startAnimation(FabRanticlockwise);
                    fab_twitter.setClickable(false);
                    fab_fb.setClickable(false);
                    isOpen=false;

                }
                else
                {
                    fab_fb.startAnimation(FabOpen);
                    fab_twitter.startAnimation(FabOpen);
                    fab_plus.startAnimation(FabRClockwisw);
                    fab_twitter.setClickable(true);
                    fab_fb.setClickable(true);
                    isOpen=true;
                }
            }
        });


        //navigation
        drawerLayout = findViewById(R.id.drawerId);

        NavigationView navigationView = findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





        btn_place = (Button) findViewById(R.id.buttonPlace);
        btn_hotel = (Button) findViewById(R.id.buttonHotel);
        btn_food = (Button) findViewById(R.id.buttonFood);
        btn_national = (Button) findViewById(R.id.buttonNational);
        btn_note = (Button) findViewById(R.id.buttonDiary);
        btn_map = (Button) findViewById(R.id.buttonMap);


        btn_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MaterialActivity.this, MainActivity.class);
                startActivity(intent);
            }


        });


        btn_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MaterialActivity.this, HotelActivity.class);
                startActivity(intent);
            }


        });

        btn_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MaterialActivity.this, FoodActivity.class);
                startActivity(intent);
            }


        });

        btn_national.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MaterialActivity.this, NationalActivity.class);
                startActivity(intent);
            }


        });

        btn_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MaterialActivity.this, NoteActivity.class);
                startActivity(intent);
            }


        });

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MaterialActivity.this, MapsActivity.class);
                startActivity(intent);
            }


        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layoutshare,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //navigation view

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(toggle.onOptionsItemSelected(item))
        {
            return true;
        }

        else if(item.getItemId()==R.id.shareId1)
        {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject ="CSTE info";
            String body = "This app is very useful for the students of Dept. of CSTE, NSTU.\ncom.example.myapplication";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"share with"));
        }


        return super.onOptionsItemSelected(item);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Intent intent;

        if(item.getItemId()==R.id.diaryId)
        {
            intent = new Intent(this,Desh.class);
            startActivity(intent);
        }

        else if(item.getItemId()==R.id.feedbackId1Id)
        {
            intent = new Intent(this,Feedback1Activity.class);
            startActivity(intent);
        }


        else if(item.getItemId()==R.id.aboutusId)
        {
            intent = new Intent(this, ContactsContract.CommonDataKinds.Note.class);
            startActivity(intent);
        }

        return false;
    }

    public void browser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/explorebd53/"));
        startActivity(browserIntent);
    }

    public void browser2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.facebook.com/Explore-bd-112741270211185/?ref=bookmarks"));
        startActivity(browserIntent);
    }
}