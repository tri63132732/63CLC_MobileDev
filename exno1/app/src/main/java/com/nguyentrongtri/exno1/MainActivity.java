package com.nguyentrongtri.exno1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button changeColor;
    private Button changeSize;
    private TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=findViewById(R.id.textView);
        changeColor=findViewById(R.id.buttonChangeColor);
        changeSize=findViewById(R.id.buttonChangeSize);
        changeSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float currentSize = view.getTextSize();
                view.setTextSize(currentSize + 5);
            }
        });
        changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setTextColor(android.R.color.holo_orange_dark);
            }
        });
    }
}