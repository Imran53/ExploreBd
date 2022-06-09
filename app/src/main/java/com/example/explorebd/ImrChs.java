package com.example.explorebd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import static java.lang.Thread.sleep;

public class ImrChs extends AppCompatActivity {
    LinearLayout ll,l2;
    Button btnsub;
    Animation uptodown,downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imr_chs);
        btnsub = (Button) findViewById(R.id.buttonsub);
        ll = (LinearLayout) findViewById(R.id.ll);
        l2 = (LinearLayout) findViewById(R.id.l2);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        ll.setAnimation(uptodown);
        l2.setAnimation(downtoup);

        Thread myThread = new Thread(new Runnable() {


            @Override
            public void run() {
                try {
                    sleep(1000);

                    Intent i = new Intent(ImrChs.this,MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
