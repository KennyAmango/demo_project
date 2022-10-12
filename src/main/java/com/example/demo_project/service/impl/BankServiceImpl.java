package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bank;
import com.example.demo_project.service.ifs.BankService;
@Service
public class BankServiceImpl implements BankService{

	@Override
	public void getAmount(Bank bank) {
		System.out.println("銀行帳號:" + bank.getAccount());
		System.out.println("帳戶餘額:" + bank.getAmount());
		
	}

	@Override
	public void deposite(Bank bank,int depositAmount) {
		  System.out.println("銀行帳號:" + bank.getAccount());	
		  bank.setAmount(bank.getAmount() + depositAmount);
		  System.out.println("今日存款:" + depositAmount + "元");
		  System.out.println("帳戶餘額:" +bank.getAmount());
	}

	@Override
	public void withdraw(Bank bank,int withdrawAmount) {
		System.out.println("銀行帳號:" + bank.getAccount());
		if(bank.getAmount() < withdrawAmount) {
			System.out.println("帳戶餘額不足,請重新插卡操作");
			System.out.println("帳戶餘額為:" + bank.getAmount());
		}
		else {
			bank.setAmount(bank.getAmount() - withdrawAmount);
			System.out.println("取款完成");
			System.out.println("帳戶餘額:"+ bank.getAmount()+"元");
			
		}
	}

}
