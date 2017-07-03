package com.bookapp.dao;

import com.bookapp.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws Exception {User user=new User();
		 UserDAO userdao= new UserDAO();
userdao.register(user);
	}
	{User user=new User();
	 UserDAO userdao= new UserDAO();
try {
	userdao.login(user);
} catch (Exception e) {
	e.printStackTrace();
}
		
	}

}
