package com.guisanp.prac_mascotas;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by c_pin on 24/01/2017.
 */

public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotaViewHolder> {
    ArrayList<MascotasActivity> mascotas;
    Activity activity;
    public MascotasAdaptador(ArrayList<MascotasActivity> mascotas, Activity activity){
        this.mascotas=mascotas;
        this.activity=activity;
    }


    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cv_mascotas,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final MascotasActivity mascota=mascotas.get(position);

        mascotaViewHolder.tvimgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvnombre.setText(mascota.getNombre());
        mascotaViewHolder.tvnumFav.setText(mascota.getNumFav());
        mascotaViewHolder.tvhueso1.setImageResource (mascota.getFotohueso());

        mascotaViewHolder.tvhueso1.setOnClickListener(new View.OnClickListener()

        {

            @Override
            public void onClick(View v) {
                Toast.makeText(activity,mascota.getNumFav(),Toast.LENGTH_SHORT).show();
                final int favoritos;
                mascota.setNumFav(String.valueOf(Integer.parseInt(mascota.getNumFav())+1));

                mascotaViewHolder.tvnumFav.setText(String.valueOf(mascota.getNumFav()));


            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView tvimgFoto;
        private TextView tvnombre;
        private TextView tvnumFav;
        private ImageView tvhueso1;
        private ImageView tvhueso2;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            tvimgFoto=(ImageView) itemView.findViewById(R.id.imagen);
            tvnombre=(TextView) itemView.findViewById(R.id.nombreMascota);
            tvnumFav=(TextView) itemView.findViewById(R.id.numFav);
            tvhueso1=(ImageView) itemView.findViewById(R.id.fotohueso);

        }
    }
}
