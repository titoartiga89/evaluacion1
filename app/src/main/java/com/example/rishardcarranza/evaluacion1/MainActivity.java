package com.example.rishardcarranza.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnNuevo, btnLista;
    public static ArrayList<Estudiante> lstEstudiantes = new ArrayList<Estudiante>();
    public static int GUARDADO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNuevo = (Button) findViewById(R.id.btnNuevo);
        btnLista = (Button) findViewById(R.id.btnLista);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EstudianteActivity.class);
                startActivityForResult(intent, GUARDADO);
            }
        });

        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaEstudiantesActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GUARDADO && resultCode == RESULT_OK) {
            Estudiante estudiante = (Estudiante) data.getSerializableExtra("ESTUDIANTE");

            lstEstudiantes.add(estudiante);
            btnLista.setText("Lista Estudiante " + lstEstudiantes.size());
        }
    }
}
