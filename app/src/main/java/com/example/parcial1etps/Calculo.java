package com.example.parcial1etps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculo extends AppCompatActivity {
    Button btnCerrar,btnProcesar;
    EditText etPeso,etEstatura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        btnCerrar  = findViewById(R.id.btnCerrar);
        btnProcesar=findViewById(R.id.btnProcesar);
        etPeso = findViewById(R.id.etPeso);
        etEstatura = findViewById(R.id.etEstatura);
    }
    public void Calcular(View v){
        Double Peso = Double.parseDouble(etPeso.getText().toString());
        Double Estatura =Double.parseDouble(etEstatura.getText().toString());
        Double IMC = Peso/(Estatura*Estatura);

        if (IMC>50){
            Toast mensaje= Toast.makeText(this,"Su IMC es "+IMC+",\n Obesidad Clase 3 - Criticamente Obeso",Toast.LENGTH_LONG);
            mensaje.show();
        }else if (IMC<50 && IMC>=35){
            Toast mensaje= Toast.makeText(this,"Su IMC es "+IMC+",\n Obesidad Clase 2 - Severamente Obeso",Toast.LENGTH_LONG);
            mensaje.show();
        }else if (IMC<35 && IMC>=30){
            Toast mensaje= Toast.makeText(this,"Su IMC es "+IMC+",\n Obesidad Clase 1 - Moderadamente Obeso",Toast.LENGTH_LONG);
            mensaje.show();
        }else if (IMC<30 && IMC>=25){
            Toast mensaje= Toast.makeText(this,"Su IMC es "+IMC+",\n Sobrepeso",Toast.LENGTH_LONG);
            mensaje.show();
        }else if (IMC<25 && IMC>=18.5){
            Toast mensaje= Toast.makeText(this,"Su IMC es "+IMC+",\n Normal (peso Saludable)",Toast.LENGTH_LONG);
            mensaje.show();
        }else if (IMC<18.5 && IMC>=15.9){
            Toast mensaje= Toast.makeText(this,"Su IMC es "+IMC+",\n Bajo de Peso",Toast.LENGTH_LONG);
            mensaje.show();
        }
        else if (IMC<15.9 && IMC>=10.5){
            Toast mensaje= Toast.makeText(this,"Su IMC es "+IMC+",\n Severamente bajo de Peso",Toast.LENGTH_LONG);
            mensaje.show();
        }
        else if (IMC<10.5){
            Toast mensaje= Toast.makeText(this,"Su IMC es "+IMC+",\n Criticamente bajo de Peso",Toast.LENGTH_LONG);
            mensaje.show();
        }


    }
    public void salir(View V){
        finish();
    }
}