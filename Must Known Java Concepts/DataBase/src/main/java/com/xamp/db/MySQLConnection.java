package com.xamp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		//Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/marvel");
		 Connection
		 connection=DriverManager.getConnection("jdbc:mysql://root@localhost/marvel","root","root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT*FROM avengers");
		while (resultSet.next()) {
			System.out.println("Name :" + resultSet.getString(1) + " Hero :" + resultSet.getString(2));
		}

	}

}
