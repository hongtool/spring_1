package com.spring.beans;

import java.util.List;
import java.util.Map;

public class Person {

	private String name;
	private int age;
	private List<Car> cars;
	private Map<String, Car> maps;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Map<String, Car> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Car> maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + ", maps=" + maps + "]";
	}

	// public Car getCar() {
	// return car;
	// }
	//
	// public void setCar(Car car) {
	// this.car = car;
	// }
}
