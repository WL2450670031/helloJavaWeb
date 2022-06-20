package com.wule.web.Serv;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo3")
public class ServletDemo3 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    {
        System.out.println("get...");

        System.out.println(req.getAttribute("wule"));
    }

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)
    {
        System.out.println("post...");
    }
}
