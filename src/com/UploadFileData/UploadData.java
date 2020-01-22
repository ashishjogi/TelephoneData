package com.UploadFileData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Database.DAO;
import com.ExcelData.ExcelFile;

@WebServlet("/upload")
public class UploadData extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String desc = req.getParameter("description");
		String fileName = req.getParameter("file"); // Retrieves <input type="file"

		ExcelFile upload = new ExcelFile();

		ArrayList<HashMap> data = upload.uploadFile(fileName);
		if (data != null) {
			try {
				DAO db = new DAO();
				int cnt = db.uploadData(data);
				PrintWriter out = res.getWriter();
				out.print("toal records updated " + cnt);
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Desc " + desc);

	}
}
