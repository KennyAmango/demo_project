package com.example.demo_project.entity;

public class Person {
	private String name;
	private String id;
	private String country;
	private String city;
	private int age;
	
	public Person() {
		
	}
	
		
	public Person(String name,String id,String country,String city,int age) {
		this.name = name;
		this.id = id;
		this.country = country;
		this.city = city;
		this.age = age;
	}
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
