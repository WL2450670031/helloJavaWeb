package com.wule.web.response;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

//创建于2022/6/18 16:39
@WebServlet("/resp4")
public class ResponseDemo4 extends HttpServlet
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
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\吴乐\\Pictures\\cwj.jpg");

        ServletOutputStream servletOutputStream = resp.getOutputStream();
        IOUtils.copy(fileInputStream,servletOutputStream);

        fileInputStream.close();
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
