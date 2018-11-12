package com.example.iowner.eva2_practica;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Res extends AppCompatActivity {

    TextView txtTitulo,txtDescrip,txtDirec,txtNum;
    Intent iDatos,llamada;
    final int NUM_PER = 40;
    LinearLayout linearLayout;
    boolean bandera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_res);
        txtTitulo= findViewById(R.id.txtTitulo);
        txtDescrip = findViewById(R.id.txtDescrip);
        txtDirec = findViewById(R.id.txtDirec);
        txtNum = findViewById(R.id.txtNum);
        linearLayout = findViewById(R.id.imgFondo);

        iDatos = getIntent();

        linearLayout.setBackgroundResource(iDatos.getIntExtra("img",0));
        txtTitulo.setText(iDatos.getStringExtra("nom"));
        txtDescrip.setText(iDatos.getStringExtra("des"));
        txtDirec.setText(iDatos.getStringExtra("dir"));

    }

}
