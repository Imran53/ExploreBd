package com.example.explorebd;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;

public class Hotel7Adapter extends RecyclerView.Adapter<Hotel7Adapter.MyViewHolder> {



    Context context;
    String []title7;
    String []desc7;
    // add two

    String [] title77;
    String [] title777;
    String[] tumi7;


    int[]  images;
    int[] images7;

    //animation
    private int lastPosition=-1;


    public Hotel7Adapter(Context context, String[] title7, String[] desc7,String [] title77, String [] title777,String[] tumi7, int[] images,int[]images7) {
        this.context = context;
        this.title7 = title7;
        this.desc7 = desc7;
        //add two

        this.title77=title77;
        this.title777=title777;
        this.tumi7 = tumi7;


        this.images = images;
        this.images7 = images7;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel7_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title7[i]);
        myViewholder.descTextView1.setText(desc7[i]);

        //add two
        myViewholder.titleTextView11.setText(title77[i]);
        myViewholder.titleTextView111.setText(title777[i]);
        myViewholder.tumi7.setText(tumi7[i]);


        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.flagImageView7.setImageResource(images7[i]);


        //animation
        setAnimation(myViewholder.itemView,i);




    }

    //animation
    public void setAnimation(View viewToAnimate,int position) {

        if (position > lastPosition) {
            ScaleAnimation animation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f);
            animation.setDuration(1500);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {

        return title7.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView tumi7;

        ImageView flagImageView1;
        ImageView flagImageView7;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId7);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId7);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId77);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId777);
            tumi7 = itemView.findViewById(R.id.tumi7);

            flagImageView1 = itemView.findViewById(R.id.myImageViewId7);
            flagImageView7 = itemView.findViewById(R.id.imageTumi7);


        }
    }





}
