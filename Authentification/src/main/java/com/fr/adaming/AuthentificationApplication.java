package com.fr.adaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fr.adaming.service.UserService;


@SpringBootApplication
public class AuthentificationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AuthentificationApplication.class, args);
		UserService service =  (UserService) context.getBean("userService");
	}

}
