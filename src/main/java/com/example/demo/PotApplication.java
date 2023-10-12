package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.mapper.*"})

@SpringBootApplication
public class PotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PotApplication.class, args);
	}
}