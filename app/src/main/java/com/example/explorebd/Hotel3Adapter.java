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

public class Hotel3Adapter extends RecyclerView.Adapter<Hotel3Adapter.MyViewHolder> {



    Context context;
    String []title3;
    String []desc3;
    // add two

    String [] title33;
    String [] title333;
    String [] tumi3;


    int[]  images;
    int[] images3;

    //animation
    private int lastPosition=-1;



    public Hotel3Adapter(Context context, String[] title3, String[] desc3,String [] title33, String [] title333,String [] tumi3, int[] images,int[] images3) {
        this.context = context;
        this.title3 = title3;
        this.desc3 = desc3;
        //add two

        this.title33=title33;
        this.title333=title333;
        this.tumi3 = tumi3;


        this.images = images;
        this.images3 = images3;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel3_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title3[i]);
        myViewholder.descTextView1.setText(desc3[i]);

        //add two
        myViewholder.titleTextView11.setText(title33[i]);
        myViewholder.titleTextView111.setText(title333[i]);
        myViewholder.tumi3.setText(tumi3[i]);


        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.flagImageView3.setImageResource(images3[i]);


        //animation
        setAnimation(myViewholder.itemView,i);


    }

    //animation
    public void setAnimation(View viewToAnimate,int position){

        if(position>lastPosition){
            ScaleAnimation animation = new ScaleAnimation(0.0f,1.0f,0.0f,1.0f,
                    Animation.RELATIVE_TO_SELF,0.5f,
                    Animation.RELATIVE_TO_SELF,0.5f);
            animation.setDuration(1500);
            viewToAnimate.startAnimation(animation);
            lastPosition=position;
        }


    }


    @Override
    public int getItemCount() {

        return title3.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView tumi3;

        ImageView flagImageView1;
        ImageView flagImageView3;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId3);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId3);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId33);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId333);
            tumi3 = itemView.findViewById(R.id.tumi3);

            flagImageView1 = itemView.findViewById(R.id.myImageViewId3);
            flagImageView3 = itemView.findViewById(R.id.imageTumi3);


        }
    }





}
