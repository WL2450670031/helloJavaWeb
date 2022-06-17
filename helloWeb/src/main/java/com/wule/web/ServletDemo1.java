package com.wule.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/demo1")
public class ServletDemo1 implements Servlet
{

    /**
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        System.out.println("hello servlet");
    }

    /**
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    /**
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    /**
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     *
     */
    @Override
    public void destroy() {

    }
}
