package com.jackson.demoapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void whenClicked(View view)
    {
        EditText editText = (EditText)findViewById(R.id.editText);
        Log.i("info",editText.getText().toString());
    }
}
