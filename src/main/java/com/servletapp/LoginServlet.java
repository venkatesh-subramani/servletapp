package com.servletapp;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        PrintWriter printWriter = response.getWriter();
        if(name.equals("Vigneshwari") && password.equals("Vigneshwari@30")){
            printWriter.println("Hello Vigneshwari, logged in successfully...");
            printWriter.println(request.getQueryString());
            printWriter.println(request.getContentType());
        }else{
            printWriter.println("Incorrect Credentials...Please try with correct username/password");
        }
        printWriter.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}