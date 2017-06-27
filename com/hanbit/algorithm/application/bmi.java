package com.hanbit.algorithm.application;

import java.util.Scanner;

public class bmi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("weight : ");
		double w = s.nextDouble();
		System.out.print("height : ");
		double h = s.nextDouble();
		
		double bmi = w/(h*h);
		String result = null;
		
		if(bmi<=24.9) {
			if(bmi<=18.5) {
				result = "low weight";	
			}
			else{
				result = "nomal";
			}
		}
		else if(bmi>24.9) {
			if(bmi>=29.9) {
				result = "over weight";	
			}
			else{
				result = "fat";
			}
		}
		
		System.out.println("my weight is " + w);
		System.out.println("my height is " + h);
		System.out.println("my bmi is " + bmi);
		System.out.println("result is " + result);
	}		
}

