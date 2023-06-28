package com.example.clases_objetos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private EditText identificacion;
    private EditText nombre;
    private EditText correo;
    private EditText edad;
    private Button botonRegistrar;
    private Usuario obj_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        inicializar();

        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj_usuario.setIdentificacion(Integer.parseInt(identificacion.getText().toString()));
                obj_usuario.setNombre(nombre.getText().toString());
                obj_usuario.setCorreo(correo.getText().toString());
                obj_usuario.setEdad(Integer.parseInt(edad.getText().toString()));

                String cadena_data = obj_usuario.getIdentificacion() + " " + obj_usuario.getNombre()
                        + " " + obj_usuario.getCorreo() + " " + obj_usuario.getEdad();

                Toast.makeText(Register.this, cadena_data, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void inicializar() {
        identificacion = (EditText) findViewById(R.id.txtIdentification);
        nombre = (EditText) findViewById(R.id.txtName);
        correo = (EditText) findViewById(R.id.txtCorreo);
        edad = (EditText) findViewById(R.id.txtEdad);
        botonRegistrar = (Button) findViewById(R.id.btnRegistrar);
        obj_usuario = new Usuario();
    }
}