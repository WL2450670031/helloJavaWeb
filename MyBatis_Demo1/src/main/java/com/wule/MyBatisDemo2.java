package com.wule;

//mybatis代理开发

import com.wule.Mapper.UserMapper;
import com.wule.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo2
{
    public static void main(String[] args) throws IOException
    {
        //加载mybatis核心配置文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取对应的SqlSession对象，用它执行Sql。
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取UserMapper接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //4.执行SQL语句
        List<User> users = userMapper.selectAll();

        System.out.println(users);
        //5.释放资源
        sqlSession.close();
    }
}
