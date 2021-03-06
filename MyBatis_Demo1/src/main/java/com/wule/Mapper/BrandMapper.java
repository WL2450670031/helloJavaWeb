package com.wule.Mapper;

import com.wule.pojo.Brand;

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
    List<Brand> selectByCondition_Dynamic(Map map);
    List<Brand> selectByCondition_Dynamic_Single(Brand brand);

    //添加
    void add(Brand brand);


    //修改
    int update(Brand brand);

}
