package com.example.guillermo.holausuario;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Saludo extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstancesState){
        super.onCreate(savedInstancesState);
        setContentView(R.layout.saludo);
        //Localizamos el texto
        TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
        //recuperamos la informacion del intent
        Bundle b = this.getIntent().getExtras();
        //construimos el mensaje a mostrar
        txtSaludo.setText("Hola " + b.getString("Nombre"));
    }
 }
