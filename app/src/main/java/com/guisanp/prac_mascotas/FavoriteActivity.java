package com.guisanp.prac_mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;


public class FavoriteActivity extends AppCompatActivity {
    private RecyclerView listaMascotas;
    ArrayList<MascotasActivity> mascotas;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_favorites);
        Toolbar miactionBar2=(Toolbar) findViewById(R.id.favActionBar);
        setSupportActionBar(miactionBar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        listaMascotas=(RecyclerView) findViewById(R.id.rvFavorites);

        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        }
    public MascotasAdaptador adaptador;
    private void inicializarAdaptador(){
        MascotasAdaptador adaptador=new MascotasAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<MascotasActivity>();
        mascotas.add(new MascotasActivity(R.drawable.gato4,"Carlos",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.perro1,"Javi",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.perro2,"Carol",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.perro3,"Tino",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.perro4,"Martina",0,R.drawable.dog_bone_48));
    }
    }


