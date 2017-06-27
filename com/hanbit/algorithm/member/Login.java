package com.hanbit.algorithm.member;

import java.util.Scanner;

public class Login{
	public static final String USER_ID = "Kim";
	public static final String USER_PASS = "1";
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Login\n");
		System.out.print("ID : ");
		String id = s.next();
		
		
		System.out.print("PASSWORD : ");
		String pass = s.next();
	
		if(!id.equals(USER_ID)){
			System.out.print("ID is not exeist");
			return;
		}
		else if(id.equals(USER_ID)) {
			if(!pass.equals(USER_PASS)){
			System.out.print("wrong password");
			}
			else {
			System.out.print("welcome");
			}
		}
	
	}
}
