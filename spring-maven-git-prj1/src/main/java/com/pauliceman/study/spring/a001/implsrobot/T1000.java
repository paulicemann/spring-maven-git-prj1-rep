package com.pauliceman.study.spring.a001.implsrobot;

import com.pauliceman.study.spring.a001.robotinterfaces.Head;
import com.pauliceman.study.spring.a001.robotinterfaces.Robot;

public class T1000 implements Robot {
	private Head head1;
	
	public T1000() {
		
	}

	public T1000(Head head) {
		this.head1 = head;
	}

	public void action() {
		System.out.println("T1000.action()");
	}

}
