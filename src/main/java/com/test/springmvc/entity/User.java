package com.test.springmvc.entity;

import com.test.springmvc.inter.Say;

public class User implements Say{
	public String firstName;
	public String lastName;
	public int age;
	public String sex;
	public String getName() {
		return firstName+lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void sayYourself() {
		System.out.println(firstName+lastName);
		
	}

}
