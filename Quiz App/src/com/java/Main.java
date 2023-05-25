package com.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.Admin \n2.Student");
		Scanner sc = new Scanner(System.in);
		int res = sc.nextInt();
		
		switch (res) {
		case 1:
			
			System.out.println("Enter admin password");
			Admin ad = new Admin();
			ad.validation();
			
			break;
			
			
			
			
			
			
		case 2:
			Student stud = new Student();
			stud.login();
			break;
		}
	
	}

}
