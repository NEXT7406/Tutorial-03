package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editTextNum1;
    EditText editTextNum2;

    String number1;
    String number2;

    TextView lblSum;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editTextNum1 =findViewById(R.id.editTextNum1);
        editTextNum2 =findViewById(R.id.editTextNum2);
        lblSum = findViewById(R.id.lblSum);

        Intent intent = getIntent();

     number1 = intent.getStringExtra("n1");
     number2 = intent.getStringExtra("n2");

        editTextNum1.setText(number1);
        editTextNum2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

    }

    public void add(View view){
        lblSum.setText(number1 + "+" + number2 + "=" + (n1+n2));


    }
    public void substract(View view){
        lblSum.setText(number1 + "-" + number2 + "=" + (n1-n2));


    }
    public void multiply(View view){
        lblSum.setText(number1 + "x" + number2 + "=" + (n1*n2));


    }
    public void divide(View view){
        lblSum.setText(number1 + "/" + number2 + "=" + (n1/n2));


    }
}