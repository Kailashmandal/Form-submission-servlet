/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kailash.mavenproject1;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
/**
 *
 * @author admin
 */
public class MyHttpServlet2 extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException ,ServletException{
      res.setContentType("text/html");
      
      PrintWriter out=res.getWriter();
      out.print("<h4>Servlet 2 Response</h4>");
      String name=req.getParameter("user_name");
      String email=req.getParameter("user_email");
      String password=req.getParameter("user_password");
      
      String agree=req.getParameter("user_agreement");
      if(agree !=null && agree.equals("check")){
          out.print("<body><div>Name is : "+name+"</div> <div>Email is : "+email+"</div><div>Password is : "+password
                  + "</div></body>");
      }
      else{
          out.print("<h4>Please accept terms & conditions</h4>");
      }
    }
    
}
