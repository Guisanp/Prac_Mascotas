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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listaMascotas;
    ArrayList<MascotasActivity> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        Toolbar miactionBar=(Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miactionBar);

        listaMascotas=(RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm=new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        final ImageView v=(ImageView) findViewById(R.id.estrella);
         v.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent=new Intent(MainActivity.this,FavoriteActivity.class);

                 startActivity(intent);
             }
         });

        }
    public MascotasAdaptador adaptador;
    private void inicializarAdaptador(){
        MascotasAdaptador adaptador=new MascotasAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<MascotasActivity>();
        mascotas.add(new MascotasActivity(R.drawable.gato1,"Carmen",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.gato2,"Sergio",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.gato3,"Sandra",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.gato4,"Carlos",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.perro1,"Javi",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.perro2,"Carol",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.perro3,"Tino",0,R.drawable.dog_bone_48));
        mascotas.add(new MascotasActivity(R.drawable.perro4,"Martina",0,R.drawable.dog_bone_48));
    }
}
