package com.qax.hackthon.team18.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qax.hackthon.team18.entity.UserEntity;
import com.qax.hackthon.team18.service.IUserService;




@RequestMapping("/users")
@Controller
public class UserController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/login")
	/* value = "/login",method = RequestMethod.GET */
	@ResponseBody
	public int login(HttpServletRequest request,HttpSession session){
		String un = request.getParameter("name");
		String pw = request.getParameter("pwd");
		UserEntity u = new UserEntity();
		u.setUsername(un);
		u.setPwd(pw);
		if (userService.login(u) == 1) {
             System.out.println("登录成功");
			return 1;
		} else {
            System.out.println("登录失败");

			return 2;
		}
	}

}
