/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mock.demo.mockito.Calculator;



public class CalculatorTest {

	/**
	 * mock与spy
	 * mock：使用@Mock生成的类，所有方法都不是真实的方法，而且返回值都是NULL
	 * spy:使用@Spy生成的类，所有方法都是真实方法，返回值都是和真实方法一样的
	 */
	
	@Mock
	//@Spy
	Calculator c;

	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test(){
		int a =10;
		int b =5;
	    System.out.println(c.add(a, b));
	    
	    verify(c,times(1)).add(a, b);
	    //验证add方法是否执行
	    verify(c).add(a, b);
	} 
}
