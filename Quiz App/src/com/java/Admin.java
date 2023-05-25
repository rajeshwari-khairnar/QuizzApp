package com.java;

import java.util.Scanner;

public class Admin {
public void view() {
	System.out.println("Welcome Admin!");
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1 add que 2.add user"); 
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
