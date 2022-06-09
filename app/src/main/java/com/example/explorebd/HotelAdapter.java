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

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.MyViewHolder> {


    private static ClickListener clickListener;
    Context context;
    String []title;
    //int[]  images;

    public HotelAdapter(Context context, String[] title, String[] desc, int[] images) {
        this.context = context;
        this.title = title;
       // this.desc = desc;
       // this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView.setText(title[i]);
       // myViewholder.descTextView.setText(desc[i]);
      //  myViewholder.flagImageView.setImageResource(images[i]);




    }

    @Override
    public int getItemCount() {

        return title.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView titleTextView;
      //  ImageView flagImageView;

        public MyViewHolder(View itemView){

            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextViewId);
           // descTextView = itemView.findViewById(R.id.descriptionTextViewId);
            //flagImageView = itemView.findViewById(R.id.myImageViewId);

            itemView.setOnClickListener(this);



        }


        @Override
        public void onClick(View v) {

            clickListener.onItemClick(getAdapterPosition(),v);



        }
    }
    public interface ClickListener{

        void onItemClick(int position,View v);
    }

    public void setOnItemClickListener(ClickListener clickListener){


        HotelAdapter.clickListener = clickListener;
    }


}
