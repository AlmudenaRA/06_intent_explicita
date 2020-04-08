package com.example.a06_intent_explicita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarActivity(View view) {
        //Escribiremos el código necesario para iniciar el
        //activity DatosActivity >>> intent explícito

        /* En primer lugar se hace referencia al contexto sobre el activity que estamos trabajado (this)
        * en el segundo parámetro va la clase java del objeto al que queremos invocar
         */
        Intent intentDatos = new Intent(this, DatosActivity.class);
        //Se pueden pasar parámetros, poniendo entre la declaracion del Intent y el lanzamiento,
        //tantas líneas de código como parámetros queramos poner
        intentDatos.putExtra("numero", 5);
        intentDatos.putExtra("nombre", "Almudena");

        //Lanzar el activity
        startActivity(intentDatos);
    }
}
