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
    //Metodo que inicia la actividad al pulsar el boton
    public void btn_hola(View v){
        //Encontramos el cuadro de texto
        final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
        //Creamo el intent
        Intent i = new Intent();
        //Nombre y propiedades del intent
        i.putExtra("Nombre", txtNombre.getText().toString());
        //Definmos los parametros de la actividad que iniciara
        i.setClass(HolaUsuario.this, Saludo.class);
        //Iniciamos la actividad
        startActivity(i);
    }
}
