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
public class UrlRewritting1 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        
        String n=req.getParameter("user_name");
        out.print("<h1>Hye welcome"+n+"</h1>");
        out.print("<a href='UrlRewritting2?name="+n+"'>go to next servlet</a>");
        out.close();
    }
    
}
