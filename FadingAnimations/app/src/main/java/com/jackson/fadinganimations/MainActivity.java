package com.jackson.fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView redBag =(ImageView)findViewById(R.id.redBag);

        //redBag.animate().alpha(1f).translationYBy(1000).setDuration(2000);translates image in the negative y direction.
        redBag.animate().alpha(1f).rotation(-1800f).setDuration(2000); //rotates image in anti-clockwise direction by 1800 degrees.
        redBag.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        //redBag.animate().alpha(1f).scaleX(1f).scaleY(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView greenBag =(ImageView)findViewById(R.id.greenBag);
        greenBag.animate().alpha(0f).translationXBy(-1000f).setDuration(2000); //translate image in a negative X direction.
        
    }
}
