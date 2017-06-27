package com.hanbit.algorithm.sequence;

import java.util.Scanner;

public class ArithmeticSequence {
	public static void main(String[]args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("insert number");
		int num = s.nextInt();
		
		int i=1;
		for(;i<=9;){
			
			
			System.out.print(num + "*"+i+ "=" +(num*i)+"\n");
			i++;
			
		}
		
	}	
}
