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

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {


    private static MainAdapter.ClickListener clickListener;

    Context context;
    String []place;
    String []place1;
    // add two

    String [] place2;


    int[]  images;

    //animation
   // private int lastPosition=-1;


    public MainAdapter(Context context, String[] place, String[] place1,String [] place2, int[] images) {
        this.context = context;
        this.place = place;
        this.place1 = place1;
        //add two

        this.place2=place2;



        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.main_layout,viewGroup,false);


        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.placeTextView.setText(place[i]);
        myViewholder.placeTextView1.setText(place1[i]);

        //add two
        myViewholder.placeTextView2.setText(place2[i]);
       // myViewholder.titleTextView111.setText(title222[i]);


        myViewholder.flagImageView1.setImageResource(images[i]);




        //animation
        //setAnimation(myViewholder.itemView,i);


    }

    //animation
   // public void setAnimation(View viewToAnimate,int position){

      //  if(position>lastPosition){
          //  ScaleAnimation animation = new ScaleAnimation(0.0f,1.0f,0.0f,1.0f,
                 //   Animation.RELATIVE_TO_SELF,0.5f,
                 //   Animation.RELATIVE_TO_SELF,0.5f);
           // animation.setDuration(1500);
           // viewToAnimate.startAnimation(animation);
           // lastPosition=position;
  //      }


  //  }



    @Override
    public int getItemCount() {

        return place.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView placeTextView;
        TextView placeTextView1;
        // add two

        TextView placeTextView2;
       // TextView titleTextView111;

        ImageView flagImageView1;

        public MyViewHolder(View itemView) {

            super(itemView);

            placeTextView = itemView.findViewById(R.id.placeTextViewId);
            placeTextView1 = itemView.findViewById(R.id.placeTextViewId1);

            //add two
            placeTextView2 = itemView.findViewById(R.id.placeTextViewId2);
          //  titleTextView111 = itemView.findViewById(R.id.titleTextViewId222);

            flagImageView1 = itemView.findViewById(R.id.myImageViewIdd);

            //onclick listener
            itemView.setOnClickListener(this);


        }

        //onclick listener
        @Override
        public void onClick(View v) {

            clickListener.onItemClick(getAdapterPosition(),v);



        }
    }

    //onclick listener

    public interface ClickListener{

        void onItemClick(int position,View v);
    }

    public void setOnItemClickListener(MainAdapter.ClickListener clickListener){


        MainAdapter.clickListener = clickListener;
    }






}
