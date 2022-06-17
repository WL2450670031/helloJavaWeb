package com.wule.web;

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
    }

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)
    {
        System.out.println("post...");
    }
}
