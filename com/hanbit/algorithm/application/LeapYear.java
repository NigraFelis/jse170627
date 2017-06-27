package com.hanbit.algorithm.application;

/*연도를 4로 나눈값이 0이라면 윤년일수 있다
그러나 해당 연수가 100으로 나누어 떨어지면 평년이다
2000년은 4로 나눈값이 0이라서 윤년일 수 있는데
다시 이값이 100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.*/

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Insert year\n");
	int y = s.nextInt();
	String result = "";
	
		if(y%4==0){
			if(y%100==0){
				result = "nomal year";	
				if(y%400==0){
				result = "leap year";
				}
			}			
		}
		else {
			result = "nomal year";
		}
		System.out.print(result);
	}
}
	