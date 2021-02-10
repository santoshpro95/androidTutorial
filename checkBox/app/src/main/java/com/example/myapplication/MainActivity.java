package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    Button button;
    EditText editText;
    CheckBox checkBox;
    String hashCode;
    TextView showHashCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.background);
        button = (Button) findViewById(R.id.submit);
        editText = (EditText) findViewById(R.id.getColor);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        showHashCode = (TextView)findViewById(R.id.showHashCode) ;



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data = editText.getText().toString();
                if(data.equals("")){
                    return;
                }

                if(data.length() == 6) {
                    hashCode = "#"+data;
                    linearLayout.setBackgroundColor(Color.parseColor(hashCode));
                    checkBox.setChecked(false);
                    showHashCode.setText(hashCode);
                }
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(checkBox.isChecked()){
                    linearLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                    showHashCode.setText("#ffffff");
                }else{
                    editText.setText("");
                    showHashCode.setText(hashCode);
                    linearLayout.setBackgroundColor(Color.parseColor(hashCode));
                }


            }
        });

    }
}