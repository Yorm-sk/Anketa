package com.example.anketa;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet{

    private static final String login = "admin";
    private static final String password = "12345";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (login.equals(LoginServlet.login) && password.equals(LoginServlet.password)){
            response.sendRedirect("quest.jsp");
        }
        else {
            response.sendRedirect("/");
        }

    }
}