package com.example.demo;

public class Cat extends Animal {
    
	public void meow() {
        System.out.println("Cat"+super.getName()+"����!!!!!");
    }
	
	@Override
	public void eat() {
		System.out.println("Cat"+super.getName()+"���ڳ�!!!!!");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cat"+super.getName()+"����˯!!!!!");
	
	}
}