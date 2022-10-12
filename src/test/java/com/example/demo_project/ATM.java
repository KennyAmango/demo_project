package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Bank;
import com.example.demo_project.service.ifs.BankService;

@SpringBootTest
public class ATM {
	
	@Autowired
	public BankService bankservice;
	
	@Test
	public void print() {
		Bank bank = new Bank("77889900",10000);
		
		bankservice.getAmount(bank);
		System.out.println("===========");
		
		bankservice.deposite(bank, 2000);
		System.out.println("===========");
		
		bankservice.withdraw(bank, 15000);
		System.out.println("===========");
		
		bankservice.withdraw(bank, 12000);	
	}
	

}
