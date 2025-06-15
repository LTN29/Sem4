package com.spring1;

import java.util.UUID;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spring1.controller.HomeController;
import com.spring1.entities.User;


@SpringBootApplication
public class Spring1Application {
	@Value("${jwt.secretKey}")
	private String jwtKey;

	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
//		User user = new User();
//		user.setId(UUID.randomUUID());
	}

	@PostConstruct
	public void Test(){
		System.out.println("jwtKey" + jwtKey);
	}
}

