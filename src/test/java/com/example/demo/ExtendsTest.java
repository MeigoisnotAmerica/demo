package com.example.demo;

import org.junit.jupiter.api.Test;

public class ExtendsTest {
	
	@Test
	public void extendsTest(){
		Animal animal = new Animal();
		System.out.println("��eAnimal name:"+animal.getName());
		animal.eat();
		animal.sleep();
		Bird bird = new Bird();
		bird.setName("С��");
		System.out.println("��eBird name:"+bird.getName());
		bird.eat();
		bird.sleep();
		bird.flying();
		Cat cat = new Cat();
		cat.setName("�υ�");
		System.out.println("��eCat name:"+cat.getName());
		cat.meow();
		cat.eat();
		cat.eat();
	}
	@Test
	public void extendsTest2(){
		Animal animal = new Animal();
		System.out.println("��eAnimal name:"+animal.getName());
		animal.eat();
		Bird bird = new Bird();
		bird.setName("С��");
		System.out.println("��eBird name:"+bird.getName());
		bird.eat();
		Cat cat = new Cat();
		cat.setName("�υ�");
		System.out.println("��eCat name:"+cat.getName());
		cat.eat();
		System.out.println("///////////////////////////////////////////////////////////////");
		Animal animall = new Animal();
		animall.eat();
		Animal birdd = new Bird();
		birdd.eat();
		Animal catt = new Cat();
		catt.eat();
		
		
	}
}
