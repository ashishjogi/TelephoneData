package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class DAO {
	Connection conn;

	public DAO() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Directory", "root", "password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int uploadData(ArrayList<HashMap> list) throws SQLException {
		int cnt = 0;
		int insCnt = 0;
		if (list != null) {

			for (int i = 0; i < list.size(); i++) {
				HashMap map = list.get(i);

				String sql = "insert into DirectoryData(?,?,?,?,?,?,?,?,?,?,?);";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, (String) map.get("first_name"));
				ps.setString(2, (String) map.get("last_name"));
				ps.setString(1, (String) map.get("company_name"));
				ps.setString(1, (String) map.get("address"));
				ps.setString(1, (String) map.get("city"));
				ps.setString(1, (String) map.get("state"));
				ps.setLong(1, (long) map.get("zip"));
				ps.setLong(1, (long) map.get("phone"));
				ps.setLong(1, (long) map.get("Alternate_phone"));
				ps.setString(1, (String) map.get("email"));

				insCnt = ps.executeUpdate();
				cnt = cnt + insCnt;
			}
		}
		return cnt;
	}
}
