package com.guide_finder.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class SiginInServlet extends HttpServlet{
    public void goGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException, ServletException {

        //print login page
        response.setContentType("text/html;charset=utf-8");
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        response.setStatus(HttpServletResponse.SC_OK);

    }
}
