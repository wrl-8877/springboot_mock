/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculateTest {

	private Calculate calculate;
	
	
    /**
     * 在每个方法执行前执行
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
         // 构建对象
         calculate=new Calculate();
    }
    /**
     * 在每个方法执行后执行
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    	
    }
    /**
     * 测试规范点:
     * 1、测试方法必须使用@Test注解，并且方法必须是public void，不能带任何参数；
     * 2、测试单元中的每个方法必须可以独立，测试方法之间不能有任何的依赖；
     * 3、测试方法一般使用test作为方法名的前缀
     */
    @Test
    public void testAdd() {
         //调用所需要测试的函数
         //真实值
         int result=calculate.add(10, 20);
         //期望值
         int expect=30;
         //断言
         //此处 0 代表的是误差值，当expect与result相差的绝对值小于这个值时测试通过。但大于等于时会失败。
         assertEquals(expect, result, 0);
    }
    
    
    @Test
    public void testSubstract() {
         // 调用被测函数
         int result=calculate.substract(10, 5);
         // 断言
         assertEquals(5, result);
    }
    
    
    @Test
    public void testMultiply() {
         int result = calculate.multiply(2, 3);
         assertEquals(6, result);
    }
   
}
