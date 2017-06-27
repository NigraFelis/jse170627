package com.hanbit.algorithm.matrix;


public class MrMatrix {
public static void main(String[] args){
		//int[][] mtx = new int[3][4];
		//String[][] mtx = new String[3][4];
		
		/*
		String[][] mtx={
			{"Good Morning","Good Afternoon","Good Evening","Good Bye"},
			{"Mr","Mrs","Miss","My"},
			{"smith","Alex","John","James"}
		};
		System.out.print(mtx[1][4]+"\t" +mtx[2][3]+"/t" +mtx[3][2]);
		*/
		
		int[][]mtx=new int[5][5];
			for(int i=0; i<mtx.length; i++){
				for(int j=0; j<mtx[i].length; j++){
				//System.out.print("[%d,%d]",i,j);
				System.out.print("mtx["+i+"]["+j+"]:"+mtx[i][j]);
				}
				System.out.println();
			}
			
	}
}
