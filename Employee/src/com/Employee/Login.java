package com.Employee;

public class Login {
	String loginName;
	int loginId;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String toString() {
		return "Employee Name: "+loginName+" Employee ID: "+loginId;
	}

}
