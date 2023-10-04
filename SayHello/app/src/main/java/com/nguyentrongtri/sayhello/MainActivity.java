package com.nguyentrongtri.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void XuLyNoiHello(View v){
        // Step 1: find name
        EditText editText_Name= findViewById(R.id.name);
        // Step 2
            // Get string
        String strname = editText_Name.getText().toString();
        String strThongBao="Nice to see you \n" + strname;
        Toast.makeText(this,strThongBao,Toast.LENGTH_LONG).show();
    }
    public void XuLyNoiHello1(View v){
        // Step 1: find name
        EditText editText_Name= findViewById(R.id.name);
        // Step 2
        // Get string
        String strname = editText_Name.getText().toString();
        String strThongBao="Chào bạn \n" + strname;
        Toast.makeText(this,strThongBao,Toast.LENGTH_LONG).show();
    }

}