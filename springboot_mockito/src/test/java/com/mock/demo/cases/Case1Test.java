/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Case1Test {

	//junit 单元测试方法之间不能有相互依赖	
	@Test
	public void testCase(){
		int a=1,b=2;
		Case1 cases = new Case1();
		assertEquals(3, cases.add(a, b));		
	}
}
