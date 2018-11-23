package com.starichat.onlineexam.service;


import com.starichat.onlineexam.pojo.Users;

/**
 * 业务管业务类
 * @author XiaoBingBy
 *
 */
public interface AdminService {

	//查询用户名-密码--接口
	 Users findByUser(Users users);
	
}
