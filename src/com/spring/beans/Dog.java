package com.spring.beans;

public class Dog {

	private String type;

	//IOC容器创建对象时，必须提供无参构造器
	public Dog() {
		System.out.println("初始化创建了Dog");
	}

	public Dog(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Dog [type=" + type + "]";
	}

}
