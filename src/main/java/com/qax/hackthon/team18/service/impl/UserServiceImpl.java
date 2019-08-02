package com.qax.hackthon.team18.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qax.hackthon.team18.dao.UserMapper;
import com.qax.hackthon.team18.entity.UserEntity;
import com.qax.hackthon.team18.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;
	
	public int login(UserEntity u) {
		// TODO Auto-generated method stub
		return userMapper.login(u);
	}

}
