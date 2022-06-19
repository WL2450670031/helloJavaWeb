package com.wule.web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//创建于2022/6/18 12:10
@WebServlet("/resp1")
public class responseDemo1 extends HttpServlet
{
    /**
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println("response1...");

       //重定向
       /* resp.setStatus(302);
        resp.setHeader("location","/helloWeb_war/resp2");*/


        //简化方式
        resp.sendRedirect("/helloWeb_war/resp2");
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
        this.doGet(req,resp);
    }
}
