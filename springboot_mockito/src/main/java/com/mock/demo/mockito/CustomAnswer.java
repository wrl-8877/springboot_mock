///**
// * Copyright 2020 SinoSoft. All Rights Reserved.
// */
//package com.mock.demo.mockito;
//
//import org.mockito.invocation.InvocationOnMock;
//import org.mockito.stubbing.Answer;
//

//public class CustomAnswer implements Answer<String>{
//
//	/**
//	 * <B>方法名称：</B><BR>
//	 * <B>概要说明：</B><BR>
//	 * @see org.mockito.stubbing.Answer#answer(org.mockito.invocation.InvocationOnMock)
//	 */
//	@Override
//    public String answer(InvocationOnMock invocation) throws Throwable {
//        Object[] args = invocation.getArguments();
//        //return "hello world:"+args[0];
//        Integer num = (Integer)args[0];  
//        if( num>3 ){  
//            return "大于三";  
//        } else {  
//            return "小于三";   
//        }
//	}	
//}
