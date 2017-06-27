package com.hanbit.algorithm.sequence;

public class SequenceArry{
	public static void main(String[] args){
		
		int[] arr = new int[10];
		
		for(int i =0; i<10; i++){
			arr[i] = i;
			System.out.print(arr[i]+1+"\t");
		}
		System.out.println();
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			System.out.print(i+1+"\t");
			sum += arr[i];
		}
		System.out.print("SUM:" + sum);
	}
}
