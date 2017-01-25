package com.guisanp.prac_mascotas;

import android.text.Editable;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by c_pin on 20/01/2017.
 */

public class ObjetoDatos implements Serializable{
    private int fav1;
    private int fav2;
    private int fav3;
    private int fav4;
    private int fav5;


    public int getFav1() {
        return fav1;
    }

    public void setFav1(int fav1) {
        this.fav1 = fav1;
    }

    public int getFav2() {
        return fav2;
    }

    public void setFav2(int fav2) {
        this.fav2 = fav2;
    }

    public int getFav3() {
        return fav3;
    }

    public void setFav3(int fav3) {
        this.fav3 = fav3;
    }

    public int getFav4() {
        return fav4;
    }

    public void setFav4(int fav4) {
        this.fav4 = fav4;
    }

    public int getFav5() {
        return fav5;
    }

    public void setFav5(int fav5) {
        this.fav5 = fav5;
    }
}

