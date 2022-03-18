package com.medical.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import medicalShop.MedicalClass;

public class medicalDao {
	public void MedicalClassList (MedicalClass medicalClass)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		System.out.println(connection);
		
		String query = "insert into nithya_medicalShopApp_user (NAME, email, pasword,contact) values (?,?,?,?)" ;
		
		PreparedStatement statement=connection. prepareStatement(query);
		//statement.setString(1, medicalClass.getId());
		statement.setString(1, medicalClass.getName());
		statement.setString(2, medicalClass.getEmail());
		statement.setString(3, medicalClass.getPassword());
		statement.setString(4, medicalClass.getContact());
		System.out.println(query);
		int row=statement.executeUpdate();
		System.out.println("No of rows inserted:" +row);
		statement.close();
		connection.close();
		
	}

		
	}
