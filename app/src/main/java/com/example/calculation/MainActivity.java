package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    TextView tx1;
    Button b1,b2;
    String no1,no2,no3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.no1);
        t2 = findViewById(R.id.no2);
        tx1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.button);
        b2 =findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no1 = t1.getText().toString();
                no2 = t2.getText().toString();

                if(t1.getText().toString().equals("") || t2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    t1.getText().toString();
                    t2.getText().toString();
                    double no1 = Double.valueOf(t1.getText().toString());
                    double no2 = Double.valueOf(t2.getText().toString());
                    double no3;
                    no3 = no1-no2;
                    tx1.setText(String.valueOf(no3));
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "Checkout";//Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                no3= tx1.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Value",no3);
                startActivity(intent);
                finish();
            }
        });


    }

}