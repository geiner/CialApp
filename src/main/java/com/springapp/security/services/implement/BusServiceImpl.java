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
}
