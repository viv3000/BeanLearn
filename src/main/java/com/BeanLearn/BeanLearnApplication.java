package com.BeanLearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class BeanLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanLearnApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		A a = context.getBean("ABean1", A.class);
		
		System.out.println(a);

		((ConfigurableApplicationContext) context).close();

	}

}
