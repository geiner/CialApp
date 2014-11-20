package com.springapp.security.controllers;

import com.springapp.security.models.Rutas;
import com.springapp.security.models.Usuario;
import com.springapp.security.services.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GEINER on 19/11/2014.
 */
@Controller
@RequestMapping(value = "/rest/usuario")
public class UsuarioController {
    private static final Logger log= LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.POST,consumes = "application/json",produces = "application/json",value = "/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String updateResolucionServidor(@RequestBody Usuario usuario){
        System.out.println("registro de usuario "+usuario.getAp_materno()+"-"+usuario.getCorreo());
        usuarioService.RegistrarUsuario(usuario);
        return "save";
    }


    @RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/listar_rutas/{origen}/{destino}/{fecha}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Rutas> listarRutas(@PathVariable(value = "origen") int origen,@PathVariable(value = "destino") int destino,
                                          @PathVariable(value = "fecha") String fecha){
        List<Rutas> rutas = usuarioService.listarRutas(origen,destino,fecha);
        return rutas;
    }
}
