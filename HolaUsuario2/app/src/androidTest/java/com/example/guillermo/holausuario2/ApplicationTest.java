package com.example.guillermo.holausuario;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class HolaUsuario extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void btn_hola(View v){
        final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
        Intent i = new Intent();
        i.putExtra("Nombre", txtNombre.getText().toString());
        i.setClass(HolaUsuario.this, Saludo.class);
        startActivity(i);
    }
}