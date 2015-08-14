package com.hsh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hsh.dao.UserCrowdDao;
import com.hsh.model.UserCrowd;
import com.hsh.service.UserCrowdService;

/**
 * 
 * @author linianf
 *
 */
@Service("userCrowdService")
@Transactional(readOnly=true)
public class UserCrowdServiceImpl implements UserCrowdService{

	@Autowired
	private UserCrowdDao userCrowdDao;

	@Override
	@Transactional(readOnly=false)
	public int saveOrUpdate(UserCrowd userCrowd) {
		return userCrowdDao.saveOrUpdate(userCrowd);
	}

	@Override
	public List<UserCrowd> getInCrowdList(int userId) {
		return userCrowdDao.getInCrowdList(userId);
	}

	@Override
	public List<UserCrowd> getEndCrowdList(int userId, int pageSize,
			int lastMinUserCrowdId) {
		return userCrowdDao.getEndCrowdList(userId, pageSize, lastMinUserCrowdId);
	}

	@Override
	public List<UserCrowd> getUserCrowdByCrowdId(int crowdId, int pageSize) {
		return userCrowdDao.getUserCrowdByCrowdId(crowdId, pageSize);
	}

	@Override
	public List<UserCrowd> getInCrowdList(int pageSize, int lastMinUserCrowdId) {
		return userCrowdDao.getInCrowdList(pageSize,lastMinUserCrowdId);
	}

	@Override
	@Transactional(readOnly=false)
	public void dealUserCrowdPay(int crowdId) {
		
	}
	

}
