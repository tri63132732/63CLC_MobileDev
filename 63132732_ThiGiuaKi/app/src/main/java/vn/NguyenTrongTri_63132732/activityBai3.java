package vn.NguyenTrongTri_63132732;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class activityBai3 extends AppCompatActivity {
    ArrayList<MonAn> dsMonAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        dsMonAn = new ArrayList<MonAn>();
        MonAn food1 = new MonAn("Hảo Hảo", "Tôm chua cay");
        MonAn food2 = new MonAn("Canh chau", "Chua ngọt");
        MonAn food3 = new MonAn("Tôm hùm", "Chưa ăn");
        dsMonAn.add(food1);
        dsMonAn.add(food2);
        dsMonAn.add(food3);
        // tim dieu khien
        ListView listViewQG = findViewById(R.id.listviewNation);
        // Tao adapter
        MonAnAdapter adapter = new MonAnAdapter(dsMonAn, this);
        // Gan adapter
        listViewQG.setAdapter(adapter);
    }
}