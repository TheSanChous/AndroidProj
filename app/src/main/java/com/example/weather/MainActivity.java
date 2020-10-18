package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] values = new String[]
        {
            "Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
    }
}