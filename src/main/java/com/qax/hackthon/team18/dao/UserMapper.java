package com.qax.hackthon.team18.dao;

import com.qax.hackthon.team18.entity.UserEntity;

public interface UserMapper {
	/**
	 * 验证用户登录
	 * @param user
	 * @return 账号密码正确返回1，错误返回0
	 */
	public int login(UserEntity user);
}
