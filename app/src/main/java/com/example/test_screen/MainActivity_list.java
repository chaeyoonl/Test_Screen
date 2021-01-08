package com.example.test_screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity_list extends AppCompatActivity {
    String date;
    TextView textView, textView2;
    Button date_btn1, date_btn2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Button btns1 = (Button) findViewById(R.id.btns1);
        btns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button date_btn1 = (Button) findViewById(R.id.date_btn1);
        textView = (TextView)findViewById(R.id.date);
        textView2 = (TextView)findViewById(R.id.date2);
        CalendarView calendarView = findViewById(R.id.calendarView);

        //////////////////////
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                month += 1;

                date = "시작 날짜 = " + year +"." +  month + "." + dayOfMonth;

            }
        });



        date_btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView.setText(date);   // 년월일을 date 에 넣어서 textView로 출력한다


            }
        });

        Button date_btn2 = (Button) findViewById(R.id.date_btn2);
        date_btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView2.setText(date);   // 년월일을 date 에 넣어서 textView로 출력한다


            }
        });

    }
}
