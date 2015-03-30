package es.epinanab.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Codigo de nuestro programa
        
    }

    public void Cambia_Texto (View v){
        //Localizamos el boton y lo definimos en una variable
        TextView texto = (TextView) findViewById(R.id.texto);

        //Ponemos el texto que queremos en el elemnto textview
        texto.setText("Eres un maquina");



    }
}