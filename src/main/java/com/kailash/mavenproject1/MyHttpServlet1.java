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
public class MyHttpServlet1 extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.print("<h4>This is registeration servlet</h4>");
        String name = req.getParameter("user_name");
        String lastname = req.getParameter("user_last_name");
        String password = req.getParameter("user_password");
        int age = Integer.parseInt(req.getParameter("user_age"));
        String email = req.getParameter("user_email");
        String course = req.getParameter("user_course");
        String gender = req.getParameter("user_gender");
        String cond = req.getParameter("user_agreement");
     //   out.print("<h4>"+course+"</h4>");
        if (cond != null && cond.equals("check")) {
            out.println("<h4> Name is : " + name +"  "+lastname+ "</h4>");
            out.println("<h4> Email is : " + email + "</h4>");
            out.println("<h4> Password is : " + password+ "</h4>");
            out.println("<h4> Your cour se is : " + course + "</h4>");
           
        }else{
            out.print("<h4>Please accept terms and conditions.</h4>");
        }
    }
}
