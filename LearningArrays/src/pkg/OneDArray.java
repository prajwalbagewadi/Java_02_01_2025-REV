package pkg;

import java.lang.*;
import java.util.*;
import java.io.*;

public class OneDArray {
	public static void main(String[] args) {
		//syntax
		// data-type arr_name[] = new data-type(size)
//		int arr[] = new int[5];  //dynamic
//		int arr1[] = {1,2,3,4,5}; //static
//		
//		for(int i=0;i<5;i++) {
//			System.out.print(arr1[i]+" ");
//		}
//		System.out.println();	
//		
	Scanner sc = new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			System.out.println("Enter the element:");
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<5;i++) { // traversing
//			System.out.print(arr[i]+" ");
//		}
//		
//		System.out.println();
//		//finding a element in arr
		int num[] = {4,5,6,12,13};
//		System.out.println("Enter the num to find:");
//		int key=sc.nextInt();
//		
//		
//		for(int i=0;i<5;i++) {
//			if(num[i]==key) {
//				System.out.println("Key:"+key+ "found at POS:"+i);
//			}
//			else if(i==4) {
//				System.out.println("Key:"+key+ "not found");
//			}
//		}
		
		//REPLACE ELEMENT AT POS
		System.out.println("Enter the POS to Replace.");
		int pos=sc.nextInt();
		
		for(int i=0;i<5;i++) {
			if(i==pos) {
				System.out.println("Enter the element.");
				int temp = sc.nextInt();
				num[i]=temp;
			}
		}
		
		for(int i=0;i<5;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
