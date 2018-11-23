package com.starichat.onlineexam.service.impl;


import com.starichat.onlineexam.dao.UsersMapper;
import com.starichat.onlineexam.pojo.Users;
import com.starichat.onlineexam.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersMapper usersMapper;

	//2.2查询用户数据 实现
	@Override
	public List<Users> findUserInfo() {
		
		//2.3查询用户数据Dao（数据持久层）
		List<Users> findUserInfo = usersMapper.findUserInfo();
		
		return findUserInfo;
	}

	@Override
	public int deleteByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return usersMapper.deleteByPrimaryKey(userId);
	}

}
