package com.hsh.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.hsh.vo.AjaxResult;

@Controller
public class LoginController {

	private static Logger log = LoggerFactory.getLogger(LoginController.class);
	
	public  AjaxResult login(String username, String password){
		log.info("user:" + username + " logging");
		return null;
	}
}
