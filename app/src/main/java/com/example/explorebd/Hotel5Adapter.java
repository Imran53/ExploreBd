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

public class Hotel5Adapter extends RecyclerView.Adapter<Hotel5Adapter.MyViewHolder> {



    Context context;
    String []title5;
    String []desc5;
    // add two

    String [] title55;
    String [] title555;
    String[] tumi5;


    int[]  images;
    int[] images5;

    //animation
    private int lastPosition=-1;

    public Hotel5Adapter(Context context, String[] title5, String[] desc5,String [] title55, String [] title555,String[] tumi5, int[] images,int[] images5) {
        this.context = context;
        this.title5 = title5;
        this.desc5 = desc5;
        //add two

        this.title55=title55;
        this.title555=title555;
        this.tumi5 = tumi5;


        this.images = images;
        this.images5 = images5;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel5_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title5[i]);
        myViewholder.descTextView1.setText(desc5[i]);

        //add two
        myViewholder.titleTextView11.setText(title55[i]);
        myViewholder.titleTextView111.setText(title555[i]);
        myViewholder.tumi5.setText(tumi5[i]);


        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.flagImageView5.setImageResource(images5[i]);


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

        return title5.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView tumi5;

        ImageView flagImageView1;
        ImageView flagImageView5;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId5);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId5);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId55);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId555);
            tumi5 = itemView.findViewById(R.id.tumi5);

            flagImageView1 = itemView.findViewById(R.id.myImageViewId5);
            flagImageView5 = itemView.findViewById(R.id.imageTumi5);


        }
    }





}
