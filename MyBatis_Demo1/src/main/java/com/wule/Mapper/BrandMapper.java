package com.wule.Mapper;

import com.wule.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper
{
    List<Brand> selectAll();

    List<Brand> selectById(Integer id);

    // 1. 散装参数
    // List<Brand> selectByCondition(@Param("status") int status,@Param("companyName") String companyName,@Param("brandName") String brandName);
   //2. 对象参数
    // List<Brand> selectByCondition(Brand brand);
    //3. Map参数
    List<Brand> selectByCondition(Map map);
}
