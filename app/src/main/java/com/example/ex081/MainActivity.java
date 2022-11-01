package com.example.ex081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    private int count1,count2;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        count1=0;
        count2=0;
        si = new Intent(this, MainActivity2.class);
        btn1.setBackgroundColor(Color.RED);
        btn1.setOnClickListener(view -> count1++);

        btn2.setOnClickListener(view -> {
            si.putExtra("count1",count1);
            si.putExtra("count2", count2);
            count1=0;
            count2=0;
            startActivity(si);
        });

        btn3.setOnLongClickListener(view -> {
            count2+=2;
            return false;
        });
    }

}