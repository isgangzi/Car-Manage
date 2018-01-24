package com.CarManage;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages={"com.CarManage.service","com.CarManage.controller","com.CarManage.config"})
@MapperScan(basePackages="com.CarManage.dao")
public class CarManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarManageApplication.class, args);
	}

}
