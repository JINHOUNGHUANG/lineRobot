package com.example.lineechorobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.lineechorobot.*")
public class LineEchoRobotApplication {

	public static void main(String[] args) {
		SpringApplication.run(LineEchoRobotApplication.class, args);
	}

}
