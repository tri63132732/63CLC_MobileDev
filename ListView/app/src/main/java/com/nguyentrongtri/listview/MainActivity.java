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
    ListView monan;
    ArrayList dsmonan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findcontrols();
        dsmonan = new ArrayList<String>();
        dsmonan.add("KFC");
        dsmonan.add("Mì ly");
        dsmonan.add("Cơm chiên");
        dsmonan.add("Rau trộn");
        ArrayAdapter<String> adapterBH;
        adapterBH = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,dsmonan);
        monan.setAdapter(adapterBH);

        monan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String itemChon= dsmonan.get(i).toString();
                String thongBao= "Bạn chọn món:" + itemChon;
                Toast.makeText(MainActivity.this,thongBao,Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void findcontrols(){
        monan=findViewById(R.id.listmonan);
    }
}