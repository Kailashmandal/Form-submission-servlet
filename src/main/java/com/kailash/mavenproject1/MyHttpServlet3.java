/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kailash.mavenproject1;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;

/**
 *
 * @author admin
 */
public class MyHttpServlet3 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException , ServletException{
        resp.setContentType("text/html");
        PrintWriter out =resp.getWriter();
        
        int n1=Integer.parseInt(req.getParameter("n1"));
        int n2=Integer.parseInt(req.getParameter("n2"));
        
        int p=n1*n2;
        
        int sum=(int )req.getAttribute("sum");
        out.print("<h4>Sum is : </h4> "+sum);
        out.print("<h4>Product is : </h4> "+p);
        
    }
    
}
