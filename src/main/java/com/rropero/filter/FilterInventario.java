package com.rropero.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pilar Hdez
 */
public class FilterInventario implements Filter {
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) request;
        HttpSession httpsession=req.getSession(); 
         
        if(httpsession == null || httpsession.getAttribute("rropero") == null){
            req.getRequestDispatcher("/WEB-INF/views/denied.jsp").forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }
    
    @Override
    public void init(FilterConfig fc) throws ServletException {}

    @Override
    public void destroy() {}
    
}

