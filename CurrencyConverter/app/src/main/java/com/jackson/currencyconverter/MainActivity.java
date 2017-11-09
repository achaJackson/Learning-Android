package com.jackson.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    public void convert(View buttonView) {
        EditText amountInDollar = (EditText) findViewById(R.id.amountInDollar);
        Double amountInDollarDouble = Double.parseDouble(amountInDollar.getText().toString());
        Double amountInFranc = 600 * amountInDollarDouble;
        Toast.makeText(MainActivity.this,String.format("%.2f",amountInFranc)+"FCFA",Toast.LENGTH_SHORT).show();
        Log.i("Converted:","Yes!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
