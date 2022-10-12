package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.service.impl.OrderServiceImpl;

@SpringBootTest
public class Homework_1007 {
	OrderServiceImpl orderserviceimpl = new OrderServiceImpl();
	
	@Test
	public void contextLoads() {
		orderserviceimpl.getPrice("chicken");
		orderserviceimpl.getPrice("pork");
		orderserviceimpl.getPrice("beef");
	}
	
	@Test
	public void test() {
		orderserviceimpl.totalPrice();
	}

}
