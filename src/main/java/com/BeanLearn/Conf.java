package com.BeanLearn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.BeanLearn.ea.E;
import com.BeanLearn.A;

@Configuration
public class Conf{
	@Bean
	public A a(){
		return new A();
	}

	@Bean
	public E e(){
		return new E();
	}

}
