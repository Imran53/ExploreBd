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

public class Hotel9Adapter extends RecyclerView.Adapter<Hotel9Adapter.MyViewHolder> {



    Context context;
    String []title9;
    String []desc9;

    // add two

    String [] title99;
    String [] title999;
    String []tumi9;



    int[]  images;
    int[]  images9;

    //animation
    private int lastPosition=-1;

    public Hotel9Adapter(Context context, String[] title9, String[] desc9,String [] title99, String [] title999,String[]tumi9, int[] images,int[]images9) {
        this.context = context;
        this.title9 = title9;
        this.desc9 = desc9;
        //add two

        this.title99=title99;
        this.title999=title999;
        this.tumi9=tumi9;


        this.images = images;
        this.images9=images9;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel9_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title9[i]);
        myViewholder.descTextView1.setText(desc9[i]);

        //add two
        myViewholder.titleTextView11.setText(title99[i]);
        myViewholder.titleTextView111.setText(title999[i]);
        myViewholder.titleTextView1111.setText(tumi9[i]);


        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.flagImageView9.setImageResource(images9[i]);

        //animation
        setAnimation(myViewholder.itemView,i);

    }


    //animation
    public void setAnimation(View viewToAnimate,int position) {

        if (position > lastPosition) {
            ScaleAnimation animation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f,
                    Animation.RELATIVE_TO_SELF, 0.5f);
            animation.setDuration(1300);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {

        return title9.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView titleTextView1111;

        ImageView flagImageView1;
        ImageView flagImageView9;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId9);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId9);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId99);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId999);
            titleTextView1111=itemView.findViewById(R.id.tumi9);

            flagImageView1 = itemView.findViewById(R.id.myImageViewId9);
            flagImageView9=itemView.findViewById(R.id.imageTumi9);


        }
    }





}
