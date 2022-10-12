package com.example.demo_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Menu;


@SpringBootTest
public class HomeWork_1007_2 {
	@Autowired
	public void printtotalprice(Menu menu) { 
	
	Menu beefmenu = new Menu("beef",100);
	Menu porkmenu = new Menu("pork",90);
	Menu chicken = new Menu("chicken",80);
	beefmenu.setNumber(5);
	porkmenu.setNumber(4);
	chicken.setNumber(3);
	
	
	
	
	
	
	}
}
