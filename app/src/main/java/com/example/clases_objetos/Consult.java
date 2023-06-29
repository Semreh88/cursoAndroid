package com.example.clases_objetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

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

                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    users = extras.getStringArrayList("data");
                }
                else {
                    users.add("");
                }
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