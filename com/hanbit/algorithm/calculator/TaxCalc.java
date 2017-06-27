package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class TaxCalc {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = s.next();
		System.out.println("연봉 입력");
		int salar = s.nextInt();
		double result = 0.0;
		double tax = 0;
		
		if(salar<=1200){
			tax = 0.08;
			result = (int)(salar * tax);
		}
		else if(salar>1200&&salar<=4600){
			tax = 0.17;
			result = (int)(salar * tax);
		}
		else if(salar>4600&&salar<=8800){
			tax = 0.26;
			result = (int)(salar * tax);
		}
		else if(salar>8800){
			tax = 0.35;
			result = (int)(salar * tax);
		}
			
	
		System.out.println("********************************");
		System.out.println("이름  |  연봉  |  세율  |  납부할 세금");
		System.out.println(String.format("%name", "%salar" , "%tax" , "%result"));
		System.out.println(salar);
		System.out.println(tax);
		System.out.println(result);
		System.out.println("********************************");
	}
}
