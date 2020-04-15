/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.employee.entity;

import lombok.Data;


@Data
public class EmployeeVO {

	private int employeeId ;
	
	private String firstName;
	
	private String lastName;
	
	private String email;

	/**
	 * <B>构造方法</B><BR>
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public EmployeeVO(int employeeId, String firstName, String lastName, String email) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}	
}
