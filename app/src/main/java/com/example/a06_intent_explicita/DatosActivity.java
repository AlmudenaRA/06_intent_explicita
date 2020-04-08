package com.example.a06_intent_explicita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        //Forma de recuperar los parámetros y obtener los valores que hemos creado en MainActivity,
        //para ello hay que declarar un Bundle
        Bundle extras = getIntent().getExtras(); //Devuelve con conjunto de eventos que se obtiene a partir de la clave que hemos puesto

        int n = extras.getInt("numero"); //IMPORTANTE escribir la misma clave
        String s = extras.getString("nombre");

        //Mostrarlo
        Toast toast1 = Toast.makeText(this, "Numero: "+n+", nombre: "+s, Toast.LENGTH_SHORT);
        toast1.show();
    }
}
