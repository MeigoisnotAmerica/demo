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
			System.out.println("��������");
		} else if (a > 4) {
			System.out.println("��");
		}
	}

	@Test
	public void thirdTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ոݔ������:");
//		String a = scan.next();
//		int b = scan.nextInt();
		String c = scan.nextLine();
		System.out.println("���㌑����:" + c);
	}

	@Test
	public void forthTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ոݔ������:");
		String a = scan.next();
		String b = scan.next();
		System.out.println("���㌑����:" + a + b);
		if (a == "����") {
			System.out.println("����!�ð��ð�");
		} else {
			System.out.println("�� ���e��");
		}
	}

	@Test
	public void fifthTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ոݔ�딵��:");
		int a = scan.nextInt();
		System.out.println("���㌑����:" + a);
	}

	@Test
	public void gradeTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ոݔ��ɿ�:");
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
		System.out.println("�������ڎ�:(Ոݔ��һ���ջ���1~7)");
		int weekdays = 0;
		String x = scan.next();
		if (x.equals("��") || x.equals("7")) {
			weekdays = 7;
		} else if (x.equals("��") || x.equals("6")) {
			weekdays = 6;
		} else if (x.equals("��") || x.equals("5")) {
			weekdays = 5;
		} else if (x.equals("��") || x.equals("4")) {
			weekdays = 4;
		} else if (x.equals("��") || x.equals("3")) {
			weekdays = 3;
		} else if (x.equals("��") || x.equals("2")) {
			weekdays = 2;
		} else if (x.equals("һ") || x.equals("1")) {
			weekdays = 1;
		} else {
			System.out.println("��ݔ�e��");
		}
		System.out.println("������:(Ոݔ�딵��)");
		int afterdays = scan.nextInt();
		switch ((weekdays + afterdays) % 7) {
		case 0:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 6:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 5:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 4:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 3:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 2:
			System.out.println("����" + x + "��" + afterdays + "�������ڶ�");
			break;
		case 1:
			System.out.println("����" + x + "��" + afterdays + "��������һ");
			break;
		default:
			System.out.println("��ݔ�e��");
		}
	}

	@Test
	public void weekdayTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������ڎ�:(Ոݔ��һ���ջ�1~7)");
		int weekdays = 0;
		String x = scan.next();

		if (x == "��" || x == "7") {
			weekdays = 7;
		} else if (x == "��" || x == "6") {
			weekdays = 6;
		} else if (x == "��" || x == "5") {
			weekdays = 5;
		} else if (x == "��" || x == "4") {
			weekdays = 4;
		} else if (x == "��" || x == "3") {
			weekdays = 3;
		} else if (x == "��" || x == "2") {
			weekdays = 2;
		} else if (x == "һ" || x == "1") {
			weekdays = 1;
		} else {
			System.out.println("��ݔ�e��");
		}
		System.out.println("������:");
		int afterdays = scan.nextInt();
		switch ((weekdays + afterdays - 1) % 7) {
		case 0:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 6:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 5:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 4:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 3:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 2:
			System.out.println("����" + x + "��" + afterdays + "�������ڶ�");
			break;
		case 1:
			System.out.println("����" + x + "��" + afterdays + "��������һ");
			break;
		default:
			System.out.println("��ݔ�e��");
		}
	}

	@Test
	public void weekdayTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������ڎ�:(Ոݔ��һ���ջ�1~7)");
		int weekdays = 0;
		String x = scan.next();

		if (x == "��" || x == "7") {
			weekdays = 7;
		} else if (x == "��" || x == "6") {
			weekdays = 6;
		} else if (x == "��" || x == "5") {
			weekdays = 5;
		} else if (x == "��" || x == "4") {
			weekdays = 4;
		} else if (x == "��" || x == "3") {
			weekdays = 3;
		} else if (x == "��" || x == "2") {
			weekdays = 2;
		} else if (x == "һ" || x == "1") {
			weekdays = 1;
		} else {
			System.out.println("��ݔ�e��");
		}
		System.out.println("������:");
		int afterdays = scan.nextInt();
		switch ((weekdays + afterdays - 1) % 7) {
		case 0:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 6:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 5:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 4:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 3:
			System.out.println("����" + x + "��" + afterdays + "����������");
			break;
		case 2:
			System.out.println("����" + x + "��" + afterdays + "�������ڶ�");
			break;
		case 1:
			System.out.println("����" + x + "��" + afterdays + "��������һ");
			break;
		default:
			System.out.println("��ݔ�e��");
		}
	}

	// forޒȦ: ���� --> �Д� --> ���� --> ���� --> �Д� --> ���� --> ����
	@Test
	public void loopForTest() {
		for (int i = 1; i < 5; i++) {
			System.out.println("�@��i++��"+i+"��ޒȦ"+"��i=" + i);
		}
		for (int i = 1; i < 5; ++i) {
			System.out.println("�@��++i��"+i+"��ޒȦ"+"��i=" + i);
		}
	}

	
	//break a --> ָ������ a Ȧ
	
	
	@Test
	public void randomTest() {
		Scanner scann = new Scanner(System.in);
		Random randomNum =new Random();
		int answerNum=randomNum.nextInt(99)+1;
		System.out.println("Ոݔ��1-99�ȵ�һ������");
		while(answerNum<99 && answerNum>1) {
			int inputNum=scann.nextInt();
			
			if(inputNum>answerNum) {
				System.out.println("���e�ˣ�Ոݔ��1-"+inputNum+"�ԃȵĔ���");
			}else if(inputNum<answerNum) {
				System.out.println("���e�ˣ�Ոݔ��"+inputNum+"��99�ȵĔ���");
			}else {
				System.out.println("����");
				break;
			}
		}
	//�@�e��public void randomTest()��β��	
	}
	
	
	// �@�e��public class ConditionTest ��β��
}