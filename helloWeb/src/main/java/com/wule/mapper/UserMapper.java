package com.wule.mapper;

import com.wule.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//创建于2022/6/19 23:25
public interface UserMapper
{
    /**
     * @作用 根据用户输入的参数进行查询
     */
    @Select("select * from user where userName=#{userName} and userPassword=#{userPassword};")
    User select(@Param("userName") String userName,@Param("userPassword") String userPassword);

}
