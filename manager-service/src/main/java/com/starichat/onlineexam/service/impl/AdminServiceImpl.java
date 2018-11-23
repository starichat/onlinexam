package com.starichat.onlineexam.service.impl;


import com.starichat.onlineexam.dao.AdminMapper;
import com.starichat.onlineexam.pojo.Users;
import com.starichat.onlineexam.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;
	
	//查询用户名-密码--接口
	@Override
	public Users findByUser(Users users) {
		
		Users user = adminMapper.findByUser(users);
		
		return user;
	}

}
