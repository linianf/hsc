package com.hsh.service;

import java.util.List;

import com.hsh.model.HSCUser;

public interface UserService {

    HSCUser  getUserById(int userId);
	
	int saveOrUpdate(HSCUser user);
	
	HSCUser  getUserById(String mobile);
	
	List<HSCUser> getUsersRecommend(int userId);
}
