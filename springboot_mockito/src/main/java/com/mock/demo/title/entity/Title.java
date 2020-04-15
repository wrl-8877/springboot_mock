/**
 * Copyright 2020 SinoSoft. All Rights Reserved.
 */
package com.mock.demo.title.entity;

import lombok.Data;


@Data
public class Title {
   
	private Integer id;

    private String title;
    
   

	/**
	 * <B>构造方法</B><BR>
	 */
	public Title() {
		super();
	}
    
    /**
	 * <B>构造方法</B><BR>
	 * @param id
	 * @param title
	 */
	public Title(Integer id, String title) {
		super();
		this.id = id;
		this.title = title;
	}



	@Override
	public String toString() {
		return "IdTitle [id=" + id + ", title=" + title + "]";
	}

}

	

