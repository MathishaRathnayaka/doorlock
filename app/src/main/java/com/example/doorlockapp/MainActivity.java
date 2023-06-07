package com.example.doorlockapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonON;
    Button buttonOFF;

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonON = (Button) findViewById(R.id.button1);
        buttonOFF = (Button) findViewById(R.id.button2);

        buttonON.setOnClickListener((View.OnClickListener) this);
        buttonOFF.setOnClickListener((View.OnClickListener) this);

    }




}