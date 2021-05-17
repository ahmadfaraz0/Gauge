package com.example.gauge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.Guard;

import de.nitri.gauge.Gauge;

public class MainActivity extends AppCompatActivity {

    int curValue;
    Gauge gauge;
    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        Gauge gauge = findViewById(R.id.gauge);

        curValue = 50;
        gauge.setValue(curValue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (curValue > 0) {
                    curValue = curValue - 10;
                    gauge.moveToValue(curValue);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (curValue < 100) {
                    curValue = curValue + 10;
                    gauge.moveToValue(curValue);
                }
            }
            
        });
    }
}