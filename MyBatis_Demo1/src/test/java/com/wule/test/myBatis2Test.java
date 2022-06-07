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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class myBatis2Test
{
    @Test
    public void selectByConditionTest() throws IOException
    {
        //参数
        int status = 1;
        String companyName = "%华为%";
        String brandName = "%华为%";

        //封装参数对象
//        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);
        //hashMap
        Map map = new HashMap();
        map.put("status",status);
        map.put("companyName",companyName);
        map.put("brandName",brandName);


        //1.加载mybatis核心配置文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取对应的SqlSession对象，用它执行Sql。
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取UserMapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行SQL语句
        //List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);
        List<Brand> brands = brandMapper.selectByCondition(map);

        System.out.println(brands);

        //5.释放资源
        sqlSession.close();
    }
}
