package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Discount extends AppCompatActivity implements View.OnClickListener {
    private EditText original;
    private EditText dscnt;
    private TextView finalPrice;
    private TextView msgDsc;
    private Button dscBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount);

        original = (EditText) findViewById(R.id.original);
        dscnt = (EditText) findViewById(R.id.dscnt);
        finalPrice = (TextView) findViewById(R.id.finalPrice);
        msgDsc = (TextView) findViewById(R.id.msgDsc);
        dscBtn = (Button) findViewById(R.id.dscBtn);

        dscBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String org = original.getText().toString();
        String dsc = dscnt.getText().toString();
        double num1,num2,sale,savePrice;
        num1= Double.parseDouble(org);
        num2 = Double.parseDouble(dsc);
        //num2 = num2 * num1;
        sale = (num1 * num2) / 100.00;
        savePrice = num1 - sale;
        finalPrice.setText("Final Price: "+savePrice);
        msgDsc.setText("You save "+sale);
    }
}
