package com.pauliceman.study.spring.a001.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pauliceman.study.spring.a001.implsrobot.T1000;

public class Start {
	public static void main (String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
		T1000 t1000 = (T1000) context.getBean("t1000component1");
		t1000.action();
	}
}
