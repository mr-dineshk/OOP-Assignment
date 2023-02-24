package miniproject;

import java.sql.*;
public class DataBase {
	public static void main (String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examcounter","root","Dkdkdk@#007");
			Statement stat = con.createStatement();
			System.out.println("Inserting records");
			String sql = "Adding remaining days table()";
			stat.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	

}
