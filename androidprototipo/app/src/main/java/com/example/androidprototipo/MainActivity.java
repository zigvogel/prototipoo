package com.example.androidprototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMainODS1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMainODS1 = findViewById(R.id.btnMainODS1);
        btnMainODS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS1 = new Intent(getApplicationContext(),ods2.class);
                startActivity(telaODS1);
            }
        });

    }
}