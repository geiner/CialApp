package com.springapp.security.persistence;

import com.springapp.security.models.Bus;
import com.springapp.security.models.Rutas;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by GEINER on 20/11/2014.
 */
public interface BusMapper {


    @Select(value = "SELECT b.cod_bus cod_bus, " +
            "  (b.dia " +
            "  ||'/' " +
            "  ||b.mes " +
            "  ||'/' " +
            "  ||b.anio " +
            "  ||' ' " +
            "  ||b.hora) fecha, " +
            "  i.precio precio, " +
            "  b.cod_tipo cod_tipo, " +
            "  i.informacion informacion " +
            "FROM tb_bus b, " +
            "  tb_informacion i, " +
            "  tb_departamentos d, " +
            "  tb_departamentos2 p " +
            "WHERE b.cod_tipo     =i.cod_tipo " +
            "AND d.cod_dep        =b.cod_dep_salida " +
            "AND p.cod_dep        =b.cod_dep_llegada " +
            "AND trim(b.cod_dep_salida) =#{salida} " +
            "AND trim(b.cod_dep_llegada)=#{llegada} " +
            "AND trim(b.dia)            =19 " +
            "AND trim(b.mes)            =11 " +
            "AND trim(b.anio)           =2014")
    @Results(value = {
            @Result(javaType = Rutas.class),
            @Result(property = "cod_bus", column = "cod_bus"),
            @Result(property = "fecha", column = "fecha"),
            @Result(property = "precio", column = "precio"),
            @Result(property = "tipo_servicio", column = "cod_tipo"),
            @Result(property = "informacion", column = "informacion")
    })
    List<Rutas> MostrarRutas(@Param("salida") int salida,@Param("llegada") int llegada,@Param("fecha") String fecha);

    @Select(value = "SELECT num_aciento, " +
            "  cod_estado, " +
            "  cod_aciento " +
            "FROM tb_aciento " +
            "WHERE cod_bus   =#{cod_bus} " +
            "AND num_aciento<=15 order by num_aciento asc")
    @Results(value = {
            @Result(javaType = Bus.class),
            @Result(property = "num_aciento", column = "num_aciento"),
            @Result(property = "cod_estado", column = "cod_estado"),
            @Result(property = "cod_aciento", column = "cod_aciento")
    })
    List<Bus> primerBloque(@Param("cod_bus")String cod_bus);

    @Select(value = "SELECT num_aciento, " +
            "  cod_estado, " +
            "  cod_aciento " +
            "FROM tb_aciento " +
            "WHERE cod_bus   =#{cod_bus} " +
            "AND num_aciento > 15 and num_aciento <=30 order by num_aciento asc")
    @Results(value = {
            @Result(javaType = Bus.class),
            @Result(property = "num_aciento", column = "num_aciento"),
            @Result(property = "cod_estado", column = "cod_estado"),
            @Result(property = "cod_aciento", column = "cod_aciento")
    })
    List<Bus> segundoBloque(String cod_bus);

    @Select(value = "SELECT num_aciento, " +
            "  cod_estado, " +
            "  cod_aciento " +
            "FROM tb_aciento " +
            "WHERE cod_bus   =#{cod_bus} " +
            "AND num_aciento > 30 and num_aciento <=45 order by num_aciento asc")
    @Results(value = {
            @Result(javaType = Bus.class),
            @Result(property = "num_aciento", column = "num_aciento"),
            @Result(property = "cod_estado", column = "cod_estado"),
            @Result(property = "cod_aciento", column = "cod_aciento")
    })
    List<Bus> tercerBloque(String cod_bus);

    @Select(value = "SELECT num_aciento, " +
            "  cod_estado, " +
            "  cod_aciento " +
            "FROM tb_aciento " +
            "WHERE cod_bus   =#{cod_bus} " +
            "AND num_aciento > 45 and num_aciento <=60 order by num_aciento asc")
    @Results(value = {
            @Result(javaType = Bus.class),
            @Result(property = "num_aciento", column = "num_aciento"),
            @Result(property = "cod_estado", column = "cod_estado"),
            @Result(property = "cod_aciento", column = "cod_aciento")
    })
    List<Bus> cuartoBloque(String cod_bus);
}
