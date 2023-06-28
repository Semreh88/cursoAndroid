package com.example.clases_objetos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Consult extends AppCompatActivity {

    private ListView listUsuarios;
    private Button btnConsultar;
    private ArrayList<String> users;

    private Usuario obj_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        inicializar();

        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                users.add("2064 " + " Jonier " + " jonier@hotmail.com " + " 29 " );
                users.add("4789 " + " Alberto " + " alberto@hotmail.com " + " 33 " );
                users.add("3215 " + " Julian " + " julian@hotmail.com " + " 25 " );
                ArrayAdapter adapter_user = new ArrayAdapter<String>(Consult.this,
                        com.google.android.material.R.layout.design_navigation_item_subheader, users);
                listUsuarios.setAdapter(adapter_user);
            }
        });
    }

    private void inicializar() {
        listUsuarios = (ListView) findViewById(R.id.listUsuario);
        btnConsultar = (Button) findViewById(R.id.btnConsultar);
        users = new ArrayList<>();
        obj_user = new Usuario();
    }
}