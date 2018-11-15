package com.test.springmvc.entity;

import com.test.springmvc.inter.Say;

public class PerUser extends User implements Say{
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void sayYourself() {
		System.out.println(firstName+lastName);
	}
}
