package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bank;
import com.example.demo_project.service.ifs.BankService;
@Service
public class BankServiceImpl implements BankService{

	@Override
	public void getAmount(Bank bank) {
		System.out.println("�Ȧ�b��:" + bank.getAccount());
		System.out.println("�b��l�B:" + bank.getAmount());
		
	}

	@Override
	public void deposite(Bank bank,int depositAmount) {
		  System.out.println("�Ȧ�b��:" + bank.getAccount());	
		  bank.setAmount(bank.getAmount() + depositAmount);
		  System.out.println("����s��:" + depositAmount + "��");
		  System.out.println("�b��l�B:" +bank.getAmount());
	}

	@Override
	public void withdraw(Bank bank,int withdrawAmount) {
		System.out.println("�Ȧ�b��:" + bank.getAccount());
		if(bank.getAmount() < withdrawAmount) {
			System.out.println("�b��l�B����,�Э��s���d�ާ@");
			System.out.println("�b��l�B��:" + bank.getAmount());
		}
		else {
			bank.setAmount(bank.getAmount() - withdrawAmount);
			System.out.println("���ڧ���");
			System.out.println("�b��l�B:"+ bank.getAmount()+"��");
			
		}
	}

}