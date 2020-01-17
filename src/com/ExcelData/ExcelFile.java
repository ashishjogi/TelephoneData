package com.ExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {
	private static String first_name;
	private static String last_name;
	private static String company_name;
	private static String address;
	private static String city;
	private static String county;
	private static String state;
	private static long zip;
	private static String phone;
	private static String Alternate_phone;
	private static String email;

	ArrayList<HashMap> data = new ArrayList<HashMap>();

	public ArrayList<HashMap> uploadFile(String Filename) throws IOException {
		ArrayList<HashMap> data = new ArrayList();

		String filePath = "C://Users//ashish.sunilrao.jogi//Documents//"+Filename;
		FileInputStream fis = new FileInputStream(filePath);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(wb.getNumberOfSheets());
		System.out.println(wb.getSheetName(0));
		XSSFSheet sheet = wb.getSheetAt(0);
		Iterator<Row> ite = sheet.rowIterator();

		int cellNumber = 0;
		while (ite.hasNext()) {
			Row row = (Row) ite.next();
			Iterator<Cell> cite = row.cellIterator();
			HashMap<String, Object> map = new HashMap<String, Object>();
			if (cellNumber != 0) {
				System.out.println("in if");
				for (int j = 0; j < 11; j++) {
					while (cite.hasNext()) {

						System.out.println("j" + j);
						Cell c = cite.next();
						if (j == 0 && !c.toString().isEmpty()) {
							first_name = c.toString();
							map.put("first_name", first_name);
							j++;
						} else if (j == 1) {

							last_name = c.toString();
							map.put("last_name", last_name);
							j++;
						} else if (j == 2) {

							company_name = c.toString();
							map.put("company_name", company_name);
							j++;
						} else if (j == 3) {

							address = c.toString();
							map.put("address", address);
							j++;
						} else if (j == 4) {

							city = c.toString();
							map.put("city", city);
							j++;
						} else if (j == 5) {

							county = c.toString();
							map.put("county", county);
							j++;
						} else if (j == 6) {

							state = c.toString();
							map.put("state", state);
							j++;

						} else if (j == 7) {
							String zipcode = c.toString();
							zipcode = zipcode.replace(".", "");
							zip = Long.parseLong(zipcode);
							map.put("zip", zip);
							j++;

						} else if (j == 8) {

							phone = c.toString();
							map.put("phone", phone);
							j++;

						} else if (j == 9) {

							Alternate_phone = c.toString();
							map.put("Alternate_phone", Alternate_phone);
							j++;

						} else if (j == 10) {

							email = c.toString();
							map.put("email", email);
							j++;

						}

					}

				}
				data.add(map);
				wb.close();
				fis.close();
			}
			cellNumber++;
		}
		System.out.println("ARray list is " + data);
		return data;
	}
}