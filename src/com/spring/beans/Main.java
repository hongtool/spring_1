package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//spring:IOC容器,可以动态创建对象
public class Main {

	public static void main(String[] args) {
		/*Person p = new Person();
		p.setName("张三");
		p.setAge(15);*/
		
		//获取容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		//通过容器对象获取已经配置的javabean
//		Person person1 = (Person) ac.getBean("person1");
//		System.out.println(person1);
//		Dog dog1 = (Dog) ac.getBean("dog1");
//		Dog dog1 = ac.getBean(Dog.class);
		
//		Dog dog1 = ac.getBean("dog1", Dog.class);
//		Dog dog2 = ac.getBean("dog2", Dog.class);
//		System.out.println(dog1);
//		System.out.println(dog2);
		
//		Dog dog3 = ac.getBean("dog3", Dog.class);
//		System.out.println(dog3);
		
//		Car car1 = ac.getBean("car1", Car.class);
//		System.out.println(car1);
//		Car car2 = ac.getBean("car2", Car.class);
//		System.out.println(car2);
		
		/*Car car1 = ac.getBean("car1", Car.class);
		System.out.println(car1);
		Person person1 = (Person) ac.getBean("person1");
		System.out.println(person1);
		
		Person person2 = (Person) ac.getBean("person2");
		System.out.println(person2);*/
		
		Person person3 = (Person) ac.getBean("person3");
		System.out.println(person3);
	}
}
