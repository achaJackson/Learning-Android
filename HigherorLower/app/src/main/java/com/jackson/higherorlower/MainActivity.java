package com.jackson.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void makeToast(String string)
    {
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_SHORT).show();
    }
    public void guess(View view){

        EditText guess = (EditText) findViewById(R.id.guessEditText);
        int value_guess = Integer.parseInt(guess.getText().toString());

        if (value_guess > randomNumber){
            makeToast("Try a lower guess");
        }
        else if (value_guess < randomNumber){
            makeToast("Try a higher guess");
        }
        else
            makeToast("Good, try again?");

            Random random = new Random();
            randomNumber = random.nextInt(20) + 1;
        Log.i("Clicked","Yes!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;

    }
}
