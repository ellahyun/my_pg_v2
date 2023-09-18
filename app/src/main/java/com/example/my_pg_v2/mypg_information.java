package com.example.my_pg_v2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class mypg_information extends AppCompatActivity {
Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypg_information);

        button2=findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(), mypg_mod.class);
            startActivity(intent);
        });
    }
}