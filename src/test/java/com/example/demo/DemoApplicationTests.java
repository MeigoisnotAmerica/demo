package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//class DemoApplicationTests {
//
//	void contextLoads() {
//	}
@SpringBootTest
	public class DemoApplicationTests{

	@Test
	//	方法: public權限 void回傳值型態(void:不需要回傳，使回傳無效) firstTest自定義方法名稱-小駝峰 (參數) {實作區塊}
		public void firstTest() {
			int a = 5;
			long b =1234567893L;
			//一般的字串直接宣告
			String str = "Hello";
			//宣告一個類別 + new +值
			String sstr = new String("World11233");
			System.out.println(a);
			System.out.println(b);
			System.out.println(str);
			System.out.println(sstr);
		}
}
