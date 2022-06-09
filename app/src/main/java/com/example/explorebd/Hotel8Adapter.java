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

public class Hotel8Adapter extends RecyclerView.Adapter<Hotel8Adapter.MyViewHolder> {



    Context context;
    String []title8;
    String []desc8;
    // add two

    String [] title88;
    String [] title888;
    String[]tumi8;


    int[]  images;
    int[]  images8;

    //animation
    private int lastPosition=-1;


    public Hotel8Adapter(Context context, String[] title8, String[] desc8,String [] title88, String [] title888, String[]tumi8, int[] images,int[]images8) {
        this.context = context;
        this.title8 = title8;
        this.desc8 = desc8;
        //add two

        this.title88=title88;
        this.title888=title888;
        this.tumi8=tumi8;


        this.images = images;
        this.images8=images8;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel8_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title8[i]);
        myViewholder.descTextView1.setText(desc8[i]);

        //add two
        myViewholder.titleTextView11.setText(title88[i]);
        myViewholder.titleTextView111.setText(title888[i]);
        myViewholder.titleTextView1111.setText(tumi8[i]);


        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.flagImageView8.setImageResource(images8[i]);

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

        return title8.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView titleTextView1111;

        ImageView flagImageView1;
        ImageView flagImageView8;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId8);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId8);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId88);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId888);
            titleTextView1111=itemView.findViewById(R.id.tumi);

            flagImageView1 = itemView.findViewById(R.id.myImageViewId8);
            flagImageView8=itemView.findViewById(R.id.imageTumi);


        }
    }





}
