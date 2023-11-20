package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.constants.RtnCode;
import com.example.demo.service.ifs.AtmService;
import com.example.demo.vo.AtmResponse;

@SpringBootTest
public class AtmServiceTest {

	@Autowired
	private AtmService atmService;

	@Test
	public void addInfoTest() {
		AtmResponse res = atmService.addInfo("meigo020202", "MMM1112");
		System.out.println(res.getRtncode().getCode());
		System.out.println(res.getRtncode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getPwd());

	}
	@Test
	public void depositTest() {
	    AtmResponse res = atmService.deposit("meigo020202", "MMM1112", 3000);

	    assertNotNull(res, "Response should not be null");
	    assertNotNull(res.getAtm(), "Atm in response should not be null");
	    // 假設您有方法來檢查響應代碼
	    assertEquals(RtnCode.SUCCESSFUL, res.getRtncode(), "Response code should be successful");

	    System.out.println("New balance after deposit: " + res.getAtm().getBalance());
	}

	@Test
	public void withdrawTest() {
        AtmResponse res = atmService.withdraw("meigo020202", "MMM1112", 3000);
        System.out.println("New balance after deposit: " + res.getAtm().getBalance());
	}
	
}
