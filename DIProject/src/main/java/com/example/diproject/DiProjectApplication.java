package com.example.diproject;

import com.example.diproject.Controllers.ConstructorInjectedController;
import com.example.diproject.Controllers.MyController;
import com.example.diproject.Controllers.PropertyInjectedController;
import com.example.diproject.Controllers.SetterInjectedController;
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
		System.out.println("Property ----");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) actx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("Setter ----");
		SetterInjectedController setterInjectedController = (SetterInjectedController) actx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Constructor ----");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) actx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
