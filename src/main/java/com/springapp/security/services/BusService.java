package com.springapp.security.services;

import com.springapp.security.models.Bus;

import java.util.List;

/**
 * Created by esantiago on 20/11/2014.
 */
public interface BusService {
    List<Bus> mostrarRutas(int salida,int llegada,String fecha);

}
