package com.springapp.security.models;

/**
 * Created by esantiago on 19/11/2014.
 */
public class Bus {
    private String cod_bus;
    private String cod_tipo;
    private int cod_dep_salida;
    private int cod_dep_llegada;
    private String fecha;

    public String getCod_bus() {
        return cod_bus;
    }

    public void setCod_bus(String cod_bus) {
        this.cod_bus = cod_bus;
    }

    public String getCod_tipo() {
        return cod_tipo;
    }

    public void setCod_tipo(String cod_tipo) {
        this.cod_tipo = cod_tipo;
    }

    public int getCod_dep_salida() {
        return cod_dep_salida;
    }

    public void setCod_dep_salida(int cod_dep_salida) {
        this.cod_dep_salida = cod_dep_salida;
    }

    public int getCod_dep_llegada() {
        return cod_dep_llegada;
    }

    public void setCod_dep_llegada(int cod_dep_llegada) {
        this.cod_dep_llegada = cod_dep_llegada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }





}
