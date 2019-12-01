package com.alvaro.versiones.utils;

import java.io.Serializable;

public class Versiones implements Serializable {
    String nombre, detalle, fecha, nro_version;
    int fotoMain, fotoDetalle;

    public Versiones(String nombre, String detalle, String fecha, String nro_version, int fotoMain, int fotoDetalle) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.fecha = fecha;
        this.nro_version = nro_version;
        this.fotoMain = fotoMain;
        this.fotoDetalle = fotoDetalle;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNro_version() {
        return nro_version;
    }

    public int getLogoMain() {
        return fotoMain;
    }

    public int getLogoDetalle() {
        return fotoDetalle;
    }
}
