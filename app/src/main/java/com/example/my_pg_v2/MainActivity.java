package com.example.my_pg_v2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
ImageButton imV_rightarrow1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // imV_right_arrow1라는 버튼을 누르면
        imV_rightarrow1=findViewById(R.id.imV_rightarrow1);
        imV_rightarrow1.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(), mypg_information.class);
            startActivity(intent);
        });
    }
}
