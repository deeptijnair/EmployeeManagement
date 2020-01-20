package com.Employee;

public class EmployeeDetails {
	int empID;
	String empDept;
	String empName;
	int empNumber;

	public int setEmpID(String empDept) {
		int id = 0, max, min, range;
		switch (empDept) {
		case "hr":
			max = 100;
			min = 1;
			range = max - min + 1;
			id = (int) (Math.random() * range) + min;
			break;

		case "sd":
			max = 200;
			min = 101;
			range = max - min + 1;
			id = (int) (Math.random() * range) + min;
			break;
		case "fd":
			max = 300;
			min = 201;
			range = max - min + 1;
			id = (int) (Math.random() * range) + min;
			break;
		default:
			System.out.println("No such department!");
		}

		return this.empID = id;
	}

	public int getEmpID() {
		return empID;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String toString() {
		return "Employee Name: " + empName + " Employee ID: " + empID + " Department: " + empDept + " Phone "
				+ empNumber;
	}

}
