package com.g7.oam.entities;

public class Admin extends User {

	private String adminName;

	public Admin(int userId, String password) {
		super(userId, password, "admin");
		// TODO Auto-generated constructor stub
	}

	public Admin(int userId, String password, String adminName) {
		super(userId, password, "admin");
		this.adminName = adminName;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + "]";
	}

}