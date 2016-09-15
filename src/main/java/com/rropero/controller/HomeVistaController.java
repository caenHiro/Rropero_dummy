package com.rropero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Pilar Hdez
 */
@Controller
@RequestMapping("/")
public class HomeVistaController {
    
    /*Pagina principal*/
    @RequestMapping()
    public String defaultMethod(){
        return "login.jsp";
    }
}
