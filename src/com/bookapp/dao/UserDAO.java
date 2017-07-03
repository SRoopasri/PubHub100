package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bookapp.model.User;
import com.bookapp.util.ConnectionUtil;

public class UserDAO {
	public void register(User user) throws Exception
	{
	Connection connection=ConnectionUtil.getConnection();
	PreparedStatement pst=connection.prepareStatement("insert into users_db(name,email_id,password)values(?,?,?)");
pst.setString(1,user.getName());
pst.setString(2, user.getEmail_id());
pst.setString(3,user.getPassword());

pst.executeUpdate();

	}
	public boolean login(User user) throws Exception{
		Connection connection=ConnectionUtil.getConnection();
	PreparedStatement pst=connection.prepareStatement("select name from users_db where email_id='?'and password='?'");
	
	pst.setString(2, user.getEmail_id());
	pst.setString(3,user.getPassword());
ResultSet rs=pst.executeQuery();
boolean flag=false;
if(rs.next())
{
	flag = true;
}
	return flag;
}

	}


