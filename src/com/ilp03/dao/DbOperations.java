package com.ilp03.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbOperations {
	public static void setDataOrDelete(String Query) {

		try {
			Connection con = ConnectionProvider.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate(Query);			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ResultSet getData(String query) {
		try {
			Connection con = ConnectionProvider.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
