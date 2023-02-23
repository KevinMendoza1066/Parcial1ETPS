package com.example.parcial1etps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnIniciar;
    EditText etUser,etPassword;
    String Password = "p4rC14l#tp$";
    String User = "parcialETps1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIniciar=findViewById(R.id.btnLogin);
        etUser = findViewById(R.id.etUser);
        etPassword = findViewById(R.id.etPassword);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = etUser.getText().toString();
                String Contrasenia = etPassword.getText().toString();
                if(usuario==User &&Contrasenia==Password){
                    Intent Pantalla=new Intent(getApplicationContext(),Calculo.class);
                    startActivity(Pantalla);
                }

            }
        });
    }
}