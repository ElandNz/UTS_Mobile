package com.example.buku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pindahactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindahactivity = findViewById(R.id.button);

        pindahactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent pindahkedaftarbuku1 = new Intent(MainActivity.this,DaftarBuku1.class);
                startActivity(pindahkedaftarbuku1);

            }
        });
    }
}