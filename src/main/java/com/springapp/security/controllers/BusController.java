package com.springapp.security.controllers;

import com.springapp.security.models.Bus;
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
@RequestMapping(value = "/rest/buss")
public class BusController {
    private static final Logger log= LoggerFactory.getLogger(BusController.class);

    @Autowired
    BusService busService;

    @RequestMapping(method = RequestMethod.GET,consumes = "application/json",produces = "application/json",value = "/hello")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public List<Bus> buscarRutas(@PathVariable("idS") int idS,@PathVariable("idL") int idL,@PathVariable("fecha") String fecha){
        System.out.print("--> "+idS+"-"+idL+"-"+fecha);
        return busService.mostrarRutas(idS,idL,fecha);
    }

}
