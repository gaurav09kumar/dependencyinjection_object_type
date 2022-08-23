package com.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*
		 * Student stud1 = new Student(); MathCheat cheat = new MathCheat();
		 * stud1.setMathCheat(cheat);
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		Student stud1 = context.getBean("stud1", Student.class);
		stud1.cheating();

		AnotherStudent stud2 = context.getBean("stud2", AnotherStudent.class);
		stud2.startCheating();
	}
}
