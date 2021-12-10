package com.example.javaeeeeeee;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "FirstServlet", value = "/suka")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
         Integer count = (Integer) session.getAttribute("count");
         if (count == null){
             count = 1;
             session.setAttribute("count", count + 1);
         }
         else
             session.setAttribute("count", count + 1);


//        String name = request.getParameter("name");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<h1> you visit this site " + count + "  </h1>");
        out.println("</html>");

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
