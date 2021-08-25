package com.BeanLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class F{
	
	@Autowired
	public A a;

	public F(A a){
		System.out.println(a);
	}
}


