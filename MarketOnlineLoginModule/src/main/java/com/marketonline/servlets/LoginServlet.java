package com.marketonline.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("login.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        if ("admin".equals(usuario) && "1234".equals(password)) {
            request.setAttribute("nombreUsuario", usuario);
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } else {
            response.getWriter().println("<h3>Credenciales incorrectas. <a href='login.html'>Volver</a></h3>");
        }
    }
}
