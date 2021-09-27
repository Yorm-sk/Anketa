package com.example.anketa;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "countServlet", value = "/count-servlet")
public class CountServlet extends HttpServlet {
    private final int[] countArr = new int[8];

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String q1 = request.getParameter("quest1");
        String q2 = request.getParameter("quest2");
        String q3 = request.getParameter("quest3");
        if (q1 == null || q2 == null || q3 == null) {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<p>"+"You didn`t answer on some question"+"</p>");
            out.println("<a href = \"quest.jsp\">" + "Get back" + "</a>");
            out.println("</body></html>");

            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            countArr[Integer.parseInt(q1)]++;
            countArr[Integer.parseInt(q2)]++;
            countArr[Integer.parseInt(q3)]++;
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            String userName = request.getParameter("name");
            if (userName == null || userName.equals("")) out.println("<h3>"+"Thank you for participation Anonymous xD!" +"</h3>");
            else out.println("<h3>"+"Thank you for participation " + request.getParameter("name") +"!" +"</h3>");
            out.println("<a href = \"\\\">" + "Click here to quiz another person" + "</a>" + "<br>");
            out.println("<a href = \"\\count-servlet\">" + "Click here to summarise answers" + "</a>");
            out.println("</body></html>");
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h3>" + "Answers on question 1:" + "</h3>");
        out.println("<p>" + "Yes - " + countArr[0] + "</p>");
        out.println("<p>" + "No - " + countArr[1] + "</p>");
        out.println("<h3>" + "Answers on question 2:" + "</h3>");
        out.println("<p>" + "1 - " + countArr[2] + "</p>");
        out.println("<p>" + "2 - " + countArr[3] + "</p>");
        out.println("<p>" + "4 - " + countArr[4] + "</p>");
        out.println("<h3>" + "Answers on question 3:" + "</h3>");
        out.println("<p>" + "male - " + countArr[5] + "</p>");
        out.println("<p>" + "female - " + countArr[6] + "</p>");
        out.println("<p>" + "both - " + countArr[7] + "</p>");
        out.println("<a href = \"quest.jsp\">" + "Quiz another person" + "</a>");
        out.println("</body></html>");
    }

}