package com.mock.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mock.demo.title.dao")
public class SpringbootMockitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMockitoApplication.class, args);
	}

}
