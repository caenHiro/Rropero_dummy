package com.rropero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INE
 */
/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/inventario")
public class InventarioVistaController {
    
    /*Pagina principal*/
    @RequestMapping()
    public String defaultMethod(){
        return "home.jsp";
    }
    
    /*Templates*/
    @RequestMapping(value="/template/inventario/main")
    public String inventarioMainTemplate(){
        return "redirect:/resources/template/inventarioMain.html";
    }

    @RequestMapping(value="/template/inventario/ver")
    public String verInventarioTemplate(){
       return "redirect:/resources/template/inventarioVer.html"; 
    }
    
    @RequestMapping(value="/template/inventario/registrar")
    public String registrarInventarioTemplate(){
       return "redirect:/resources/template/inventarioRegistrar.html"; 
    }
    
    @RequestMapping(value="/template/inventario/actualizar")
    public String actualizarInventarioTemplate(){
       return "redirect:/resources/template/inventarioActualizar.html"; 
    }
    
}
