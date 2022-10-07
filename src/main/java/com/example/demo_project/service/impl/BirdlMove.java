package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;
@Service
public class BirdlMove implements Active{

	@Override
	public void fly(String name, int age) {
		Bird bird = new Bird();
		bird.setName(name);
		bird.setAge(age);
		System.out.println(name + "今年" + age + "歲,正在飛");
	}
	
	public void setBirdInfo(String name,int age) {
		Bird bird = new Bird();
		bird.getAge();
		bird.getName();
		System.out.println(name+ age);
	}
}
