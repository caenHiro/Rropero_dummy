/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rropero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author INE
 */
@Controller
@RequestMapping("/api/inventario")
public class InventarioController {
    
    @RequestMapping(value="/prenda/{id}", method={RequestMethod.GET})
    @ResponseBody
    public String getPrendaById(@PathVariable("id") int id){
        return "Prenda: "+id;
    }
}
