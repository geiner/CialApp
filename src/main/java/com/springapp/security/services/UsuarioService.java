package com.springapp.security.services;

import com.springapp.security.models.Rutas;
import com.springapp.security.models.Usuario;

import java.util.List;

/**
 * Created by GEINER on 19/11/2014.
 */
public interface UsuarioService {
    void RegistrarUsuario(Usuario usuario);

    List<Rutas> listarRutas(int origen, int destino, String fecha);
}
