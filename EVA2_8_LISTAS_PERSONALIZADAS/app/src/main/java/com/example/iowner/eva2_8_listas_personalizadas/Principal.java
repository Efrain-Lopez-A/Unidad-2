package com.example.iowner.eva2_8_listas_personalizadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    Clima[] climas = {new Clima("Chihuahua","Lluvioso", 15, R.drawable.rainy),
            new Clima("Delicias","Nublado", 10, R.drawable.cloudy),
            new Clima("Chihuahua","Soleado", 20, R.drawable.sunny),
            new Clima("Delicias","Despejado", 17, R.drawable.sunny),
            new Clima("Chihuahua","Soleado", 18, R.drawable.sunny),
            new Clima("Delicias","Lluvioso", 16, R.drawable.rainy),
            new Clima("Chihuahua","Nublado", 10, R.drawable.cloudy),
            new Clima("Delicias","Soleado", 15, R.drawable.sunny)};
    ListView list;
    ImageView imgVw;
    TextView txtCiudad, txtTemp, txtDes;
    Intent iClima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        list = findViewById(R.id.list);
        list.setAdapter(new ClimaAdpater(this,R.layout.layout_clima,climas));
        list.setOnItemClickListener(this);
        iClima = new Intent(this,ClimaDetalle.class);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        iClima.putExtra("img",climas[i].imagen);
        iClima.putExtra("ciu",climas[i].nombreCiudad);
        iClima.putExtra("tem",climas[i].temperatura);
        iClima.putExtra("des",climas[i].descripcion);
        startActivity(iClima);

    }
}
