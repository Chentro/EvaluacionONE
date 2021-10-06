package com.eva.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Control extends AppCompatActivity {

    TextView TOTAL, HOMBRES, MUJERES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        TOTAL = (TextView) findViewById(R.id.lbl_total);
        HOMBRES = (TextView) findViewById(R.id.lbl_hom);
        MUJERES = (TextView) findViewById(R.id.lbl_muj);

        Bundle B = getIntent().getExtras();
        String GeneroRecibido = B.getString("Genero");




    }

    public void Agregar(View v){
        Intent I = new Intent(getApplicationContext(), AgregarCenso.class);
        startActivity(I);
    }
}