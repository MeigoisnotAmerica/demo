package com.example.demo;

public class Cat extends Animal {
    
	public void meow() {
        System.out.println("Cat"+super.getName()+"在喵!!!!!");
    }
	
	@Override
	public void eat() {
		System.out.println("Cat"+super.getName()+"正在吃!!!!!");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat"+super.getName()+"正在睡!!!!!");
	
	}
}