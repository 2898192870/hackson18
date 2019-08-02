package com.qax.hackthon.team18.entity;

import org.apache.ibatis.type.Alias;

@Alias("userEntity")
public class UserEntity {
	private String username;
	private String pwd;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
