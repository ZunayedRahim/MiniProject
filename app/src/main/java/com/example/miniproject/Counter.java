package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Counter extends AppCompatActivity {
    int counter=0;
    private TextView count;
    private Button plus;
    private Button minus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        count = (TextView) findViewById(R.id.Count);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++counter;
                count.setText(""+counter);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                --counter;
                count.setText(""+counter);
            }
        });
    }
}
