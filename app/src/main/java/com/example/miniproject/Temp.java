package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Temp extends AppCompatActivity implements View.OnClickListener {
    private EditText inF,inC,inK;
    private TextView f2c,f2k,c2f,c2k,k2c,k2f;
    private Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        inF = (EditText) findViewById(R.id.inF);
        inC = (EditText) findViewById(R.id.inC);
        inK = (EditText) findViewById(R.id.inK);

        f2c = (TextView) findViewById(R.id.f2c);
        f2k = (TextView) findViewById(R.id.f2k);
        c2f = (TextView) findViewById(R.id.c2f);
        c2k = (TextView) findViewById(R.id.c2k);
        k2c = (TextView) findViewById(R.id.k2c);
        k2f = (TextView) findViewById(R.id.k2f);

        calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String f = inF.getText().toString();
        String c = inC.getText().toString();
        String k = inK.getText().toString();

        double ff,fc,fk,cc,cf,ck,kk,kc,kf;


        int flagF,flagK,flagC;
        flagF = flagC = flagK = 1;

        if(f.equals(""))
        {
            flagF=0;
        }
        else if(c.equals(""))
        {
            flagC=0;
        }

        else if(k.equals(""))
        {
            flagK=0;
        }


        if(flagF!=0)
        {
            ff = Double.parseDouble(f);
            fc= (5.0/9.0)*(ff-32);
            fk = (5.0/9.0)*(ff-32) +273;
            f2c.setText(""+fc);
            f2k.setText(""+fk);
        }

        if(flagC!=0)
        {
            cc = Double.parseDouble(c);
            cf= (9.0/5.0)*cc + 32;
            ck = cc + 273;
            c2f.setText(""+cf);
            c2k.setText(""+ck);
        }

        if(flagK!=0)
        {
            kk = Double.parseDouble(k);
            kf = (9.0/5.0)*(kk-273) + 32;
            kc = kk-273;
            k2c.setText(""+kc);
            k2f.setText(""+kf);
        }

    }
}
