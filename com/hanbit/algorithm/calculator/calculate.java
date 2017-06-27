package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class calculate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Num1 : ");
		int a = s.nextInt();
		System.out.print("select opcode : ");
		String opcode = s.next();
		System.out.print("Enter Num2 : ");
		int b = s.nextInt();
		int result = 0;

			if(opcode.equals("+")) {
				result = a+b;
			}
			else if(opcode.equals("-")) {
				result = a-b;
			}
			else if(opcode.equals("*")) {
				result = a*b;
			}
			else {
				result = a/b;
			}
			System.out.println(String.format("%d% s% %d = %d",a,opcode,b,result));
	}
}
