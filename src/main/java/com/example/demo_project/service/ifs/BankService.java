package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Bank;

public interface BankService {
	public void getAmount(Bank bank);//���o�l�B
	public void deposite(Bank bank,int depositAmount);//�s��
	public void withdraw(Bank bank,int withdrawAmount);//����

}
