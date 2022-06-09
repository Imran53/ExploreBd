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

public class Hotel4Adapter extends RecyclerView.Adapter<Hotel4Adapter.MyViewHolder> {



    Context context;
    String []title4;
    String []desc4;
    // add two

    String [] title44;
    String [] title444;
    String [] tumi4;


    int[]  images;
    int[]  images4;

    //animation
    private int lastPosition=-1;

    public Hotel4Adapter(Context context, String[] title4, String[] desc4,String [] title44, String [] title444, String[] tumi4, int[] images,int[] images4) {
        this.context = context;
        this.title4 = title4;
        this.desc4 = desc4;
        //add two

        this.title44=title44;
        this.title444=title444;
        this.tumi4 = tumi4;


        this.images = images;
        this.images4 = images4;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel4_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title4[i]);
        myViewholder.descTextView1.setText(desc4[i]);

        //add two
        myViewholder.titleTextView11.setText(title44[i]);
        myViewholder.titleTextView111.setText(title444[i]);
        myViewholder.tumi4.setText(tumi4[i]);


        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.flagImageView4.setImageResource(images4[i]);



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

        return title4.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView tumi4;

        ImageView flagImageView1;
        ImageView flagImageView4;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId4);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId4);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId44);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId444);
            tumi4 = itemView.findViewById(R.id.tumi4);

            flagImageView1 = itemView.findViewById(R.id.myImageViewId4);
            flagImageView4 = itemView.findViewById(R.id.imageTumi4);


        }
    }





}
