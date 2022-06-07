package com.wule.test;

import com.wule.Mapper.BrandMapper;
import com.wule.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest
{
    @Test
    public void selectAllTest() throws IOException
    {
        //1.加载mybatis核心配置文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取对应的SqlSession对象，用它执行Sql。
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取UserMapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行SQL语句
        List<Brand> brands = brandMapper.selectAll();

        System.out.println(brands);

        //5.释放资源
        sqlSession.close();
    }

    @Test
    public void selectByIdTest() throws IOException
    {
        Integer id = 1;//参数

        //1.加载mybatis核心配置文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取对应的SqlSession对象，用它执行Sql。
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取UserMapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行SQL语句
        List<Brand> brands = brandMapper.selectById(id);

        System.out.println(brands);

        //5.释放资源
        sqlSession.close();
    }
}
