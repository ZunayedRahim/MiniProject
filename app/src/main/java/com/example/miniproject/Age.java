package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;



public class Age extends AppCompatActivity implements View.OnClickListener {
    private  TextView result,yearsss,monthsss,daysss;
    private Button cdob,dob,calculate;
    private DatePickerDialog datePickerDialog;
    private TextView cdobText,dobText;
    private int startYear;
    private int startMonth;
    private int startDay;
    private int endYear,endDay,endMonth;
    private int year,month,day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        dob = (Button) findViewById(R.id.dob);
        cdob = (Button) findViewById(R.id.cdob);
        calculate = (Button) findViewById(R.id.calculate);
        cdobText = (TextView) findViewById(R.id.cdobText);
        yearsss = (TextView) findViewById(R.id.yearsss);
        monthsss = (TextView) findViewById(R.id.monthsss);
        daysss = (TextView) findViewById(R.id.daysss);
        dobText = (TextView) findViewById(R.id.dobText);
        result = (TextView) findViewById(R.id.result);
        dob.setOnClickListener(this);
        cdob.setOnClickListener(this);
        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        DatePicker datePicker = new DatePicker(this);
        int currentDay = datePicker.getDayOfMonth();
        int currentMonth = datePicker.getDayOfMonth();
        int currentYear = datePicker.getYear();
        switch(v.getId())
        {
            case R.id.dob:

                datePickerDialog = new DatePickerDialog(this,

                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                                dob.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                                startYear= year;
                                startDay= dayOfMonth+1;
                                startMonth= month;
                            }
                        },currentYear, currentMonth, currentDay);
                datePickerDialog.show();
                break;


            case R.id.cdob:
                datePickerDialog = new DatePickerDialog(this,

                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                                cdob.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                                endYear= year;
                                endDay= dayOfMonth+1;
                                endMonth= month;
                            }
                        },currentYear, currentMonth, currentDay);
                datePickerDialog.show();
                break;

            case R.id.calculate:
                System.out.println(startDay+"/"+startMonth+"/"+startYear);
                System.out.println(endDay+"/"+endMonth+"/"+endYear);

                year=0;
                month=0;
                day=0;

                //Get difference between years
                year = endYear - startYear;

                //Get difference between months
                month = endMonth - startMonth;

                //if month difference is in negative then reduce years by one
                //and calculate the number of months.
                if (month < 0)
                {
                    year--;
                    month = 12 - startMonth + endMonth;
                    if (endDay < startDay)
                        month--;
                } else if (month == 0 && endDay < startDay)
                {
                    year--;
                    month = 11;
                }

                //Calculate the days
                if (endDay > startDay)
                    day = endDay - startDay;
                else if (endDay < startDay)
                {
                    int today = endMonth;
                    endMonth--;
                    //
                    if(endMonth==1 || endMonth==3 || endMonth==5 || endMonth==7 || endMonth==8 || endMonth==10 || endMonth==12)
                    {
                        day = 31 -startDay+ today;
                    }
                    else if(endMonth==4 || endMonth==6 || endMonth==9 || endMonth==11 )
                    {
                        day = 30 -startDay+ today;
                    }
                    else if(endMonth == 2)
                    {
                        day = 28 -startDay+ today;
                    }
                }
                else
                {
                    day = 0;
                    if (month == 12)
                    {
                        year++;
                        month = 0;
                    }
                }
                //Create new Age object
                result.setText("Age: "+year+" Years "+month+"Months "+day+"Days");
                yearsss.setText(""+year);
                monthsss.setText(""+month);
                daysss.setText(""+day);
                break;
        }




    }



}
