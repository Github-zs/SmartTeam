package com.zs.SmartTeam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.zs.SmartTeam.mapper")
public class SmartTeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartTeamApplication.class, args);
	}

}

