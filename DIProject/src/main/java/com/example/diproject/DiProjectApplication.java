package com.example.diproject;

import com.example.diproject.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiProjectApplication {

	public static void main(String[] args) {

		ApplicationContext actx = SpringApplication.run(DiProjectApplication.class, args);

		MyController myController = (MyController) actx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
