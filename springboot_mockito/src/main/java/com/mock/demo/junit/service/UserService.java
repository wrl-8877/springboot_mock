package com.mock.demo.junit.service;

import org.springframework.stereotype.Service;

import com.mock.demo.junit.user.User;


@Service
public class UserService {

	/**
	 * 
	 * <B>方法名称：</B><BR>
	 * <B>概要说明：</B><BR>
	 * @param user
	 * @return
	 */
	public User add(User user) {
		User userNew = new User();
		userNew.setUserNama(user.getUserNama());
		userNew.setPassword(user.getPassword());
		userNew.setAge(user.getAge());
		userNew.setPhoneNum(user.getPhoneNum());
		return userNew;
	}
}
