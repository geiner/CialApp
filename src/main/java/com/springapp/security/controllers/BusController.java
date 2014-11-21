package com.springapp.security.controllers;

import com.springapp.security.models.Bus;
import com.springapp.security.models.Rutas;
import com.springapp.security.services.BusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by esantiago on 20/11/2014.
 */
@Controller
@RequestMapping(value = "/rest/bus")
public class BusController {
    private static final Logger log= LoggerFactory.getLogger(BusController.class);

    @Autowired
    BusService busService;

    @RequestMapping(method = RequestMethod.GET,produces = "application/json",value = "/listar/{idS}/{idL}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Rutas> buscarRutas(@PathVariable("idS") int idS,@PathVariable("idL") int idL/*,@PathVariable("fecha") String fecha*/){
        String fecha="19/11/2014";
        System.out.print("--> "+idS+"-"+idL+"-"+fecha);
        System.out.println("aka estas "+busService.mostrarRutas(idS,idL,fecha).size());
        return busService.mostrarRutas(idS,idL,fecha);
    }

    @RequestMapping(method = RequestMethod.GET,produces = "application/json",value = "/primerlist/{cod_bus}/traer")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Bus> primerBloque(@PathVariable("cod_bus") String cod_bus){
//        String fecha="19/11/2014";
        System.out.print("--> "+cod_bus+"-");
//        System.out.println("aka estas "+busService.mostrarRutas(idS,idL,fecha).size());
        return busService.primerBloque(cod_bus);
    }

    @RequestMapping(method = RequestMethod.GET,produces = "application/json",value = "/segundolist/{cod_bus}/traer")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Bus> segundoBloque(@PathVariable("cod_bus") String cod_bus){
//        String fecha="19/11/2014";
        System.out.print("--> "+cod_bus+"-");
//        System.out.println("aka estas "+busService.mostrarRutas(idS,idL,fecha).size());
        return busService.segundoBloque(cod_bus);
    }

    @RequestMapping(method = RequestMethod.GET,produces = "application/json",value = "/tercerolist/{cod_bus}/traer")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Bus> tercerBloque(@PathVariable("cod_bus") String cod_bus){
//        String fecha="19/11/2014";
        System.out.print("--> "+cod_bus+"-");
//        System.out.println("aka estas "+busService.mostrarRutas(idS,idL,fecha).size());
        return busService.tercerBloque(cod_bus);
    }

    @RequestMapping(method = RequestMethod.GET,produces = "application/json",value = "/cuartolist/{cod_bus}/traer")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Bus> cuartoBloque(@PathVariable("cod_bus") String cod_bus){
//        String fecha="19/11/2014";
        System.out.print("--> "+cod_bus+"-");
//        System.out.println("aka estas "+busService.mostrarRutas(idS,idL,fecha).size());
        return busService.cuartoBloque(cod_bus);
    }

}
