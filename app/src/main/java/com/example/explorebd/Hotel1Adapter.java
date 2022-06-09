package com.example.explorebd;

import android.content.ClipData;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;

import java.util.List;

public class Hotel1Adapter extends RecyclerView.Adapter<Hotel1Adapter.MyViewHolder>  {




    Context context;
    String [] title1;
    String []desc1;
    // add two

    String [] title11;
    String [] title111;
    String[]tumi1;
    //String[]title13;


    int[]  images;
    int [] images1;

    //day night mode
    boolean isDark=false;

    public Hotel1Adapter(Context context, String [] title1, String[] desc1, String[] title11, String[] title111, String[] tumi1, int[] images,int[]images1, boolean isDark) {
        this.context = context;
        this.title1 = title1;
        this.desc1 = desc1;
        this.title11 = title11;
        this.title111 = title111;
        this.tumi1=tumi1;
        this.images = images;
        this.images1=images1;
        this.isDark = isDark;
        //this.lastPosition = lastPosition;
    }

    //animation
    private int lastPosition=-1;

    public Hotel1Adapter(Context context, String[] title1, String[] desc,String [] title11, String [] title111,String[] tumi1, int[] images, int[] images1) {
        this.context = context;
        this.title1 = title1;
         this.desc1 = desc;
         //add two

        this.title11=title11;
        this.title111=title111;
        this.tumi1=tumi1;
        //this.title13=title13;



         this.images = images;
        this.images1=images1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel1_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title1[i]);
        myViewholder.descTextView1.setText(desc1[i]);

        //add two
        myViewholder.titleTextView11.setText(title11[i]);
        myViewholder.titleTextView111.setText(title111[i]);
        myViewholder.titleTextView1111.setText(tumi1[i]);
       // myViewholder.titleTextView13.setText(title13[i]);



        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.flagImageView9.setImageResource(images1[i]);




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

        return title1.length;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView titleTextView1111;
        //TextView titleTextView13;


        ImageView flagImageView1;
        ImageView flagImageView9;

        //day night mode
        LinearLayout container;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId1);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId1);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId11);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId111);
            titleTextView1111=itemView.findViewById(R.id.tumi1);
            //titleTextView13=itemView.findViewById(R.id.titleTextViewId13);


            flagImageView1 = itemView.findViewById(R.id.myImageViewId1);
            flagImageView9=itemView.findViewById(R.id.imageTumi1);

            //day night mode
            container=itemView.findViewById(R.id.container);

            if(isDark){
                setDarkTheme();
            }


        }

        //day night mode
        private void setDarkTheme(){

            container.setBackgroundResource(R.drawable.card_bg_dark);

        }

    }





}
