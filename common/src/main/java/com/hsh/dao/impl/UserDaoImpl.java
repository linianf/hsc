package com.hsh.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hsh.dao.UserDao;
import com.hsh.model.HSCUser;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public HSCUser getUserById(int userId) {
		String hql = "from HSCUser where id=:userId";
		return (HSCUser)sessionFactory.getCurrentSession().createQuery(hql)
	              .setInteger("userId", userId).uniqueResult();
	}

	@Override
	public int saveOrUpdate(HSCUser user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return user.getId();
	}

	@Override
	public HSCUser getUserById(String mobile) {
		String hql = "from HSCUser where mobile=:mobile";
		return (HSCUser)sessionFactory.getCurrentSession().createQuery(hql)
	              .setString("mobile", mobile).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HSCUser> getUsersRecommend(int userId) {
		//先查询recommend关系
		String hql = " from HSCUser where recommendUserId=:userId";
		List<HSCUser> list = (List<HSCUser>)sessionFactory.getCurrentSession().createQuery(hql)
	              .setInteger("userId", userId).list(); 
	    return list;
	}

}
