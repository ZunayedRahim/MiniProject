package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Percentage extends AppCompatActivity implements View.OnClickListener {

    private EditText percent, total;
    private Button prcntBtn;
    private TextView result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentage);

        percent = (EditText) findViewById(R.id.percent);
        total = (EditText) findViewById(R.id.total);
        prcntBtn = (Button) findViewById(R.id.prcntBtn);
        result = (TextView) findViewById(R.id.result);

        prcntBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String percentage =  percent.getText().toString();
        String totalValue =  total.getText().toString();
        double num1,num2,p,t,r;
        num1 = Double.parseDouble(percentage);
        num2 = Double.parseDouble(totalValue);
        r= (num1*num2)/100.00;
        result.setText("Result: "+r);


    }
}
