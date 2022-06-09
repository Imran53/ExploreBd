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

public class Hotel6Adapter extends RecyclerView.Adapter<Hotel6Adapter.MyViewHolder> {



    Context context;
    String []title6;
    String []desc6;
    // add two

    String [] title66;
    String [] title666;
    String [] tumi6;


    int[]  images;
    int[]  images6;

    //animation
    private int lastPosition=-1;


    public Hotel6Adapter(Context context, String[] title6, String[] desc6,String [] title66, String [] title666,String[]tumi6, int[] images,int[] images6) {
        this.context = context;
        this.title6 = title6;
        this.desc6 = desc6;
        //add two

        this.title66=title66;
        this.title666=title666;
        this.tumi6=tumi6;


        this.images = images;
        this.images6 = images6;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel6_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title6[i]);
        myViewholder.descTextView1.setText(desc6[i]);

        //add two
        myViewholder.titleTextView11.setText(title66[i]);
        myViewholder.titleTextView111.setText(title666[i]);
        myViewholder.tumi6.setText(tumi6[i]);


        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.flagImageView6.setImageResource(images6[i]);


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

        return title6.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView tumi6;

        ImageView flagImageView1;
        ImageView flagImageView6;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId6);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId6);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId66);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId666);
            tumi6 = itemView.findViewById(R.id.tumi6);

            flagImageView1 = itemView.findViewById(R.id.myImageViewId6);
            flagImageView6 = itemView.findViewById(R.id.imageTumi6);


        }
    }





}
