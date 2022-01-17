package com.example.danhnhan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class DanhNhanActivity extends AppCompatActivity {

    private TextView ten;
    private TextView txt11;
    private TextView txt22;
    private TextView txt33;

    private ImageView imgg;
    private ImageButton btnHH1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_nhan);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.white_blue));

        ten = findViewById(R.id.ten);
        txt11 = findViewById(R.id.txt11);
        txt22 = findViewById(R.id.txt22);
        txt33 = findViewById(R.id.txt33);
        imgg = findViewById(R.id.imgg);
        btnHH1 = findViewById(R.id.btnHH1);

        btnHH1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DanhNhanActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Intent intent = this.getIntent();
        DanhNhan dto = (DanhNhan) intent.getSerializableExtra("dto");

//        if (intent != null) {
//            String name = intent.getStringExtra("name");
//            String description = intent.getStringExtra("description");
//            String date = intent.getStringExtra("date");
//            String born = intent.getStringExtra("born");
//            int img = intent.getIntExtra("img", R.drawable.i1);
//
//            imgg.setImageResource(img);
//            ten.setText(name);
//            txt11.setText(date);
//            txt22.setText(born);
//            txt33.setText(description);
//        }
        if (dto != null){
            imgg.setImageResource(dto.getImage());
            ten.setText(dto.getName());
            txt11.setText(dto.getDate());
            txt22.setText(dto.getBorn());
            txt33.setText(dto.getDescription());
        }
    }
}