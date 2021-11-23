/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kailash.mavenproject1;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author admin
 */
public class UrlRewritting2 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        out.print("<h4>Hye "+name+", welcome back to my website."+" <br>your email is :"+email+"</h4>");
        out.close();
    }
    
}
