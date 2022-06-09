package com.example.explorebd;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;

public class Hotel10Adapter extends RecyclerView.Adapter<Hotel10Adapter.MyViewHolder> {



    Context context;
    String []title10;
    String []desc10;
    // add two

    String [] title1010;
    String [] title101010;
    String[]tumi10;


    int[]  images;
    int[] images10;

    public Hotel10Adapter(Context context, String[] title10, String[] desc10,String [] title1010, String [] title101010,String[]tumi10, int[] images,int[] images10) {
        this.context = context;
        this.title10 = title10;
        this.desc10 = desc10;
        //add two

        this.title1010=title1010;
        this.title101010=title101010;
        this.tumi10=tumi10;


        this.images = images;
        this.images10 = images10;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel10_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title10[i]);
        myViewholder.descTextView1.setText(desc10[i]);

        //add two
        myViewholder.titleTextView11.setText(title1010[i]);
        myViewholder.titleTextView111.setText(title101010[i]);
        myViewholder.tumi10.setText(tumi10[i]);


        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.images10.setImageResource(images10[i]);




    }

    @Override
    public int getItemCount() {

        return title10.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView tumi10;

        ImageView flagImageView1;
        ImageView images10;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId10);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId10);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId1010);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId101010);
            tumi10 = itemView.findViewById(R.id.tumi10);

            flagImageView1 = itemView.findViewById(R.id.myImageViewId10);
            images10 = itemView.findViewById(R.id.imageTumi10);


        }
    }





}
