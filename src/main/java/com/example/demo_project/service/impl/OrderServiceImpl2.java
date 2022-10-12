package com.example.demo_project.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Menu;
import com.example.demo_project.service.ifs.OrderService2;
@Service
public class OrderServiceImpl2 implements OrderService2{

	@Override
	public void addMenu(Menu menu) {
		// TODO Auto-generated method stub
		
	}
	 public void printitemprice(Menu menu) {
		 
	 }

	@Override
	public int itemprice(Menu menu) {
		return menu.getPrice() * menu.getNumber();
	}

	
	public void getTotalPrice(List<Menu> menu) {
		
		
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getTotalPrice() {
		// TODO Auto-generated method stub
		
	}

	
	}


