package com.nguyentrongtri.anonymouslistener;

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
        // Listerner for each button
        buttonSayHi.setOnClickListener(listenerhello);
        buttonXinChao.setOnClickListener(listenerXinChao);
    }
    View.OnClickListener listenerhello = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String strname = editText_Name.getText().toString();
            String strThongBao="Nice to meet you \n" + strname;
            Toast.makeText(MainActivity.this,strThongBao,Toast.LENGTH_LONG).show();
        }
    };
    View.OnClickListener listenerXinChao = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String strname = editText_Name.getText().toString();
            String strThongBao="Chào bạn \n" + strname;
            Toast.makeText(MainActivity.this,strThongBao,Toast.LENGTH_LONG).show();
        }
    };
    void findViews(){
        // Step 1: find name, sẵn để sau này dùng
        //Ở các điều khiển khác nhau
        editText_Name= findViewById(R.id.name);
        buttonSayHi = findViewById(R.id.btnHello);
        buttonXinChao=findViewById(R.id.btnHello1);
    }
}