package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Wish_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish);
        getSupportActionBar().hide();

        TextView textView = findViewById(R.id.tvDisplayName);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("nameFromFistACtivity");
        textView.setText("Happy Birthday "+msg);
    }
}