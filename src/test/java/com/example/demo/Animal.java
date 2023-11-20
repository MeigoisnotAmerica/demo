package com.example.demo;

public class Animal {
	private String name ="Fa";
	
	public Animal() {
		super();
//		System.out.println("Animal Constructer");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Animal"+name+"正在吃!!!!!");
	}
	
	public void sleep() {
		System.out.println("Animal"+name+"正在睡!!!!!");
	}
}