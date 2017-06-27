package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class SecondCalc {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("초를 시간과 분으로 바꾸어 주는 프로그램입니다.\n초를입력해주세요.");
		int seconds = s.nextInt();
		
		/*
		시 - 초 /3600 의 int값
		분 - 초 / 3600 한 나머지 값을 / 60 의 int값
		초 - 초 / 3600 하고 나머지 값 /60의 나머지 값은 초
		*/
	
		System.out.println((seconds / 3600) + "시" + (seconds % 3600 / 60) + "분" + (seconds % 3600 % 60) + "초");
 
		
	}
}