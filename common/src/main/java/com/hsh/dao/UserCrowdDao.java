package com.hsh.dao;

import java.util.List;

import com.hsh.model.UserCrowd;


public interface UserCrowdDao {

	int saveOrUpdate(UserCrowd userCrowd);
	
	List<UserCrowd> getInCrowdList(int userId);
	
	List<UserCrowd> getEndCrowdList(int userId,int pageSize,int lastMinUserCrowdId);
	
	List<UserCrowd>  getUserCrowdByCrowdId(int crowdId,int pageSize);

	List<UserCrowd> getInCrowdList(int pageSize, int lastMinUserCrowdId);
}
