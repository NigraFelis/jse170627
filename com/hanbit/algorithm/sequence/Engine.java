package com.hanbit.algorithm.sequence;


import java.util.Scanner;

public class Engine{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.print("0.���� 1��,����\n");
			String menu = s.next();
		
			switch(menu){
				case "0": 
					System.out.print("�ý��� ����");
				return;
				case "1":
					System.out.print("�ý��� ����");
				break;
				case "2":
					System.out.print("BMI");
				break;
			}
		}
	}
}
