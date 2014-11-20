package com.springapp.security.services.implement;

import com.springapp.security.models.Rutas;
import com.springapp.security.models.Usuario;
import com.springapp.security.persistence.UsuarioMapper;
import com.springapp.security.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by GEINER on 19/11/2014.
 */
@Service
@Repository
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioMapper usuarioMapper;

    @Override
    public void RegistrarUsuario(Usuario usuario) {
        usuarioMapper.registrarUsuario(usuario);
    }

    @Override
    public List<Rutas> listarRutas(int origen, int destino, String fecha) {
        return usuarioMapper.listarRutas(origen,destino,fecha);
    }
}
