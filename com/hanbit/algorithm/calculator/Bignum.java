package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Bignum {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("3수를 입력하세요");
		System.out.println("num1");
		int a = s.nextInt();
		System.out.println("num2");
		int b = s.nextInt();
		System.out.println("num3");
		int c = s.nextInt();
		
		if(a>b && b>c){
			System.out.println(String.format("%a", "%b" , "%c"));
		}
		else if(a>c && c>b){
			System.out.println(String.format("%a", "%c" , "%b"));
		}
		else if(b>a && a>c){
			System.out.println(String.format("%b", "%a" , "%c"));
		}
		else if(b>c && c>a){
			System.out.println(String.format("%b", "%c" , "%a"));
		}
		else if(c>a && a>b){
			System.out.println(String.format("%c", "%a" , "%b"));
		}
		else{
			System.out.println(String.format("%c", "%b" , "%a"));
		}
		
	}
}
