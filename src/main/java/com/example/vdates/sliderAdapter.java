package com.example.vdates;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class sliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layout;

    public sliderAdapter(Context context) {
        this.context = context;
    }
    public String [] slide_heading={
            "Affinity in hobbies/interests",
            "Conflict management",
            "Forgiveness",
            "Social support",
            "Amazing!"
    };
    public String [] footerTitleSa={
            "In common",
            "Resolution satisfaction average",
            "Forgiveness agreement average",
            "Social situation satisfaction average",
            "Final affinity: 91%"
    };

    public int[] imagesSlide={
            R.drawable.percentage,
            R.drawable.percentage2,
            R.drawable.percentage3,
            R.drawable.percentage4,
            R.drawable.congratulations
    };


    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layout= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=  layout.inflate(R.layout.slidelayout1,container,false);
        TextView text= view.findViewById(R.id.headerName);
        LinearLayout lin1= view.findViewById(R.id.footer);
        TextView txtfoot= lin1.findViewById(R.id.footerText);
        txtfoot.setText(footerTitleSa[position]);
        ImageView img= view.findViewById(R.id.imageView2);
        img.setImageResource(imagesSlide[position]);
        text.setText(slide_heading[position]);
        if(position==1){
            lin1.removeView(view.findViewById(R.id.tags));
            ImageView imgFooter= new ImageView(context);
            imgFooter.setImageResource(R.drawable.fourstars);
            lin1.addView(imgFooter);
            lin1.setGravity(View.FOCUS_LEFT);
        }
        if(position==2){
            lin1.removeView(view.findViewById(R.id.tags));
            ImageView imgFooter= new ImageView(context);
            imgFooter.setImageResource(R.drawable.fivestars);
            lin1.addView(imgFooter);
            lin1.setGravity(View.FOCUS_LEFT);
        }
        if(position==3){
            lin1.removeView(view.findViewById(R.id.tags));
            ImageView imgFooter= new ImageView(context);
            imgFooter.setImageResource(R.drawable.halfstars);
            lin1.addView(imgFooter);
            lin1.setGravity(View.FOCUS_LEFT);
        }
        if(position==4){
            lin1.removeView(view.findViewById(R.id.tags));
            TextView textFinal= new TextView(context);
            textFinal.setTextColor(Color.WHITE);
            textFinal.setTextSize(16);
            textFinal.setText("You have a nice compatibility with Alysha. Not only you have same interests, you also share the same mindset in relationships");
            lin1.addView(textFinal);
            lin1.setGravity(View.FOCUS_LEFT);
            txtfoot.setTypeface(null,Typeface.BOLD);
        }
        container.addView(view);
        return view;
    }

}
