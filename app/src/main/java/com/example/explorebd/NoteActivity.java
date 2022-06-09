package com.example.explorebd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashSet;

public class NoteActivity extends AppCompatActivity {
  static  ArrayList<String>notes=new ArrayList<>();
  static ArrayAdapter arrayAdapter;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_note_menu,menu);

        //add back button in the toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        return super.onCreateOptionsMenu(menu);

        //floating action button


    }



    //animation
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSlideRight(this);
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        {
            if(item.getItemId()==android.R.id.home)
            {
                this.finish();
            }
        }


        super.onOptionsItemSelected(item);

        if(item.getItemId()==R.id.add_note){

            Intent intent = new Intent(getApplicationContext(), NoteEditorActivity.class);

            startActivity(intent);

            return true;
        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        ListView listView = (ListView) findViewById(R.id.listView);

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.explorebd",Context.MODE_PRIVATE);

        HashSet<String>set = (HashSet<String>)sharedPreferences.getStringSet("notes",null);

        if(set==null){
            notes.add("শুরু করুন আপনার প্রথম নোট...");

        }else{
            notes = new ArrayList(set);
        }


        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, notes);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(), NoteEditorActivity.class);
                intent.putExtra("noteId",i);
                startActivity(intent);

            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {


                final int itemToDelete = i;

                new AlertDialog.Builder(NoteActivity.this)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("আপনি কি নিশ্চিত?")
                        .setMessage("আপনি কি এ নোটটি বাতিল করতে চান?")
                        .setPositiveButton("হ্যাঁ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                notes.remove(itemToDelete);
                                arrayAdapter.notifyDataSetChanged();

                                SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("com.example.explorebd", Context.MODE_PRIVATE);

                                HashSet<String> set = new HashSet(NoteActivity.notes);

                                sharedPreferences.edit().putStringSet("notes",set).apply();

                            }
                        }
                        )
                        .setNegativeButton("না",null)
                        .show();

                return true;
            }
        });

    }
}
