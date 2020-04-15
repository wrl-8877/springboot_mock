/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.mockito;

import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class MockitoTest {

	
	/**
	 *  Mockito.mock(classToMock)
		Mockito.verify(mock)
		Mockito.when(methodCall).thenReturn(value1).thenReturn(value2)
		Mockito.doThrow(toBeThrown).when(mock).[method]
		Mockito.mock(classToMock,defaultAnswer)
		Mockito.when(methodCall).thenReturn(value)
		Mockito.doReturn(toBeReturned).when(mock).[method]
		Mockito.when(methodCall).thenAnswer(answer))
		Mockito.doAnswer(answer).when(methodCall).[method]
		Mockito.spy(Object)
		Mockito.doNothing().when(mock).[method]
		Mockito.doCallRealMethod().when(mock).[method]
		reset(mock)
	 */

	 /*
	  * Mockito.verify(mock)
	  * 验证行为是否发生
	  */
	 @Test
	 public void verify(){
		//模拟创建一个List对象
		List<Integer> mock =  Mockito.mock(List.class);
		//调用mock对象的方法
		mock.add(1);
		mock.clear();
		//验证方法是否执行
		Mockito.verify(mock).add(1);
		Mockito.verify(mock).clear();
     }
	
	
	 /*
	  * Mockito.when(methodCall).thenReturn(value1).thenReturn(value2)
	  * 多次触发返回不同值
	  */
	 @Test
	 public void returnT(){
		//mock一个Iterator类
		 Iterator iterator = mock(Iterator.class);
		 //预设当iterator调用next()时第一次返回hello，第n次都返回world
		 Mockito.when(iterator.next()).thenReturn("hello").thenReturn("world");
		 //使用mock的对象
		 String result = iterator.next() + " " + iterator.next()+ " " + iterator.next()+ " " + iterator.next();
		 //验证结果
		 Assert.assertEquals("hello world world world",result);
     }
	 
	
	
	 /*
	  * Mockito.when(methodCall).thenReturn(value)
	  * 抛出异常
	  */
	 @Test(expected = IOException.class)//期望报IO异常
	 public void when_thenThrow() throws IOException{
	       OutputStream mock = Mockito.mock(OutputStream.class);
	       //预设当流关闭时抛出异常
	       Mockito.doThrow(new IOException()).when(mock).close();
	       mock.close();
	  }
	 
	 
	
	  /*
	   * Mockito.when(methodCall).thenReturn(value)
	   * 使用默认Answer模拟对象
	   */
	  @Test
	  public void deepstubsTest(){
	      A a=Mockito.mock(A.class,Mockito.RETURNS_DEEP_STUBS);
	      Mockito.when(a.getB().getName()).thenReturn("Beijing");
	      Assert.assertEquals("Beijing",a.getB().getName());
	  }
	 
	  @Test
	  public void deepstubsTest2(){
	      A a=Mockito.mock(A.class);
	      B b=Mockito.mock(B.class);
	      Mockito.when(a.getB()).thenReturn(b);
	      Mockito.when(b.getName()).thenReturn("Beijing");
	      Assert.assertEquals("Beijing",a.getB().getName());
	  }
	
   
      
	  /*
	   * Mockito.when(methodCall).thenReturn(value)
	   * 参数匹配
	   */
	  @Test
	  public void with_arguments(){
	      B b = Mockito.mock(B.class);
	      //预设根据不同的参数返回不同的结果
	      Mockito.when(b.getSex(1)).thenReturn("男");
	      Mockito.when(b.getSex(2)).thenReturn("女");
	      Assert.assertEquals("男", b.getSex(1));
	      Assert.assertEquals("女", b.getSex(2));
	      //对于没有预设的情况会返回默认值
	      Assert.assertEquals(null, b.getSex(0));
	  }
	 
	
	  /*
	   * Mockito.when(methodCall).thenAnswer(answer))
	   * 预期回调接口生成期望值
	   */
//	  @Test
//	  public void answerTest(){
//	      List mockList = Mockito.mock(List.class);
//	      //使用方法预期回调接口生成期望值（Answer结构）
//	      Mockito.when(mockList.get(Mockito.anyInt())).thenAnswer(new CustomAnswer());
//	      Assert.assertEquals("hello world:0",mockList.get(0));
//	      Assert.assertEquals("hello world:999",mockList.get(999));
//	  }
	
	/*
	 * Mockito.doAnswer(answer).when(methodCall).[method]
	 * 预期回调接口生成期望值(直接执行不判断)
	 */
//	@Test
//	public void testAnswer1(){
//	List<String> mock = Mockito.mock(List.class);  
//	      Mockito.doAnswer(new CustomAnswer()).when(mock).get(Mockito.anyInt());  
//	      Assert.assertEquals("大于三", mock.get(4));
//	      Assert.assertEquals("小于三", mock.get(1));
//
//	}
	
	/*
	 * Mockito.spy(Object)
	 * 用spy监控真实对象,设置真实对象行为
	 */
	@Test
    public void spy_on_real_objects(){
		List list = new ArrayList<>();
        List spy = Mockito.spy(list);
      
        Mockito.doReturn(999).when(spy).get(2);
        //预设size()期望值
        Mockito.when(spy.size()).thenReturn(100);
        //调用真实对象的api
        spy.add(1);
        spy.add(2);
        Assert.assertEquals(100,spy.size());
        Assert.assertEquals(1,spy.get(0));
        Assert.assertEquals(2,spy.get(1));
        Assert.assertEquals(999,spy.get(2));
    }

	  
	  /*
	   * Mockito.doNothing().when(mock).[method]
	   * 不做任何返回
	   */
	  @Test
	  public void Test() {
	      B b = Mockito.mock(B.class);
	      //void 方法才能调用doNothing()
	      Mockito.doNothing().when(b).setName(Mockito.anyString());
	      b.setName("bb");
	      Assert.assertEquals(null,b.getName());
	  }
	 
	  /*
	   * Mockito.doCallRealMethod().when(mock).[method]
	   * 调用真实的方法
	   */
	  @Test
	  public void TestReal() {
		  B b = Mockito.mock(B.class);
	      //void 方法才能调用doNothing()
	      Mockito.when(b.getName()).thenReturn("bb");
	      Assert.assertEquals("bb",b.getName());
	      //等价于Mockito.when(a.getName()).thenCallRealMethod();
	      Mockito.doCallRealMethod().when(b).getName();
	      Assert.assertEquals("zhangsan",b.getName());
	  }
	 
	/*
	 * reset(mock)
	 * 重置mock
	 */
    @Test
    public void reset_mock(){
        List list = mock(List.class);
        Mockito. when(list.size()).thenReturn(10);
        list.add(1);
        Assert.assertEquals(10,list.size());
        //重置mock，清除所有的互动和预设
        Mockito.reset(list);
        Assert.assertEquals(0,list.size());
    }
	
    
}
