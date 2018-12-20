package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = {"/", "/home"})
public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        System.out.println("work");
//        resp.setHeader("contentType", "text/html");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<h1>Hello from h1</h1>");
//        writer.flush();
//        writer.close();
//
//        //Shift+F10
//        String msg = req.getParameter("msg");
//        String xxx = req.getParameter("xxx");
//        System.out.println("msg- "+msg);
//        System.out.println("xxx- "+xxx);
        req.setAttribute("msg", "Hello all");
        req.getRequestDispatcher("/index.jsp").forward(req, resp); // last row
    }
}
