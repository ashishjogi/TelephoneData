package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.Pojo.PersonDetails;

public class DAO {
	Connection conn;

	public Connection createConnection() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Directory", "root", "password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	public int uploadData(ArrayList<HashMap> list) throws SQLException, ClassNotFoundException {
		int cnt = 0;
		int insCnt = 0;
		conn = createConnection();
		if (list != null) {

			for (int i = 0; i < list.size(); i++) {
				HashMap map = list.get(i);

				String sql = "insert into DirectoryData values(?,?,?,?,?,?,?,?,?,?,?);";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, (String) map.get("first_name"));
				ps.setString(2, (String) map.get("last_name"));
				ps.setString(3, (String) map.get("company_name"));
				ps.setString(4, (String) map.get("address"));
				ps.setString(5, (String) map.get("city"));
				ps.setString(6, (String) map.get("country"));
				ps.setString(7, (String) map.get("state"));
				ps.setLong(8, (long) map.get("zip"));
				ps.setLong(9, (long) map.get("phone"));
				ps.setLong(10, (long) map.get("Alternate_phone"));
				ps.setString(11, (String) map.get("email"));
				System.out.println("Query become: " + ps.toString());
				insCnt = ps.executeUpdate();
				cnt = cnt + insCnt;
			}
		}
		return cnt;
	}

	public ArrayList<PersonDetails> getData() throws ClassNotFoundException, SQLException {
		ArrayList<PersonDetails> data = new ArrayList<PersonDetails>();
		conn = createConnection();
		PreparedStatement ps = conn.prepareStatement("select * from directoryData;");

		try {
			ResultSet set = ps.executeQuery();

			while (set.next()) {
				String first_name = set.getString(1);
				String last_name = set.getString(2);
				String company_name = set.getString(3);
				String address = set.getString(4);
				String city = set.getString(5);
				String county = set.getString(6);
				String state = set.getString(7);
				long zip = set.getLong(8);
				long phone = set.getLong(9);
				long Alternate_phone = set.getLong(10);
				String email = set.getString(11);

				PersonDetails pd = new PersonDetails(first_name, last_name, company_name, address, city, county, state,
						zip, phone, Alternate_phone, email);

				data.add(pd);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}
