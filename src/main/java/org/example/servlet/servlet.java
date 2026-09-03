package org.example.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
@WebServlet("/login")
public class servlet extends HttpServlet {
    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {
        // 1. Correctly retrieve and declare the variables at the method level
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body style='text-align:center; margin-top:100px;'>");
        out.println("<h1>User Details</h1>");

// 2. Ensure the exact variable names match here
        out.println("<p><b>Username:</b> " + username + "</p>");
        out.println("<p><b>Password:</b> " + password + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}