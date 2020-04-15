/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class JunitDemoTest {
	
	    List<String>  list = new ArrayList<String>();	
		@Before
		public  void init(){
			list.add("java 语言");
			list.add("Python 语言");
		}
		
		@Test
		public  void test(){
			System.out.println("test"+list);
		}	
		
		@Ignore
		public  void Ignore(){
			System.out.println("Ignore"+list);
		}	
		
//		@After
//		public  void clear(){
//			list.clear();
//			System.out.println("clear:"+list);
//		}	
}	
//		@BeforeClass
//		public static void test1(){
//			System.out.println("test1");
//		}
//		@Before
//		public  void test2(){
//			System.out.println("test2");
//		}	
//		@Test
//		public  void test3(){
//			System.out.println("test3");
//		}	
//		@After
//		public  void test4(){
//			System.out.println("test4");
//		}	
//		@AfterClass
//		public static void test5(){
//			System.out.println("test5");
//		}
//		@Ignore
//		public static void test6(){
//			System.out.println("test6");
//		}

