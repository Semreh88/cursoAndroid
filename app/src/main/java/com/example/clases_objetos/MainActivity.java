package com.example.clases_objetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnRegister;
    private Button btnConsult;

    private Usuario obj_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_register = new Intent(MainActivity.this, Register.class);
                startActivity(intent_register);
            }
        });

        btnConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    ArrayList<String> array = new ArrayList<>();
                    array = extras.getStringArrayList("data");

                    Intent intent_consult = new Intent(MainActivity.this, Consult.class);
                    intent_consult.putExtra("data", array);
                    startActivity(intent_consult);
                }
                else {
                    Intent intent_consult = new Intent(MainActivity.this, Consult.class);
                    startActivity(intent_consult);
                }

            }
        });
    }

    private void inicializar() {
        btnRegister = (Button) findViewById(R.id.btnRegistrarPage);
        btnConsult = (Button) findViewById(R.id.btnConsultarPage);
        obj_usuario = new Usuario();
    }
}