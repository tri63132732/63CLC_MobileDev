package com.nguyentrongtri.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_Name;
    Button buttonSayHi, buttonXinChao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    void findViews(){
        // Step 1: find name, sẵn để sau này dùng
        //Ở các điều khiển khác nhau
        editText_Name= findViewById(R.id.name);
        buttonSayHi = findViewById(R.id.btnHello);
        buttonXinChao=findViewById(R.id.btnHello1);
    }
    public void XuLyNoiHello(View v){

        // Step 2
            // Get string
        String strname = editText_Name.getText().toString();
        String strThongBao="Nice to see you \n" + strname;
        Toast.makeText(this,strThongBao,Toast.LENGTH_LONG).show();
    }
    public void XuLyNoiHello1(View v){
        // Step 2
        // Get string
        String strname = editText_Name.getText().toString();
        String strThongBao="Chào bạn \n" + strname;
        Toast.makeText(this,strThongBao,Toast.LENGTH_LONG).show();
    }

}