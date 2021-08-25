package com.BeanLearn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.BeanLearn.ea.E;

@SpringBootApplication
@ComponentScan
public class BeanLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanLearnApplication.class, args);
	}

}
