package com.hanbit.algorithm.grade;
import java.util.Scanner;

public class Ranking {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("insert name & num\n");
		
		int[] arr = new int[3];
		String[] namearr = new String[3];
		
		for(int i=0; i<3; i++){
			System.out.println("Insert Name\n");
			namearr[i] = s.next();
			System.out.println("Insert Num\n");
			arr[i] = s.nextInt();
		}
		
		int[] num = new int[3];
		String[] name = new String[3];
		
		for(int i=0; i<3; i++){
			num[i]=0;
			name[i]="";
		}
		
		if(arr[0]>arr[1] && arr[1]>arr[2]){
			num[0] = arr[0];
			name[0] = namearr[0];
			num[1] = arr[1];
			name[1] = namearr[1];
			num[2] = arr[2];
			name[2] = namearr[2];
		}
		else if(arr[0]>arr[2] && arr[2]>arr[1]){
			num[0] = arr[0];
			name[0] = namearr[0];
			num[1] = arr[2];
			name[1] = namearr[2];
			num[2] = arr[1];
			name[2] = namearr[1];
		}
		else if(arr[1]>arr[0] && arr[0]>arr[2]){
			num[0] = arr[1];
			name[0] = namearr[1];
			num[1] = arr[0];
			name[1] = namearr[0];
			num[2] = arr[2];
			name[2] = namearr[2];
		}
		else if(arr[1]>arr[2] && arr[2]>arr[0]){
			num[0] = arr[1];
			name[0] = namearr[1];
			num[1] = arr[2];
			name[1] = namearr[2];
			num[2] = arr[0];
			name[2] = namearr[0];
		}
		else if(arr[2]>arr[0] && arr[0]>arr[1]){
			num[0] = arr[2];
			name[0] = namearr[2];
			num[1] = arr[0];
			name[1] = namearr[0];
			num[2] = arr[1];
			name[2] = namearr[1];
		}
		else if(arr[2]>arr[1] && arr[1]>arr[0]){
			num[0] = arr[2];
			name[0] = namearr[2];
			num[1] = arr[1];
			name[1] = namearr[1];
			num[2] = arr[0];
			name[2] = namearr[0];
		}
		else{
			System.out.print("all same");
		}
			System.out.print("first:"+ "\t" +name[0]+"\t" + num[0] + "\n" +"second:"+ "\t" +name[1]+"\t" +num[1] + "\n" + "third:" + "\t" +name[2]+"\t" + num[2] );
		
		
	}
}