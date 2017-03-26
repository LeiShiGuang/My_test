package com.jikexueyuan.demo.springmvc.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {

	public ModelAndView doLogin(String loginPageUrl, String successPageUrl, String uname, String upasswd) {
		// TODO Auto-generated method stub
		
		if (uname == null || "".equals(uname)){
			return new ModelAndView(loginPageUrl,"error","Username canot be null");
		}
		if (upasswd == null || "".equals(upasswd)){
			return new ModelAndView(loginPageUrl,"error","Userpssswd canot be null");
		}
		
		// uname = admin , passwd = 123
		
		if (uname.equals("admin") && upasswd.equals("123")){
			return new ModelAndView(successPageUrl);
		}
				
		return new ModelAndView(loginPageUrl,"error","username or passworld error.");
	}

}
