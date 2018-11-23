package com.starichat.onlineexam.service;


import com.starichat.onlineexam.pojo.Users;

import java.util.List;

public interface UsersService {
    //查询所有用户
    
	//2.1查询用户数据 接口
    List<Users> findUserInfo();
    
    //删除用户信息
   int deleteByPrimaryKey(String userId);

}
