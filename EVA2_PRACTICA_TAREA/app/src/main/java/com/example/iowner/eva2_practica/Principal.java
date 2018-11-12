package com.example.iowner.eva2_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    Restaurante[] restaurantes = {new Restaurante("Cafe y reposteria","Cafe y pastelitos ",R.drawable.bourkestreetbakery,"Calle alvaro","123",R.drawable.bourkestreetbakery3x),
            new Restaurante("Cafe Dead","Hay cafe",R.drawable.cafedeadend,"Calle alvaro","123",R.drawable.cafedeadend3x),
            new Restaurante("Cafe Lois","Hay un cafe chido",R.drawable.cafeloisl,"Calle alvaro","123",R.drawable.cafeloisl3x),
            new Restaurante("Postres y mas","Hay solo postres",R.drawable.fiveleaves,"Calle alvaro","123",R.drawable.fiveleaves3x),
            new Restaurante("Cafe Lore","Cafe",R.drawable.cafelore,"Calle alvaro\"","1531617",R.drawable.cafelore3x),
            new Restaurante("Meats Graham","Hay solo comida",R.drawable.grahamavenuemeats,"Calle alvaro","123",R.drawable.grahamavenuemeats3x),
            new Restaurante("Cafe Home","Cafe coco",R.drawable.homei,"Calle alvaro","123",R.drawable.homei3x),
            new Restaurante("Po's Atelier","Esta chido",R.drawable.posatelier,"Calle alvaro","123",R.drawable.posatelier3x),
            new Restaurante("Teakha","Castalas",R.drawable.teakha,"Calle alvaro","123",R.drawable.upstate3x),
            new Restaurante("Traif","Comida uff",R.drawable.traif,"Calle alvaro","123",R.drawable.traif3x),
            new Restaurante("Barra Fina","The restaurant",R.drawable.barrafina,"Calle alvaro","123",R.drawable.barrafina3x),
            new Restaurante("Pizzas Pepe Roni","Pizzas",R.drawable.confessional,"Calle alvaroo","123",R.drawable.confessional3x),
            new Restaurante("Brochetas","Carne en brochet",R.drawable.donostia,"Calle alvaro","123",R.drawable.donostia3x),
            new Restaurante("Paninis Panin","Paninis",R.drawable.forkeerestaurant,"Calle alvaro","123",R.drawable.forkeerestaurant3x),
            new Restaurante("Postres Delicia","Postres chingones",R.drawable.haighschocolate,"Calle alvaro","123",R.drawable.haighschocolate3x),
            new Restaurante("Express","Expressos",R.drawable.palominoespresso,"Calle alvaro","123",R.drawable.palominoespresso3x),
            new Restaurante("Comida de mar","Hay mariscos",R.drawable.petiteoyster,"Calle alvaro","123",R.drawable.petiteoyster3x),
            new Restaurante("Dinners","Ceneichon",R.drawable.royaloak,"Calle alvaro","123",R.drawable.royaloak3x),
            new Restaurante("Postres y cafe","Postres y cafe",R.drawable.thaicafe,"Calle alvaro","123",R.drawable.thaicafe3x),
            new Restaurante("Upstate","Hay comida",R.drawable.upstate,"Calle alvaro","123",R.drawable.upstate3x),
            new Restaurante("Wolf Waffles","Waffles",R.drawable.wafflewolf,"Calle alvaro","123",R.drawable.wafflewolf3x)};

    ListView listRes;
    Intent iRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        listRes = findViewById(R.id.list_Res);
        listRes.setAdapter(new Adapter(this,R.layout.restaurant,restaurantes));
        listRes.setOnItemClickListener(this);
        iRes = new Intent(this,Res.class);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        iRes.putExtra("img",restaurantes[i].imagen);
        iRes.putExtra("imgG",restaurantes[i].imagenG);
        iRes.putExtra("nom",restaurantes[i].sNombreRes);
        iRes.putExtra("des",restaurantes[i].sDescripcion);
        iRes.putExtra("dir",restaurantes[i].sDireccion);


        startActivity(iRes);

    }
}
