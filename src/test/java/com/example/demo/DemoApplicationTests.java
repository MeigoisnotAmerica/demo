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
	//	����: public���� void�؂�ֵ�͑B(void:����Ҫ�؂���ʹ�؂��oЧ) firstTest�Զ��x�������Q-С�� (����) {�����^�K}
		public void firstTest() {
			int a = 5;
			long b =1234567893L;
			//һ����ִ�ֱ������
			String str = "Hello";
			//����һ��e + new +ֵ
			String sstr = new String("World11233");
			System.out.println(a);
			System.out.println(b);
			System.out.println(str);
			System.out.println(sstr);
		}
}
