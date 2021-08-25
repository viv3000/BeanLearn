package com.BeanLearn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.BeanLearn.ea.E;

@SpringBootApplication
@ComponentScan(basePackages = {"com.BeanLearn.ea.E"})
public class BeanLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanLearnApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
		
		A a = context.getBean("ABean", A.class);
		E e = context.getBean("EBean", E.class);
		System.out.println(a);
		System.out.println(e);

		((ConfigurableApplicationContext) context).close();

	}

}
