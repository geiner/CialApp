package com.springapp.security.persistence;

import com.springapp.security.models.Usuario;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by GEINER on 19/11/2014.
 */
public interface UsuarioMapper {

    @Insert(value = "INSERT INTO usuarios VALUES " +
            "  ( #{usuario.dni}," +
            " #{usuario.nombres}," +
            " #{usuario.ap_paterno}," +
            " #{usuario.ap_materno}," +
            " #{usuario.sexo}," +
            " #{usuario.edad}," +
            " #{usuario.celular}," +
            " #{usuario.correo}," +
            " #{usuario.contrasenia}" +
            "  )")
    void registrarUsuario(@Param("usuario") Usuario usuario);
}
