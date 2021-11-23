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
public class MyHttpServlet4 extends HttpServlet {
        @Override
        public void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException , ServletException{
       resp.setContentType("text/html");
       PrintWriter out=resp.getWriter();
       
       String n=req.getParameter("user_name");
       out.print("<h4>Welcome "+n+"</h4>");
       
       Cookie ck=new Cookie("name" ,n);
       resp.addCookie(ck);
       
       out.println("<form action= 'MyHttpServlet5'> ");
       out.println("<input type='text' placeholder='enter text' name='just_input'>");
       out.println("<button type='submit' >ok</button>");
       out.close();
}
    
}
