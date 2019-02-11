package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.bean.College;

public class Apptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		College clge = (College) ctx.getBean("college");
		clge.collegeStudent();
	}

}
