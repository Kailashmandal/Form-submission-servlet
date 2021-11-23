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
public class MyHttpServlet5 extends HttpServlet {
      public void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException , ServletException{
       resp.setContentType("text/html");
       PrintWriter out=resp.getWriter();
       boolean f= false;
       String str=req.getParameter("just_input");
       String uname ="";
     //  String n=req.getParameter("user_name");
      Cookie ck[]=req.getCookies();
      
      if(ck==null){
          out.print("<h4>New user go and this is home page</h4>");
          return;
      }else{
          for(Cookie c:ck){
              String tname=c.getName();
              if(tname.equals("name")){
                  f=true;
                  
                  uname=c.getValue();
              }
          }
      }
      if(f){
          out.print("<h4>Hye "+uname+" welcome back to my website</h4>");
          out.print("<h4>Thankyou !</h4>");
      } else{
                  out.print("<h4>New user go and this is home page</h4>"); 
                  }
      
      out.close();
}
    
    
}
