package com.example.demo;

public class Bird extends Animal{
	
	public Bird() {
		super();
//		System.out.println("Bird Constructer");
	}
	
	@Override
	public void eat() {
        System.out.println("���B�ڳ�");
    }
	
	@Override
    public void sleep() {
        System.out.println("���B��˯");
    }

    public void flying() {
        System.out.println("Bird"+super.getName()+"���w");
    }

}

