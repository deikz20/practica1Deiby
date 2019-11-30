package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonLogin, buttonGuardar, buttonBuscar, buttonPasarParametro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = (Button)findViewById(R.id.button_login);
        buttonGuardar = ( Button)findViewById(R.id.button_guardar);
        buttonBuscar = (Button)findViewById(R.id.button_buscar);
        buttonPasarParametro =(Button)findViewById(R.id.button_pasar);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });
        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, guardar.class);
                startActivity(intent);
            }
        });
        buttonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, buscra.class);
                startActivity(intent);
            }
        });
        buttonPasarParametro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PasarParametro.class);
                startActivity(intent);
            }
        });
    }

}
