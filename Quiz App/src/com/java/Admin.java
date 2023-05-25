package com.java;

import java.util.Scanner;

public class Admin {
	
	public void validation() {
		Scanner sc = new Scanner(System.in);
		String adminPass =sc.nextLine();
		if(adminPass.equals("pass@123")) {
			
			view();
		}
		else {
			System.out.println("Invalid Password, please try again!");
			System.exit(01);
		}
		
		
	}
	
	
	
	
	
public void view() {
	System.out.println("Welcome Admin!");
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1: add que\n2:add user"); 
	int adminChoice =sc.nextInt();
	
	switch(adminChoice) {
	case 1:
		Question que = new Question();
		que.addQue();
	break;
	
	case 2:
		Question que1 = new Question();
		que1.addUsers();
		break;
	}
	
	

	
	
	
	
	
	
}
	
// add
	
// results	
}
