package com.jackson.imagedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void swap(View view){
        ImageView girl = (ImageView) findViewById(R.id.girl);
        girl.setImageResource(R.drawable.test_image2);
        Toast.makeText(MainActivity.this,"swapped",Toast.LENGTH_SHORT).show();
        Log.i("swapped:", "Yes!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
