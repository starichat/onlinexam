package com.starichat.onlineexam.dao;


import com.starichat.onlineexam.pojo.Users;

public interface AdminMapper {
	
	//查询用户 id 密码
	Users findByUser(Users users);
	
}
