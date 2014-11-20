package com.springapp.security.persistence;

import com.springapp.security.models.Rutas;
import com.springapp.security.models.Usuario;
import org.apache.ibatis.annotations.*;

import java.util.List;

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

    @Select(value = "")
    @Results(value = {
            @Result(javaType = Rutas.class),
            @Result(property = "cod_bus", column = "dni"),
            @Result(property = "precio", column = "pat"),
            @Result(property = "tipo_servicio", column = "mat"),
            @Result(property = "informacion", column = "nom")
    })
    List<Rutas> listarRutas(@Param("origen") int origen,@Param("destino") int destino,@Param("fecha") String fecha);
}
