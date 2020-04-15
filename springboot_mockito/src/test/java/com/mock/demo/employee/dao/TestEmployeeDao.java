/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.employee.dao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.mock.demo.employee.entity.EmployeeVO;


//@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeDao {

		
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void TestMock(){
		EmployeeDao employeeDao = mock(EmployeeDao.class);		
		EmployeeVO emp = new EmployeeVO(1, "John", "John", "John@email.com");	
		//调用添加方法
		employeeDao.addEmployee(emp);
		//验证是否执行addEmployee()
		verify(employeeDao, times(1)).addEmployee(emp);		
		//assertEquals(emp, employeeDao.getEmployeeById(1));
	}	
	@Test
	public void TestSpy(){
		EmployeeDao employeeDao = spy(EmployeeDao.class);					
		EmployeeVO emp = new EmployeeVO(1, "John", "John", "John@email.com");	
		//调用添加方法
		employeeDao.addEmployee(emp);
		//验证是否执行addEmployee()
		verify(employeeDao, times(1)).addEmployee(emp);		
		assertEquals(emp, employeeDao.getEmployeeById(1));
	}
	
}
