package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class TaxCalc {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = s.next();
		System.out.println("연봉 입력");
		int salar = s.nextInt();
		
		double tax = 0;
		if(salar<=1200){
			tax = 0.08;
		}
		else if(salar>1200&&salar<=4600){
			tax = 0.17;
		}
		else if(salar>4600&&salar<=8800){
			tax = 0.26;
		}
		else if(salar>8800){
			tax = 0.35;
		}
		int result = (int)(salar * tax);;
			
	
		System.out.println("********************************");
		System.out.println("이름  |  연봉  |  세율  |  납부할 세금");
		System.out.println(String.format("%s\t %d \t %d \t %d", name, salar, (int)(tax*100), result));
		System.out.println("********************************");
		
	}
}
