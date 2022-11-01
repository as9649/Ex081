package com.example.ex081;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tV1, tV2, tV3;
    Button btn4;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tV1=findViewById(R.id.tV1);
        tV2=findViewById(R.id.tV2);
        tV3=findViewById(R.id.tV3);
        btn4=findViewById(R.id.btn4);
        Intent gi=getIntent();
        int count1= gi.getIntExtra("count1", 0);
        int count2= gi.getIntExtra("count2", 0);
        tV2.setText("Player1: "+count1);
        tV3.setText("Player2: "+count2);
        if (count1>count2){
            tV1.setText("PLAYER 1!");
        }
        else if (count1<count2){
            tV1.setText("PLAYER 2!");
        }
        else{
            tV1.setText("TEKO!");
        }
        btn4.setOnClickListener(view -> finish());
    }
}