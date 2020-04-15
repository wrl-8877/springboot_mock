/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.junit.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mock.demo.junit.user.User;


public class UserServiceTest {

	/**
	 * <B>方法名称：</B><BR>
	 * <B>概要说明：</B><BR>
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.mock.demo.junit.service.UserService#add(com.mock.demo.junit.user.User)}.
	 */
	@Test
	public void testAdd() {
		User user = new User();
		user.setUserNama("万达");
		user.setPassword("123456");
		user.setAge(22);
		user.setPhoneNum("13045670098");
		assertEquals(user, new UserService().add(user));
	}

}
