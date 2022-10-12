package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Menu;

public interface OrderService2 {
    public void addMenu(Menu menu);
    
    public void printitemprice(Menu menu);
    
    public int itemprice(Menu menu);
    	
	public void getTotalPrice();
	
	public void printAll();

}
