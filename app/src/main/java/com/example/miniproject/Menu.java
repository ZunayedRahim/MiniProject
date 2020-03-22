package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button age;
    private Button bmi;
    private Button counter;
    private Button discount;
    private Button percent;
    private Button temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        age = (Button) findViewById(R.id.age);
        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Age.class);
                startActivity(intent);
            }
        });

        bmi = (Button) findViewById(R.id.bmi);
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, BMI.class);
                startActivity(intent);
            }
        });

        counter = (Button) findViewById(R.id.counter);
        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Counter.class);
                startActivity(intent);
            }
        });

        temp = (Button) findViewById(R.id.temp);
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Temp.class);
                startActivity(intent);
            }
        });

        discount = (Button) findViewById(R.id.discount);
        discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Discount.class);
                startActivity(intent);
            }
        });

        percent = (Button) findViewById(R.id.percent);
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Percentage.class);
                startActivity(intent);
            }
        });
    }
}
