package com.guisanp.prac_mascotas;

/**
 * Created by c_pin on 24/01/2017.
 */

public class MascotasActivity {
    private String nombre;
    private String numFav;
    private int foto;
    private int fotohueso;

    public MascotasActivity(int foto,String nombre, int numFav, int fotohueso) {
        this.foto = foto;
        this.numFav = String.valueOf(numFav);
        this.nombre = nombre;
        this.fotohueso=fotohueso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumFav() {
        return numFav;
    }

    public int getFoto(){return foto;}
    public int getFotohueso(){return fotohueso;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setNumFav(String numFav){this.numFav=numFav;}
    public void setFoto(int foto){this.foto=foto;}
    public void setFotohueso(int fotohueso){this.fotohueso=fotohueso;}

}