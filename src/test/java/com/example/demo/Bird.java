package com.example.demo;

public class Bird extends Animal{
	
	public Bird() {
		super();
//		System.out.println("Bird Constructer");
	}
	
	@Override
	public void eat() {
        System.out.println("大鳥在吃");
    }
	
	@Override
    public void sleep() {
        System.out.println("大鳥在睡");
    }

    public void flying() {
        System.out.println("Bird"+super.getName()+"在飛");
    }

}

