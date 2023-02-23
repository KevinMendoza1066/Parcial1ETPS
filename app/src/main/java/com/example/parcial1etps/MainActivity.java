package com.example.parcial1etps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

                if(usuario.equals(User) && Contrasenia.equals(Password)){
                    //Log.d("PRUEBA","entro");
                    Intent Pantalla=new Intent(getApplicationContext(),Calculo.class);
                    startActivity(Pantalla);
                }else{
                    //Log.d("PRUEBA","NO entro");
                    Toast toastP = new Toast(getApplicationContext());
                    LayoutInflater inflater =getLayoutInflater();
                    View layout=inflater.inflate(R.layout.toast_mensaje,(ViewGroup) findViewById(R.id.lytMensaje));

                    TextView txtMensaje=(TextView) layout.findViewById(R.id.textView4);
                    txtMensaje.setText("Contraseña y Usuario no son correctos");

                    toastP.setDuration(Toast.LENGTH_LONG);
                    toastP.setView(layout);
                    toastP.show();

                }

            }
        });
    }
}