package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity implements View.OnClickListener {
    private EditText feet,inch,weight;
    private TextView bmi;
    private Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        feet = (EditText) findViewById(R.id.feet);
        inch = (EditText) findViewById(R.id.inch);
        weight = (EditText) findViewById(R.id.weight);
        bmi = (TextView) findViewById(R.id.bmi);
        calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String f = feet.getText().toString();
        String i = inch.getText().toString();
        String w = weight.getText().toString();

        double num1,num2,num3,res;
        num1 = Double.parseDouble(f);
        num2 = Double.parseDouble(i);
        num3 = Double.parseDouble(w);

        num1*=12;
        num2+=num1;
        num3*=2.2046;
        res = ((num3) / (num2*num2)) * 703;
        double roundOff = Math.round(res * 100.0) / 100.0;
        bmi.setText("BMI : "+roundOff);
    }
}
