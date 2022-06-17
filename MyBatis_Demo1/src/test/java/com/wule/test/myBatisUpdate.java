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

public class myBatisUpdate
{

    @Test
    public void updateTest() throws IOException
    {
        Integer status = 1;//参数
        String companyName = "吴乐";
        String brandName = "纯如也";
        String description = "日天";
        int ordered = 200;
        int id = 1;


        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setId(id);

        // 1.加载mybatis核心配置文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取对应的SqlSession对象，用它执行Sql。
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取UserMapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行SQL语句
        System.out.println(brandMapper.update(brand));

        //提交事务。
        sqlSession.commit();
        //5.释放资源
        sqlSession.close();
    }
}
