package com.sunbeam.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
private static final String DB_URL = "jdbc:mysql://localhost:3306/elections";
private static final String USERNAME = "root";
private static final String PASSWORD = "123456";

public static Connection getConnection() throws SQLException
{
	return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
}
}
