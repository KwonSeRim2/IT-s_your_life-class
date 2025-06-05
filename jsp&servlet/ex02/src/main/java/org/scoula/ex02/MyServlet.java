package org.scoula.ex02;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "MyServlet", urlPatterns = {"/xxx", "/yyy"})

public class MyServlet extends HttpServlet {


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        // Hello
        System.out.println("HelloServlet 요청");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello Servlet</h1>");
    }

    public void destroy()  {
        System.out.println("destroy 호출");
    }
    public void init() throws ServletException{
        System.out.println("init 호출");
    }
}