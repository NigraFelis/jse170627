package com.hanbit.algorithm.sequence;

import java.util.Scanner;

public class TopRanking {
	public static void main(String[] args){
		//int sum=0, avg=0, max=0, min=0; //이것은 배열로 전환
		int[] arr = {0,0,0,0};
		Scanner s = new Scanner(System.in);
		System.out.print("1반의 총 학생수는 몇 명?");
		
		int mancount = s.nextInt();
		int[] avgarry = new int[mancount];
		
		for(int i=0; i<mancount; i++){
			System.out.print("학생의 평균 점수 입력하세요 (100점 만점)");
			avgarry[i] = s.nextInt();
			arr[0] += avgarry[i];
			if(avgarry[0]<avgarry[i]){
				arr[2] = avgarry[i];
			}
			else{
				arr[3] = avgarry[i];
			} 
		}
		
		//이번에는 length가 동적인 배열을 선언해야 합니다.
		//그리고 그 수만큼 for loop 이 돌고 점수를 
		//입력받습니다.
		//현재는 1등 점수와 꼴찌 점수를 구하는 로직만 구합니다.
		System.out.println("1반의 총점수는 " + arr[0]);
		System.out.println("1반의 평균점수는 " + (arr[0]/mancount));
		System.out.println("최대 점수는 " + arr[2]);
		System.out.println("최소 점수는 " + arr[3]);
	}
}