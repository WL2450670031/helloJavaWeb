package com.wule.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo2",loadOnStartup = 1)
public class ServletDemo2 implements Servlet
{

    /**
     * @功能 提供服务
     * @调用时机 每次Servlet被访问
     * @调用次数 多次
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
     * 初始化方法
     * 1. 调用时机：Servlet第一次被访问的时候。
     *  loadOnStartup
     * 2.调用次数：1
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException
    {
        System.out.println("init...");
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
     * @功能 销毁服务
     * @调用时机 1.内存释放 2.服务器关闭 ，Servlet对象被销毁时调用。
     * @调用次数 1
     */
    @Override
    public void destroy()
    {
        System.out.println("destroy...");
    }
}
