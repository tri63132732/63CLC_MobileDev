package com.nguyentrongtri.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView baihat;
    ArrayList dsbaihat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findcontrols();
        dsbaihat = new ArrayList<String>();
        dsbaihat.add("Tien quan ca");
        dsbaihat.add("Cuon theo lan gio");
        dsbaihat.add("Lop chung minh");
        dsbaihat.add("");
        ArrayAdapter<String> adapterBH;
        adapterBH = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,dsbaihat);
        baihat.setAdapter(adapterBH);

        baihat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemChon= dsbaihat.get(i).toString();
                String thongBao= "Ban chon bai:" + itemChon;
                Toast.makeText(MainActivity.this,thongBao,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void findcontrols(){
        baihat=findViewById(R.id.listbaihat);
    }
}