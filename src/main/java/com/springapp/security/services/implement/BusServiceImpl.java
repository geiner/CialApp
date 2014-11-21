package com.springapp.security.services.implement;

import com.springapp.security.models.Bus;
import com.springapp.security.models.Rutas;
import com.springapp.security.persistence.BusMapper;
import com.springapp.security.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by GEINER on 20/11/2014.
 */
@Service
@Repository
@Transactional
public class BusServiceImpl implements BusService {

    @Autowired
    BusMapper busMapper;

    @Override
    public List<Rutas> mostrarRutas(int salida, int llegada, String fecha) {
        return busMapper.MostrarRutas(salida, llegada, fecha);
    }

    @Override
    public List<Bus> primerBloque(String cod_bus) {
        List<Bus> bus=busMapper.primerBloque(cod_bus);
        for(int i=0;i<bus.size();i++){
            if(bus.get(i).getCod_estado()==1){
                bus.get(i).setPintar("nada");
            }else{
                if(bus.get(i).getCod_estado()==3){
                    bus.get(i).setPintar("yellow");
                }else{
                    bus.get(i).setPintar("black");
                }
            }
        }
        return bus;
    }

    @Override
    public List<Bus> segundoBloque(String cod_bus) {
        List<Bus> bus=busMapper.segundoBloque(cod_bus);
        for(int i=0;i<bus.size();i++){
            if(bus.get(i).getCod_estado()==1){
                bus.get(i).setPintar("nada");
            }else{
                if(bus.get(i).getCod_estado()==3){
                    bus.get(i).setPintar("yellow");
                }else{
                    bus.get(i).setPintar("black");
                }
            }
        }
        return bus;
    }

    @Override
    public List<Bus> tercerBloque(String cod_bus) {
        List<Bus> bus=busMapper.tercerBloque(cod_bus);
        for(int i=0;i<bus.size();i++){
            if(bus.get(i).getCod_estado()==1){
                bus.get(i).setPintar("nada");
            }else{
                if(bus.get(i).getCod_estado()==3){
                    bus.get(i).setPintar("yellow");
                }else{
                    bus.get(i).setPintar("black");
                }
            }
        }
        return bus;
    }

    @Override
    public List<Bus> cuartoBloque(String cod_bus) {
        List<Bus> bus=busMapper.cuartoBloque(cod_bus);
        for(int i=0;i<bus.size();i++){
            if(bus.get(i).getCod_estado()==1){
                bus.get(i).setPintar("nada");
            }else{
                if(bus.get(i).getCod_estado()==3){
                    bus.get(i).setPintar("yellow");
                }else{
                    bus.get(i).setPintar("black");
                }
            }
        }
        return bus;
    }
}
