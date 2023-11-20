package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ClassTest {

	@Test
	public void firstTest() {
		int[] a = new int[10];
		System.out.println(a);
		System.out.println(a.length);
		a[0] = 3;
		a[1] = 1;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;
		a[5] = 7;
		a[6] = 8;
		a[7] = 9;
		a[8] = 10;
		a[9] = 11;
		System.out.println(
				a[0] + "" + a[1] + "" + a[2] + "" + a[3] + "" + a[4] + "" + a[5] + "" + a[6] + "" + a[7] + "" + a[8]);
		System.out.println("���������a");
		System.out.println("");
		int[] b = { 3, 1, 4, 1, 5, 9, 2, 6 };
		System.out.println(b);
		System.out.println(b.length);
		System.out.println(b[0] + "" + b[1] + "" + b[2] + "" + b[3] + "" + b[4] + "" + b[5] + "" + b[6] + "" + b[7]);
		System.out.println("���������b");
	}

	@Test
	public void secondTest() {
		// List��һ�N����(interface)����e(class)���ԛ]��new{���xһ���������]�Ќ��H����}
		List<String> c = new ArrayList<>();
		// List <�Y���͑B> c = new ArrayList<�Y���͑B(��ʡ)>();
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");
		c.add("E");
		c.add("F");
		System.out.println(c);
		System.out.println(c.size());
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
		System.out.println("������List c���������");
		System.out.println("");
		
		List<String> d = List.of("A","B","C","D","E","F","G","H","I","J");
		System.out.println(d);
		System.out.println("������List d(List.of)��������У���С�̶��������h(����:һ�_ʼ�ͮ���ͬһ�D��)");
		System.out.println("");
		
		List<String> e = Arrays.asList("A","B","C","D","E");
		System.out.println(e);
		System.out.println("������List e(.asList)��������У���С�̶��������h(����:һ�_ʼ�ͮ���ͬһ�D��)");
		System.out.println("");
		
		List<String> f = new ArrayList<String>(List.of("A","B","C","D","E","F","G","H","I","J"));
		List<String> g = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		System.out.println(f);
		System.out.println(g);
		System.out.println("������List fg��������У��ӑB���޸�(����:һ�_ʼ�ͮ��ڲ�ͬ�D��)");
		System.out.println("");
		
		for(String item:f) {
			System.out.println(item);
		}
		System.out.println("������List f����foreach(ð̖��v)ӡ���ĽY����index�[��");
	}
	}