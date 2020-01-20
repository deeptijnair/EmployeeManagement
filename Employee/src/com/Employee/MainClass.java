package com.Employee;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int size = 2;
		EmployeeDetails[] emp = new EmployeeDetails[size];
		Login[] login = new Login[size];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Do you want to register?");
		String ans1 = sc.nextLine();
		while (ans1.equals("y")) {
			emp[i] = new EmployeeDetails();
			login[i] = new Login();
			System.out.println("Enter the employee name:");
			String empName = sc.nextLine();
			emp[i].setEmpName(empName);
			System.out.println("Enter the employee phone number:");
			int empNumber = sc.nextInt();
			emp[i].setEmpNumber(empNumber);
			sc.nextLine();
			System.out.println("Enter your hired department:");
			String eDept = sc.nextLine();
			emp[i].setEmpDept(eDept);
			int empID = emp[i].setEmpID(eDept);
			login[i].setLoginName(empName);
			login[i].setLoginId(empID);

			System.out.println("Do you want to continue registration?");
			ans1 = sc.nextLine();
			i++;
		}
		for (int j = 0; j < emp.length; j++) {

			System.out.println(emp[j].toString());
		}
		System.out.println("Do you want to login?");
		String ans2 = sc.nextLine();
		int k=0;
		while (ans2.equals("y")) {

			System.out.println("Enter your name: ");
			String lname = sc.nextLine();
			System.out.println("Enter your employee ID:");
			int lId = sc.nextInt();
			sc.nextLine();
			
//			for (int k=0;k<login.length;k++) {
				if (login[k].loginName.equals(lname) && login[k].loginId == lId) {
					System.out.println("Login succesful!");
					break;
				} 
				else {
					System.out.println("Login unsuccesful!");
					System.out.println("Do you want to continue?");
					ans2 = sc.nextLine();
	//				k++;
	//				break;
				}
				
//			}

//			System.out.println("Do you want to continue?");
//			ans2 = sc.nextLine();
		}
/*		for (int j = 0; j < emp.length; j++) {

			System.out.println(login[j].toString());
		}*/
		sc.close();
	}
	}

