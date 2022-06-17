package com.wule.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req1")
public class RequestDemo1 extends HttpServlet
{
    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String method = req.getMethod();
       System.out.println(method);

       String contextPath = req.getContextPath();
       System.out.println(contextPath);

       StringBuffer url = req.getRequestURL();
       System.out.println(url);

        String uri = req.getRequestURI();
        System.out.println(uri);

        String queString = req.getQueryString();
        System.out.println(queString);

        String agent = req.getHeader("user-agent");
        System.out.println(agent);

    }

    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //获取字符输入流
       BufferedReader bufferedReader = req.getReader();

       //读取数据
       String line = bufferedReader.readLine();
       System.out.println(line);
    }
}
