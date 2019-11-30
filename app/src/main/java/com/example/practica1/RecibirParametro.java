package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class RecibirParametro extends AppCompatActivity {
    TextView ParametroRecibido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_parametro);

        ParametroRecibido = (TextView) findViewById(R.id.textView_parametro);
        Bundle bundle = this.getIntent().getExtras();
        ParametroRecibido.setText(bundle.getString("dato"));
    }
}
