package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView t1,t2;
    EditText e1;
    Button b1;
    String total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 =findViewById(R.id.textView2); // get from 1st activity
        t2 = findViewById(R.id.textView3); // final answer
        e1 = findViewById(R.id.code);
        b1 = findViewById(R.id.button2);

        Bundle b = getIntent().getExtras();
        assert b != null;
        total = b.getString("Value");
        t1.setText(String.valueOf(total));


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().equals("a")){
                    double no2 = Double.valueOf(t1.getText().toString());
                    double m = 75.0/100.0;
                    double no4 = no2*m;
                    t2.setText(String.valueOf(no4));
                }
                else {
                    double Net = Double.valueOf(t1.getText().toString());
                    t2.setText(String.valueOf(Net));
                }
            }
        });


    }
}