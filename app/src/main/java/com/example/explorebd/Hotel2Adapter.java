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

public class Hotel2Adapter extends RecyclerView.Adapter<Hotel2Adapter.MyViewHolder> {



    Context context;
    String []title2;
    String []desc2;
    // add two

    String [] title22;
    String [] title222;
    String[] tumi2;
   // String [] title23;
    int[]  images;
    int[] images2;

    //animation
    private int lastPosition=-1;


    public Hotel2Adapter(Context context, String[] title2, String[] desc2,String [] title22, String [] title222,String[] tumi2, int[] images,int[] images2) {
        this.context = context;
        this.title2 = title2;
        this.desc2 = desc2;
        //add two

        this.title22=title22;
        this.title222=title222;
        this.tumi2 = tumi2;
      //  this.title23=title23;
        this.images = images;
        this.images2 = images2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.hotel2_layout,viewGroup,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewholder, int i) {


        myViewholder.titleTextView1.setText(title2[i]);
        myViewholder.descTextView1.setText(desc2[i]);

        //add two
        myViewholder.titleTextView11.setText(title22[i]);
        myViewholder.titleTextView111.setText(title222[i]);
        myViewholder.titleTextView2222.setText(tumi2[i]);
      //  myViewholder.titleTextView23.setText(title23[i]);

        myViewholder.flagImageView1.setImageResource(images[i]);
        myViewholder.flagImageView2.setImageResource(images2[i]);

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

        return title2.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView1;
        TextView descTextView1;
        // add two

        TextView titleTextView11;
        TextView titleTextView111;
        TextView titleTextView2222;
       // TextView titleTextView23;

        ImageView flagImageView1;
        ImageView flagImageView2;

        public MyViewHolder(View itemView) {

            super(itemView);

            titleTextView1 = itemView.findViewById(R.id.titleTextViewId2);
            descTextView1 = itemView.findViewById(R.id.descriptionTextViewId2);

            //add two
            titleTextView11 = itemView.findViewById(R.id.titleTextViewId22);
            titleTextView111 = itemView.findViewById(R.id.titleTextViewId222);
            titleTextView2222 = itemView.findViewById(R.id.tumi2);
            //titleTextView23=itemView.findViewById(R.id.titleTextViewId23);
            flagImageView1 = itemView.findViewById(R.id.myImageViewId2);
            flagImageView2 = itemView.findViewById(R.id.imageTumi2);


        }
    }
}
