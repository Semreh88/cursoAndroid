package com.example.clases_objetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnRegister;
    private Button btnConsult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Boton Registrar", Toast.LENGTH_LONG).show();
                Intent intent_register = new Intent(MainActivity.this, Register.class);
                startActivity(intent_register);
            }
        });

        btnConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Boton Consultar", Toast.LENGTH_LONG).show();
                Intent intent_consult = new Intent(MainActivity.this, Consult.class);
                startActivity(intent_consult);
            }
        });
    }

    private void inicializar() {
        btnRegister = (Button) findViewById(R.id.btnRegistrarPage);
        btnConsult = (Button) findViewById(R.id.btnConsultarPage);
    }
}