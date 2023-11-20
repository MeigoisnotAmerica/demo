import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.example.demo.TaipeiBank;

public class ClassTest {
	@Test
	public void testSaving() {
		TaipeiBank account = new TaipeiBank();
		int balanceAfterSaving500 = account.saving(500);
		int balanceAfterSavingNegative500 = account.saving(-500);
		int balanceAfterSaving1000 = account.saving(1000);

		System.out.println(balanceAfterSaving500);
		System.out.println(balanceAfterSavingNegative500);
		System.out.println(balanceAfterSaving1000);

	}

	@Test
	public void testWithdraw() {
		TaipeiBank taipeiBank = new TaipeiBank();
		int newBalance1 = taipeiBank.withdraw(500);
		int newBalance2 = taipeiBank.withdraw(-500);
		int newBalance3 = taipeiBank.withdraw(1000);

		System.out.println(newBalance1);
		System.out.println(newBalance2);
		System.out.println(newBalance3);
	}

	@Test
	public void testCompare() {
		// 只要有new就是比較記憶體位置
		// 8型態沒有new就是比較值!!重要
	}

	@Test
	public void stringTest() {
		String me = "機哩瓜啦";
		String you = "機哩瓜啦";
		System.out.println(me == you);
		System.out.println(StringUtils.hasText(you));
	}

	@Test
	public void findTest() {
		String textForFind = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		System.out.println(textForFind.length());
		String textTarget = "小龍女";
		System.out.println(textForFind.indexOf(textTarget));
		System.out.println(textForFind.indexOf(textTarget, 9));
		System.out.println(textForFind.indexOf(textTarget, 20));
		System.out.println(textForFind.indexOf(textTarget, 29));

	}

	@Test
	public void findTest2() {
		String textForFind = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String textTarget = "小龍女";
		int findTimes = 0;
		int findLocation = -1;
		while ((findLocation = textForFind.indexOf(textTarget, findLocation + (textTarget.length()))) != -1) {
			findTimes++;
		}
		System.out.println(findTimes);
	}

	@Test
	public void trimTest() {
		String str = "ABC DEF ";
		String str1 = " ABC DEF";
		System.out.println(str.equals(str1));
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str.equals(str1));
		System.out.println(str.length());
		System.out.println(str.length());
	}

	@Test
	public void subStringTest() {
		String text = "神鵰俠侶是楊過與小龍女的故事";
		String start = "楊";
		String end = "事";
		String subStr = text.substring((text.indexOf(start)), (text.indexOf(end) + 1));
		System.out.println(subStr);
	}

	@Test
	public void replaceTest() {
		StringBuffer originText = new StringBuffer("ABACADEF");
		System.out.println(
				(originText.replace((originText.lastIndexOf("A")), (originText.lastIndexOf("A") + 1), "W")).toString());
	}

	@Test
	public void reverseTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一串字:");
		String text = scan.next();
		String half2 = text.substring((text.length() / 2), text.length());
		StringBuffer half2Buff = new StringBuffer(half2);
		if ((text.length()) > 1 && (half2Buff.reverse().toString()).equals(text.substring(0, text.length() / 2))) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}
	}

	@Test
	public void classTest6() {
		Dog dog = new Dog();
		dog.setName("Mimi");
		dog.setColor("orange");
		dog.setAge(23);
		System.out.println(dog);
		System.out.println("=====================");
		Dog doggy = new Dog();
		System.out.println(doggy);
		System.out.println("=====================");

	}
	@Test
	public void classTest8() {
	    String pattern1 = "\\(\\d{2}\\)\\d{7}";
	    String pattern2 = "\\(\\d{2}\\)\\d{8}";
	    String pattern3 = "\\d{2}-\\d{7}";
	    String pattern4 = "\\d{2}-\\d{8}";
	    Scanner scan = new Scanner(System.in);
	    System.out.println("請輸入市話號碼(含符號):");
	    String input = scan.next();
	    if (input.matches(pattern1) || input.matches(pattern2) || input.matches(pattern3) || input.matches(pattern4)) {
	        System.out.println("是台灣的市話");
	    } else {
	        System.out.println("錯啦!!!");
	    }
	}
	@Test
	public void classTest9() {
	    String patternA = "\\(\\d{2}\\)\\d{7,8}";  // 使用逗號{7到8碼}設定【區間】
	    String patternB = "\\d{2}-(\\d{7}||\\d{8})";  // 使用| 或 || (水管)
	    Scanner scan = new Scanner(System.in);
	    System.out.println("請輸入市話號碼(含符號):");
	    String input = scan.next();
	    if (input.matches(patternA) || input.matches(patternB)) {
	        System.out.println("是台灣的市話");
	    } else {
	        System.out.println("錯啦!!!");
	    }
	}
	@Test
	public void classTest10() {
	    String patternfinal = "(\\(\\d{2}\\)||\\d{2}-)\\d{7,8}";
	    String patternfinal2 = "(\\(\\d{2,4}\\)||\\d{2,4}-)\\d{7,8}";
	    Scanner scan = new Scanner(System.in);
	    System.out.println("請輸入市話號碼(含符號):");
	    String input = scan.next();
	    if (input.matches(patternfinal) || input.matches(patternfinal)) {
	        System.out.println("是台灣的市話");
	    } else {
	        System.out.println("錯啦!!!");
	    }
	}
	@Test
	public void classTest11() {
		String pattern1="[A-Za-z][12]\\d{8}";
		String pattern2="[C-Z c-z && [^DEFHdefh] ][12]\\d{8}";
		String pattern3="[CGI-Zcgi-z][12]\\d{8}";
		Scanner scan = new Scanner(System.in);
	    System.out.println("請輸入身分證字號:");
	    String input = scan.next();
	    if (input.matches(pattern1)) {
	    	System.out.println("身分證格式正確!");
	    } else {
	        System.out.println("錯啦!!!");
	    }
	    System.out.println("///////////////////////////////////");
	    if (input.matches(pattern2)) {
	    	System.out.println("身分證格式正確!");
	    } else {
	        System.out.println("錯啦!!!");
	    }
	    System.out.println("///////////////////////////////////");
	    if (input.matches(pattern3)) {
	    	System.out.println("身分證格式正確!");
	    } else {
	        System.out.println("錯啦!!!");
	    }
	}
}