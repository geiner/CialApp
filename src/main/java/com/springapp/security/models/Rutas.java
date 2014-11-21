package com.springapp.security.models;

/**
 * Created by GEINER on 20/11/2014.
 */
public class Rutas {
    private int origen;
    private int destino;
    private String fecha;
    private String desc_fecha;
    private String cod_bus;
    private Double precio;
    private String tipo_servicio;
    private String informacion;

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDesc_fecha() {
        return desc_fecha;
    }

    public void setDesc_fecha(String desc_fecha) {
        this.desc_fecha = desc_fecha;
    }

    public String getCod_bus() {
        return cod_bus;
    }

    public void setCod_bus(String cod_bus) {
        this.cod_bus = cod_bus;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
}
