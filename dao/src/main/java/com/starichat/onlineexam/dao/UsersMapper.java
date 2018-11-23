package com.starichat.onlineexam.dao;


import com.starichat.onlineexam.pojo.Users;

import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(String userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    //查询所有用户
    //2.4查询用户数据Dao（数据持久层） 写SQL 的接口
    List<Users> findUserInfo();
}