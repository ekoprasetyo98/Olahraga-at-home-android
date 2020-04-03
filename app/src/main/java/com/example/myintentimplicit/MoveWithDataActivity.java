package com.example.myintentimplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    private static final String EXTRA_NAME = "EXTRA_NAME" ;
    private static final String EXTRA_AGE = "EXTRA_AGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TextView btnMove = findViewById(R.id.data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "Name : " + name + ",\nYour Age : " + age;
        btnMove.setText(text);
    }
}

