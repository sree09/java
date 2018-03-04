package com.rt.mysql;

public class DatabaseProperties {
	static DatabaseProperties instance = null;
	private DatabaseProperties(String url, String name, String pass) {
		
	}
	
	public static DatabaseProperties getInstance() {
		if(instance == null)
			instance = new DatabaseProperties();
		return instance;
	}
}
