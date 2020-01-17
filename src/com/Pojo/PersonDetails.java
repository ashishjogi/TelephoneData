package com.Pojo;

public class PersonDetails {

	private static String first_name;
	private static String last_name;
	private static String company_name;
	private static String address;
	private static String city;
	private static String county;
	private static String state;
	private static long zip;
	private static long phone;
	private static long Alternate_phone;
	private static String email;

	PersonDetails(String first_name, String last_name, String company_name, String address, String city, String county,
			String state, long zip, long phone, long Alternate_phone, String email) {

		this.first_name = first_name;
		this.last_name = last_name;
		this.company_name = company_name;
		this.address = address;
		this.city = city;
		this.county = county;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.Alternate_phone = Alternate_phone;
		this.email = email;

	}

	public static String getFirst_name() {
		return first_name;
	}

	public static void setFirst_name(String first_name) {
		PersonDetails.first_name = first_name;
	}

	public static String getLast_name() {
		return last_name;
	}

	public static void setLast_name(String last_name) {
		PersonDetails.last_name = last_name;
	}

	public static String getCompany_name() {
		return company_name;
	}

	public static void setCompany_name(String company_name) {
		PersonDetails.company_name = company_name;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		PersonDetails.address = address;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		PersonDetails.city = city;
	}

	public static String getCounty() {
		return county;
	}

	public static void setCounty(String county) {
		PersonDetails.county = county;
	}

	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		PersonDetails.state = state;
	}

	public static long getZip() {
		return zip;
	}

	public static void setZip(long zip) {
		PersonDetails.zip = zip;
	}

	public static long getPhone() {
		return phone;
	}

	public static void setPhone(long phone) {
		PersonDetails.phone = phone;
	}

	public static long getAlternate_phone() {
		return Alternate_phone;
	}

	public static void setAlternate_phone(long alternate_phone) {
		Alternate_phone = alternate_phone;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		PersonDetails.email = email;
	}

}
