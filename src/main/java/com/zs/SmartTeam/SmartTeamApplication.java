package com.zs.SmartTeam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zs.SmartTeam.mapper")
public class SmartTeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartTeamApplication.class, args);
	}

}

