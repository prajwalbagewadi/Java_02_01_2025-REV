package pkg;

import java.lang.*;
import java.util.*;
import java.io.*;

public class T2dArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int row=5,col=5;
		//datatype arr_name[][] = new datatype[size1][size2]
		int arr[][]=new int[row][col]; //dynamic
		
		int arr1[][] = {{1,2,3},{4,5,6}}; //static declaration
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("enter the element:"+i+j+":");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
