package com.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.Admin \n"
				+ "2.Student");
		Scanner sc = new Scanner(System.in);
		int res = sc.nextInt();
		
		switch (res) {
		case 1:
			//go to admin
			Admin admin = new Admin();
			admin.view();
			break;
		case 2:
			Student stud = new Student();
			stud.login();
			break;
		}
	
	}

}
