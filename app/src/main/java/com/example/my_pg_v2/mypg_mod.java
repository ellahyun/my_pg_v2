package com.example.my_pg_v2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class mypg_mod extends AppCompatActivity {
    Button button222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypg_mod);

        button222=findViewById(R.id.button222);
        button222.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}