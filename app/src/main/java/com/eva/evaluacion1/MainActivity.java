package com.eva.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_Usu, txt_Cla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_Usu = (EditText) findViewById(R.id.txt_usu);
        txt_Cla = (EditText) findViewById(R.id.txt_cla);
    }

    public void Ingresar(View v){

        String Usuario = ("");
        String Clave = ("");
        Usuario =txt_Usu.getText().toString();
        Clave = txt_Cla.getText().toString();

        if (Usuario.equals("") && Clave.equals("")){
            Toast.makeText(getApplicationContext(),"Ingrese Datos", Toast.LENGTH_LONG).show();
        }
        else if (Usuario.equals("adm123") && Clave.equals("adm123")) {
            Intent I = new Intent(getApplicationContext(), Control.class);
            startActivity(I);
        }
        else{
            Toast.makeText(getApplicationContext(),"Datos Incorrectos", Toast.LENGTH_LONG).show();
        }
    }
}