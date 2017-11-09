package com.jackson.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity{
    class Number{
        int number;

        public boolean isSquare(){
            double squareRoot = Math.sqrt(number);
            if (squareRoot == Math.floor(squareRoot))
                return true;
            else
                return false;
        }

        public boolean isTriangular(){
            int x = 1;
            int triangularNumber = 1;
            while (triangularNumber > 1){
                x++;
                triangularNumber = triangularNumber + x;
            }
            if (triangularNumber == number)
                return true;
            else
                return false;
        }

        public void checkNumber(View view)
        {
            String message = "";
            EditText usersNumber = (EditText)findViewById(R.id.usersNumber);

            if (usersNumber.getText().toString().isEmpty())
                message = "Please enter a number.";
            else
            {
                Number myNumber = new Number();
                myNumber.number = Integer.parseInt(usersNumber.getText().toString());
                if (myNumber.isSquare()){
                    if (myNumber.isTriangular()){
                        message = myNumber.number + " is both triangular and square";
                    }
                    else
                        message  = myNumber.number + " is square, but not triangular";
                }
                else
                {
                    if (myNumber.isTriangular()){
                    message = myNumber.number + " is triangular but not square";
                }
                else
                    {
                        message = myNumber.number + " is neither square nor triangular"
                    }
                }
            }
        }
    }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
}
