package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Bank;

public interface BankService {
	public void getAmount(Bank bank);//取得餘額
	public void deposite(Bank bank,int depositAmount);//存款
	public void withdraw(Bank bank,int withdrawAmount);//提款

}
