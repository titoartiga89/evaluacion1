package com.example.rishardcarranza.evaluacion1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

public class EstudianteActivity extends AppCompatActivity {

    private EditText txtNombre, txtCodigo, txtMateria, txtParcial1, txtParcial2, txtParcial3;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtCodigo = (EditText) findViewById(R.id.txtCodigo);
        txtMateria = (EditText) findViewById(R.id.txtMateria);
        txtParcial1 = (EditText) findViewById(R.id.txtParcial1);
        txtParcial2 = (EditText) findViewById(R.id.txtParcial2);
        txtParcial3 = (EditText) findViewById(R.id.txtParcial3);

        btnGuardar = (Button) findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNombre.getText().length() > 0 && txtCodigo.getText().length() > 0 && txtMateria.getText().length() > 0 &&
                    txtParcial1.getText().length() > 0 && txtParcial2.getText().length() > 0 && txtParcial3.getText().length() > 0 ) {

                    Estudiante est = new Estudiante(
                            txtNombre.getText().toString(),
                            txtCodigo.getText().toString(),
                            txtMateria.getText().toString(),
                            Double.parseDouble(txtParcial1.getText().toString()),
                            Double.parseDouble(txtParcial2.getText().toString()),
                            Double.parseDouble(txtParcial3.getText().toString())
                    );

                    Intent intent = new Intent();
                    intent.putExtra("ESTUDIANTE", est);
                    setResult(Activity.RESULT_OK, intent);
                    finish();
                } else {
                    Toast.makeText(EstudianteActivity.this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
