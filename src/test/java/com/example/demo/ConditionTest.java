package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test
	public void firstTest() {
		int a = 5;
		if (a > 5) {
			System.out.println("meow");
		} else {
			System.out.println("bowwow");
		}
	}

	@Test
	public void secondTest() {
		int a = 5;
		if (a > 5) {
			System.out.println("meow");
		} else if (a > 6) {
			System.out.println("咪咪咪咪");
		} else if (a > 4) {
			System.out.println("哈");
		}
	}

	@Test
	public void thirdTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字:");
//		String a = scan.next();
//		int b = scan.nextInt();
		String c = scan.nextLine();
		System.out.println("猜你寫的是:" + c);
	}

	@Test
	public void forthTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字:");
		String a = scan.next();
		String b = scan.next();
		System.out.println("猜你寫的是:" + a + b);
		if (a == "咪咪") {
			System.out.println("猜對了!好棒好棒");
		} else {
			System.out.println("哈 猜錯了");
		}
	}

	@Test
	public void fifthTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字:");
		int a = scan.nextInt();
		System.out.println("猜你寫的是:" + a);
	}

	@Test
	public void gradeTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入成績:");
		int input = scan.nextInt();
		switch (input / 10) {
		case 10:
//				System.out.println("A+");
//				break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
	}

	@Test
	public void weekdayTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天星期幾:(請輸入一到日或數字1~7)");
		int weekdays = 0;
		String x = scan.next();
		if (x.equals("日") || x.equals("7")) {
			weekdays = 7;
		} else if (x.equals("六") || x.equals("6")) {
			weekdays = 6;
		} else if (x.equals("五") || x.equals("5")) {
			weekdays = 5;
		} else if (x.equals("四") || x.equals("4")) {
			weekdays = 4;
		} else if (x.equals("三") || x.equals("3")) {
			weekdays = 3;
		} else if (x.equals("二") || x.equals("2")) {
			weekdays = 2;
		} else if (x.equals("一") || x.equals("1")) {
			weekdays = 1;
		} else {
			System.out.println("你輸錯啦");
		}
		System.out.println("幾天後:(請輸入數字)");
		int afterdays = scan.nextInt();
		switch ((weekdays + afterdays) % 7) {
		case 0:
			System.out.println("星期" + x + "的" + afterdays + "天後星期日");
			break;
		case 6:
			System.out.println("星期" + x + "的" + afterdays + "天後星期六");
			break;
		case 5:
			System.out.println("星期" + x + "的" + afterdays + "天後星期五");
			break;
		case 4:
			System.out.println("星期" + x + "的" + afterdays + "天後星期四");
			break;
		case 3:
			System.out.println("星期" + x + "的" + afterdays + "天後星期三");
			break;
		case 2:
			System.out.println("星期" + x + "的" + afterdays + "天後星期二");
			break;
		case 1:
			System.out.println("星期" + x + "的" + afterdays + "天後星期一");
			break;
		default:
			System.out.println("你輸錯啦");
		}
	}

	@Test
	public void weekdayTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天星期幾:(請輸入一到日或1~7)");
		int weekdays = 0;
		String x = scan.next();

		if (x == "日" || x == "7") {
			weekdays = 7;
		} else if (x == "六" || x == "6") {
			weekdays = 6;
		} else if (x == "五" || x == "5") {
			weekdays = 5;
		} else if (x == "四" || x == "4") {
			weekdays = 4;
		} else if (x == "三" || x == "3") {
			weekdays = 3;
		} else if (x == "二" || x == "2") {
			weekdays = 2;
		} else if (x == "一" || x == "1") {
			weekdays = 1;
		} else {
			System.out.println("你輸錯啦");
		}
		System.out.println("幾天後:");
		int afterdays = scan.nextInt();
		switch ((weekdays + afterdays - 1) % 7) {
		case 0:
			System.out.println("星期" + x + "的" + afterdays + "天後星期日");
			break;
		case 6:
			System.out.println("星期" + x + "的" + afterdays + "天後星期六");
			break;
		case 5:
			System.out.println("星期" + x + "的" + afterdays + "天後星期五");
			break;
		case 4:
			System.out.println("星期" + x + "的" + afterdays + "天後星期四");
			break;
		case 3:
			System.out.println("星期" + x + "的" + afterdays + "天後星期三");
			break;
		case 2:
			System.out.println("星期" + x + "的" + afterdays + "天後星期二");
			break;
		case 1:
			System.out.println("星期" + x + "的" + afterdays + "天後星期一");
			break;
		default:
			System.out.println("你輸錯啦");
		}
	}

	@Test
	public void weekdayTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天星期幾:(請輸入一到日或1~7)");
		int weekdays = 0;
		String x = scan.next();

		if (x == "日" || x == "7") {
			weekdays = 7;
		} else if (x == "六" || x == "6") {
			weekdays = 6;
		} else if (x == "五" || x == "5") {
			weekdays = 5;
		} else if (x == "四" || x == "4") {
			weekdays = 4;
		} else if (x == "三" || x == "3") {
			weekdays = 3;
		} else if (x == "二" || x == "2") {
			weekdays = 2;
		} else if (x == "一" || x == "1") {
			weekdays = 1;
		} else {
			System.out.println("你輸錯啦");
		}
		System.out.println("幾天後:");
		int afterdays = scan.nextInt();
		switch ((weekdays + afterdays - 1) % 7) {
		case 0:
			System.out.println("星期" + x + "的" + afterdays + "天後星期日");
			break;
		case 6:
			System.out.println("星期" + x + "的" + afterdays + "天後星期六");
			break;
		case 5:
			System.out.println("星期" + x + "的" + afterdays + "天後星期五");
			break;
		case 4:
			System.out.println("星期" + x + "的" + afterdays + "天後星期四");
			break;
		case 3:
			System.out.println("星期" + x + "的" + afterdays + "天後星期三");
			break;
		case 2:
			System.out.println("星期" + x + "的" + afterdays + "天後星期二");
			break;
		case 1:
			System.out.println("星期" + x + "的" + afterdays + "天後星期一");
			break;
		default:
			System.out.println("你輸錯啦");
		}
	}

	// for迴圈: 宣告 --> 判斷 --> 執行 --> 迭代 --> 判斷 --> 執行 --> 迭代
	@Test
	public void loopForTest() {
		for (int i = 1; i < 5; i++) {
			System.out.println("這是i++第"+i+"次迴圈"+"，i=" + i);
		}
		for (int i = 1; i < 5; ++i) {
			System.out.println("這是++i第"+i+"次迴圈"+"，i=" + i);
		}
	}

	
	//break a --> 指定跳出 a 圈
	
	
	@Test
	public void randomTest() {
		Scanner scann = new Scanner(System.in);
		Random randomNum =new Random();
		int answerNum=randomNum.nextInt(99)+1;
		System.out.println("請輸入1-99內的一個數字");
		while(answerNum<99 && answerNum>1) {
			int inputNum=scann.nextInt();
			
			if(inputNum>answerNum) {
				System.out.println("猜錯了，請輸入1-"+inputNum+"以內的數字");
			}else if(inputNum<answerNum) {
				System.out.println("猜錯了，請輸入"+inputNum+"到99內的數字");
			}else {
				System.out.println("猜對了");
				break;
			}
		}
	//這裡是public void randomTest()的尾巴	
	}
	
	
	// 這裡是public class ConditionTest 的尾巴
}