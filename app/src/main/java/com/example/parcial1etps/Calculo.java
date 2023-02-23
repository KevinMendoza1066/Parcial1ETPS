package com.example.parcial1etps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calculo extends AppCompatActivity {
    Button btnCerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        btnCerrar  = findViewById(R.id.btnCerrar);
    }
    public void salir(View V){
        finish();
    }
}