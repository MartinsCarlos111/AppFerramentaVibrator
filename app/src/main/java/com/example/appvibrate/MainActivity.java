package com.example.appvibrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnVibra);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botaoClick(v);
                Intent HistoryScreen = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(HistoryScreen);
            }
        });
    }
    public void botaoClick(View v) {
        Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        long milliseconds = 2000;
        if(vibrator != null && vibrator.hasVibrator()) {
            vibrator.vibrate(milliseconds);
        }
    }
}