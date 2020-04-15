/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.mockito;


public class B {

	private String name;
//    public String getName(){
//        return name;
//    }
	
	public String getName(){
       return "zhangsan";
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSex(Integer sex){
        if(sex==1){
            return "man";
        }else{
            return "woman";
        }
    }


}
