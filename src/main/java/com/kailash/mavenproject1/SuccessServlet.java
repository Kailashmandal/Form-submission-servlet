/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kailash.mavenproject1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

/**
 *
 * @author admin
 */
public class SuccessServlet extends HttpServlet {
      
       @Override
       public void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException{
         resp.setContentType("text/html");
         PrintWriter out=resp.getWriter();
         out.print("<h3>This Success Servlet , form is successfully registered.</h3>");
}
  
}
