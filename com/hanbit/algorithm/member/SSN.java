package com.hanbit.algorithm.member;

import java.util.Scanner;

public class SSN {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = s.next();
		System.out.println("주민등록번호를 입력하세요");
		String ssn = s.next();
		String sYear = ssn.substring(0,2);
		int year = Integer.parseInt(sYear);
		int age = 0;
		int gap = 17-year;
		
		if(gap>=0){
			age = 17-year;
		}
		else {
			age = 2017-1900-year;
		}
		
		char ch = ssn.charAt(7);
		String gender = "";
		
		switch (ch){
			case '1' :
				gender = "male";
			break;
			case '2' :
				gender = "female";
			break;
			case '3' :
				gender = "male";
			break;
			case '4' :
				gender = "female";
			break;
			case '5' :
				gender = "foreigner";
			break;
			case '6' :
				gender = "foreigner";
			break;
			default: 
				gender = "error";
			break;
		}
		
		System.out.println("이름  나이  성별");
		System.out.println("----------------");
		
		System.out.println("이름"+name);
		System.out.println("나이"+age);
		System.out.println("성"+gender);
	}
}