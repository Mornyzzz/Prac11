package com.example.prac11;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class BlankFragment extends Fragment {

    public BlankFragment() {
        super(R.layout.fragment_blank);
    }


    @SuppressLint("ResourceType")
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank, container, false);


        View imageView = v.findViewById(R.id.imageView2);
        Animation rotateAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.rotation);
        imageView.startAnimation(rotateAnimation);


        Button button1 = v.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                FragmentTransaction fTrans = getFragmentManager().beginTransaction().setCustomAnimations(
                        R.anim.slide_in,
                        R.anim.fade_out,
                        R.anim.fade_in,
                        R.anim.slide_out
                );
                fTrans.replace(R.id.fragment1, new ListFragment());
                fTrans.addToBackStack(null);
                fTrans.commit();
            }
        });

        Button button2 = v.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                FragmentTransaction fTrans = getFragmentManager().beginTransaction().setCustomAnimations(
                        R.anim.scale_in,
                        R.anim.classic,
                        R.anim.classic,
                        R.anim.scale_out
                );
                fTrans.replace(R.id.fragment1, new RecyclerFragment());
                fTrans.addToBackStack(null);
                fTrans.commit();
            }
        });
        return v;
    }
}

