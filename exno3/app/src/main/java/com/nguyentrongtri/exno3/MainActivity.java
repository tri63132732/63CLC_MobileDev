package com.nguyentrongtri.exno3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editNumber1;
    private EditText editNumber2;
    private TextView textView;
    private Button buttonAdd;
    private Button buttonMinus;
    private Button buttonMulti;
    private Button buttonDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumber1=findViewById(R.id.number1);
        editNumber2=findViewById(R.id.number2);
        textView=findViewById(R.id.view);
        buttonAdd=findViewById(R.id.add);
        buttonMinus=findViewById(R.id.minus);
        buttonMulti=findViewById(R.id.multi);
        buttonDivide=findViewById(R.id.divide);
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(editNumber1.getText().toString());
                int number2 = Integer.parseInt(editNumber2.getText().toString());

                int result = number1 + number2;

                textView.setText(String.valueOf(result));
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(editNumber1.getText().toString());
                int number2 = Integer.parseInt(editNumber2.getText().toString());

                int result = number1 - number2;

                textView.setText(String.valueOf(result));
            }
        });
        buttonMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(editNumber1.getText().toString());
                int number2 = Integer.parseInt(editNumber2.getText().toString());

                int result = number1 * number2;

                textView.setText(String.valueOf(result));
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(editNumber1.getText().toString());
                int number2 = Integer.parseInt(editNumber2.getText().toString());

                int result = number1 / number2;

                textView.setText(String.valueOf(result));
            }
        });
    }

}