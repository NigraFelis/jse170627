package com.hanbit.algorithm.grade;

import java.util.Scanner;

public class GradeReport {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("name\n");
		String name = s.next();
		System.out.print("kor");
		int kor = s.nextInt();
		System.out.print("eng");
		int eng = s.nextInt();
		System.out.print("math");
		int math = s.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3;
		String result = "";
		
		if(avg>90){
			result = "A";
		}
		else if(avg>80&&avg<89){
			result = "B";
		}
		else if(avg>70&&avg<79){
			result = "C";
		}
		else if(avg>60&&avg<69){
			result = "D";
		}
		else if (avg<59){
			result = "F";
		}
		System.out.println("name : " + name);
		System.out.println("total : " + total);
		System.out.println("avg : " + avg);
		System.out.println("grade : " + result);
		
		System.out.println("name        total   avg   grade");
		//System.out.println("|" +name "|" +total "|" +avg "|" +grade);
	}
}

