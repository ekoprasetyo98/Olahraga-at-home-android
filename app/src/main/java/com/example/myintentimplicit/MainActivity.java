package com.example.myintentimplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDialPhone = findViewById(R.id.id_dial);
        btnDialPhone.setOnClickListener(this);

        Button btnwa = findViewById(R.id.id_wa);
        btnwa.setOnClickListener(this);

        Button push = findViewById(R.id.push);
        push.setOnClickListener(this);

        Button situp = findViewById(R.id.situp);
        situp.setOnClickListener(this);

        Button skipingbtn = findViewById(R.id.skiping);
        skipingbtn.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.id_dial:
                String phoneNumber = "089630592265";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.id_wa:
                Uri url = Uri.parse("https://api.whatsapp.com/send?phone=6289630592265");
                Intent whatsapp = new Intent(Intent.ACTION_VIEW, url);
                startActivity(whatsapp);
                break;

            case R.id.push:
                Intent pushup = new Intent(getApplicationContext(), pushActivity.class);
                startActivity(pushup);
                break;

            case R.id.situp:
                Intent situp = new Intent(getApplicationContext(), situpActivity.class);
                startActivity(situp);
                break;
            case R.id.skiping:
                Intent skiping = new Intent(getApplicationContext(), skipingActivity.class);
                startActivity(skiping);
                break;
        }
        }
    }

