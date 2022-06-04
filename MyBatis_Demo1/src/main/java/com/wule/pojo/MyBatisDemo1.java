package com.wule.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo1
{
    public static void main(String[] args) throws IOException
    {
        //加载mybatis核心配置文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取对应的SqlSession对象，用它执行Sql。
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.执行sql语句,namespace.id
        List<User> users = sqlSession.selectList("test.selectAll");

        System.out.println(users.size());//表的元组个数。
        for (int i = 0; i < users.size(); i++)
        {
            System.out.println(users.get(i));
        }



        //4.释放资源
        sqlSession.close();
    }
}
