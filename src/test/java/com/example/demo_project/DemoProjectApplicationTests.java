package com.example.demo_project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.service.ifs.Active;


@SpringBootTest
class DemoProjectApplicationTests {
	
	@Autowired 
	private Active birdmove;
    
	

	@Test
	void contextLoads() {
		birdmove.fly("kenny", 3);
	}

}
