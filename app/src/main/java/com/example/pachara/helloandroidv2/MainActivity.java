package com.example.pachara.helloandroidv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.view.View;

import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);

        Button btn3 = (Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(this);

        Button btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(this);

        Button btn5 = (Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(this);

        Button btn6 = (Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(this);

        Button btn7 = (Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(this);

        Button btn8 = (Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(this);

        Button btn9 = (Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(this);

        Button btn0 = (Button) findViewById(R.id.button_0);
        btn0.setOnClickListener(this);

        Button btnC = (Button) findViewById(R.id.clear_button);
        btnC.setOnClickListener(this);
    }
    String Num = null;
    public void onClick(View v) {
        //Toast t = Toast.makeText(this."Hello", Toast.LENGTH_LONG);
        //t.show();
        TextView TV = (TextView) findViewById(R.id.digit_text_view);
        int id = v.getId();


        if(id == R.id.button_1){
            Num = Num+"1";
            TV.setText(Num);
        } else  if(id == R.id.button_2){
            Num = Num+"2";
            TV.setText(Num);
        } else  if(id == R.id.button_3){
            TV.setText("3");
        } else  if(id == R.id.button_4){
            TV.setText("4");
        } else  if(id == R.id.button_5){
            TV.setText("5");
        } else  if(id == R.id.button_6){
            TV.setText("6");
        } else  if(id == R.id.button_7){
            TV.setText("7");
        } else  if(id == R.id.button_8){
            TV.setText("8");
        } else  if(id == R.id.button_9){
            TV.setText("9");
        } else  if(id == R.id.button_0){
            TV.setText("0");
        } else  TV.setText("");


    }
}
