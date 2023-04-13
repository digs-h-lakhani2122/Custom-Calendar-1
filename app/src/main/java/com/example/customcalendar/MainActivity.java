package com.example.customcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleCalendar simpleCalendar = findViewById(R.id.square_day);
        Calendar calendar = Calendar.getInstance();
        // Get current month
        int month = calendar.get(Calendar.MONTH);
        //Get current Year
        int year = calendar.get(Calendar.YEAR);
        simpleCalendar.setUserCurrentMonthYear(month, year);
        simpleCalendar.setCallBack(view -> {
            // Create on Click event here.
            Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        });

    }
}