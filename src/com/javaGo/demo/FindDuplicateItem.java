package com.javaGo.demo;

public class FindDuplicateItem {
	public static void main(String arg[]) {
		int arr[]= {1,2,3,4,6,8,10,10};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}
