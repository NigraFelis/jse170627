package com.hanbit.algorithm.sequence;

public class EvenSum {
	public static void main(String[] args){
		int sum = 0;
		int[] arr = new int[10];
		
		for(int i =0; i<arr.length; i++){
			arr[i]=i+1;
			if(((i+1)%2)==0){
				sum+=arr[i];
			}
		}
		System.out.print("¦���� ��: " +sum);
	}
}
