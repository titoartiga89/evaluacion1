package com.example.rishardcarranza.evaluacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaEstudiantesActivity extends AppCompatActivity {
    private ListView lstEstudiantes;
    private EstudianteAdapter adaptadorEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);

        lstEstudiantes = (ListView) findViewById(R.id.lstEstudiantes);

        //Iniciar el ArrayList y Adaptador
        adaptadorEstudiante = new EstudianteAdapter(ListaEstudiantesActivity.this, MainActivity.lstEstudiantes);

        //Configurando el Adaptador al ListView
        lstEstudiantes.setAdapter(adaptadorEstudiante);
    }
}
