package com.bookapp.model;

public class TestUser {
	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setName("roopasri");
		user.setEmail_id("roopasri3096@gmail.com");
		user.setPassword("123");
		user.setActive(0);
		
		System.out.println(user);
	}

}
