package vn.NguyenTrongTri_63132732;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activityBai1 extends AppCompatActivity {

    private EditText editTextWeight;
    private EditText editTextHeight;
    private TextView textViewResult;
    private Button buttonCalculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        editTextWeight = findViewById(R.id.weight);
        editTextHeight = findViewById(R.id.height);
        textViewResult = findViewById(R.id.view_result);
        buttonCalculate = findViewById(R.id.calculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBMI();
            }
        });
    }
    private void calculateBMI() {
        String weightString = editTextWeight.getText().toString();
        String heightString = editTextHeight.getText().toString();

        if (!weightString.isEmpty() && !heightString.isEmpty()) {
            float weight = Float.parseFloat(weightString);
            float height = Float.parseFloat(heightString) / 100;
            float bmi = weight / (height * height);
            DecimalFormat df = new DecimalFormat("#.0");
            String formattedBMI = df.format(bmi);
            textViewResult.setText("" + formattedBMI );
        } else {
            textViewResult.setText("Vui lòng nhập thông tin.");
        }
    }
}