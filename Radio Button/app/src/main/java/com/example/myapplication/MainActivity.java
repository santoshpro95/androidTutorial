package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton green;
    RadioButton red;
    RadioButton blue;
    LinearLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        green = (RadioButton) findViewById(R.id.male);
        red = (RadioButton) findViewById(R.id.female);
        blue = (RadioButton) findViewById(R.id.demo);
        background =  (LinearLayout) findViewById(R.id.background);

        background.setBackgroundColor(Color.BLUE);

        green.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b) changeBackgroundColor(1);

            }
        });

        red.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) changeBackgroundColor(2);
            }
        });

        blue.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) changeBackgroundColor(3);
            }
        });



    }

    void changeBackgroundColor(int id){
        if(id == 1) background.setBackgroundColor(Color.GREEN);
        if(id == 2) background.setBackgroundColor(Color.RED);
        if(id == 3) background.setBackgroundColor(Color.BLUE);

    }
}