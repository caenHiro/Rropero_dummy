package com.rropero.controller;

import javax.servlet.http.HttpSession;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Pilar Hdez
 */
@Controller
@RequestMapping("/api/login")
public class HomeController {
    
    @Autowired 
    private HttpSession session;
    
    @RequestMapping(value="/", method = RequestMethod.POST)
    @ResponseBody
    public String logIn(
            @RequestParam(value = "usuario", required = true) String usuario,
            @RequestParam(value = "password", required = true) String password){
       
	session.setAttribute("rropero","ADMIN");
        
        JSONObject result = new JSONObject();
        result.put("success", true);
        result.put("message", "Welcome!");
        return result.toJSONString();
    }
    
    @RequestMapping(value="/out")
    public String logOut(){
        
        if(session.getAttribute("rropero") != null){
            session.removeAttribute("rropero");
        }
       
        return "redirect:/";
    }
}
