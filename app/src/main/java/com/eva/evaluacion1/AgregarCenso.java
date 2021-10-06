package com.eva.evaluacion1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AgregarCenso extends AppCompatActivity {

    EditText txt_Nom, txt_Eda;
    Spinner txt_Gen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_censo);

        txt_Nom = (EditText) findViewById(R.id.txt_nom);
        txt_Eda = (EditText) findViewById(R.id.txt_eda);
        txt_Gen = (Spinner) findViewById(R.id.spinner);
    }

    public void volver(View v){

        String Nombre = ("");
        String Edad = ("");
        String Genero = ("...");

        Nombre =txt_Nom.getText().toString();
        Edad = Integer.toString(Integer.parseInt(txt_Eda.getText().toString()));
        Genero = txt_Gen.getSelectedItem().toString();

        if ((Nombre!=null) && (Edad!=null) && (Genero != "...")){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Advertencia");
            builder.setMessage("Estas seguro de continuar?");
            String finalGenero = Genero;
            String finalEdad = Edad;
            String finalNombre = Nombre;
            builder.setPositiveButton("Agregar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    Intent I = new Intent(getApplicationContext(), Control.class);
                    I.putExtra("Nombre", finalNombre);
                    I.putExtra("Edad", finalEdad);
                    I.putExtra("Genero", finalGenero);

                    startActivity(I);
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else if (Nombre.equals("") && Edad.equals("") && Genero.equals("...")) {
            Toast.makeText(getApplicationContext(), "Debe completar todos los campos", Toast.LENGTH_LONG).show();
        }
    }
}