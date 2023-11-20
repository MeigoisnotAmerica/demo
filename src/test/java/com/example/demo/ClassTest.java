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
		System.out.println("上面是陣列a");
		System.out.println("");
		int[] b = { 3, 1, 4, 1, 5, 9, 2, 6 };
		System.out.println(b);
		System.out.println(b.length);
		System.out.println(b[0] + "" + b[1] + "" + b[2] + "" + b[3] + "" + b[4] + "" + b[5] + "" + b[6] + "" + b[7]);
		System.out.println("上面是陣列b");
	}

	@Test
	public void secondTest() {
		// List是一種介面(interface)不是類別(class)所以沒有new{定義一個方法而沒有實際內容}
		List<String> c = new ArrayList<>();
		// List <資料型態> c = new ArrayList<資料型態(可省)>();
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
		System.out.println("上面是List c包含的陣列");
		System.out.println("");
		
		List<String> d = List.of("A","B","C","D","E","F","G","H","I","J");
		System.out.println(d);
		System.out.println("上面是List d(List.of)包含的陣列，大小固定不能增刪(概念:一開始就畫在同一圖層)");
		System.out.println("");
		
		List<String> e = Arrays.asList("A","B","C","D","E");
		System.out.println(e);
		System.out.println("上面是List e(.asList)包含的陣列，大小固定不能增刪(概念:一開始就畫在同一圖層)");
		System.out.println("");
		
		List<String> f = new ArrayList<String>(List.of("A","B","C","D","E","F","G","H","I","J"));
		List<String> g = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		System.out.println(f);
		System.out.println(g);
		System.out.println("上面是List fg包含的陣列，動態可修改(概念:一開始就畫在不同圖層)");
		System.out.println("");
		
		for(String item:f) {
			System.out.println(item);
		}
		System.out.println("上面是List f利用foreach(冒號遍歷)印出的結果，index隱藏");
	}
	}