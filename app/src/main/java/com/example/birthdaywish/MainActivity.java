package com.example.birthdaywish;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        EditText editname = findViewById(R.id.edname);
        Button button =findViewById(R.id.btnEnter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editname.getText().toString();
                Intent intent = new Intent(MainActivity.this,Wish_Activity.class);
                intent.putExtra("nameFromFistACtivity",name);
                startActivity(intent);
            }
        });


    }
}