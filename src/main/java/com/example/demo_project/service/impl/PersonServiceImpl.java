package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;
@Service
public class PersonServiceImpl implements PersonService{

//	@Override
//	public Person getPersonInfo(String id) {
//		Person p1 = new Person("Kenny","aa","Taiwan","Tainan",24);
//		
//		return p1;
//	}
	@Override
	public Person getPersonInfo(String id) {
		Person p1 = new Person();
		p1.setId(id);
	    return p1;
}
	public void printPersonAttribute(Person Person) {
		System.out.println(Person.getName());
		System.out.println(Person.getId());
		System.out.println(Person.getAge());
		System.out.println(Person.getCountry());
		System.out.println(Person.getCity());
	}
	
	

}
