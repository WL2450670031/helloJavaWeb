package com.wule.web;

import com.wule.mapper.UserMapper;
import com.wule.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException
    {

        //接收用户名和密码
        String userName = request.getParameter("userName");
        String userPassword = request.getParameter("userPassword");

        //调用mybatis完成查询。
        //获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取Mapper
        UserMapper userMapper  = sqlSession.getMapper(UserMapper.class);


        //调用方法
        User user = userMapper.select(userName,userPassword);

        //释放资源
        sqlSession.close();

        response.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = response.getWriter();

        //判断user
        if(user != null)
        {
            printWriter.write("登录成功");
            //登录成功
        }
        else
        {
            printWriter.write("登录失败");
            //登录失败
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {

        this.doGet(request,response);
    }
}
