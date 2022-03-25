package com.example.lab_4;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.FrameMetricsAggregator;

import android.graphics.drawable.AnimationDrawable;
import android.location.GnssAntennaInfo;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private Button startStopButton;
    private ImageView img;
    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startStopButton = findViewById(R.id.button);
        img = findViewById(R.id.imageView);
        img.setBackgroundResource(R.drawable.rabbit_animation);
        frameAnimation = (AnimationDrawable)img.getBackground();
        frameAnimation.setOneShot(false);

        startStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (frameAnimation.isRunning()) {
                    frameAnimation.stop();
                } else {
                    frameAnimation.start();
                }
            }
        });

        frameAnimation.start();
    }
}
