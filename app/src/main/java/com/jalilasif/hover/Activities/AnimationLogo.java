package com.jalilasif.hover.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.jalilasif.hover.R;

import java.util.Objects;

public class AnimationLogo extends AppCompatActivity {

    ImageView imageView_hover_Logo;
    TextView textView_hover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_animation_logo);

        imageView_hover_Logo = findViewById(R.id.imageView);
        textView_hover = findViewById(R.id.textView);
        animations();

        new Handler().postDelayed(() -> {
            Intent i = new Intent(AnimationLogo.this,PhoneNumberActivity.class);
            startActivity(i);
        }, 6000);
    }


    public void animations(){

        Animation scale_animation = AnimationUtils.loadAnimation(this,R.anim.scale_animation);
        imageView_hover_Logo.startAnimation(scale_animation);

        Animation bottom_animation = AnimationUtils.loadAnimation(this,R.anim.bottom_to_top);
        textView_hover.startAnimation(bottom_animation);

    }

}