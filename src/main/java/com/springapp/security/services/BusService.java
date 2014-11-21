package com.springapp.security.services;

import com.springapp.security.models.Bus;
import com.springapp.security.models.Rutas;

import java.util.List;

/**
 * Created by esantiago on 20/11/2014.
 */
public interface BusService {
    List<Rutas> mostrarRutas(int salida,int llegada,String fecha);

    List<Bus> primerBloque(String cod_bus);

    List<Bus> segundoBloque(String cod_bus);

    List<Bus> tercerBloque(String cod_bus);

    List<Bus> cuartoBloque(String cod_bus);
}
