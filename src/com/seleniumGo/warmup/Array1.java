package com.seleniumGo.warmup;

public class Array1 {
	public static boolean firstLast6(int[] num){
	/*	if(num[0]==6||num[num.length-1]==6) {
			return true;
		}
		else {
			return false;
		}*/
		return (num[0]==6||num[num.length-1]==6);
	}
	public static boolean sameFirstLast(int[] num) {
		/*if(num[0]==1&&num[num.length-1]==1) {
			return true;
		}
		else {
			return false;
		}*/
		/*return (num.length >= 1 && num[0] ==  num[num.length-1]);*/
		return (num[0] ==  num[num.length-1]);
	}
	public static int[] makePi() {
		int arr[]= {1,2,3};
		return arr;
	}
	public static boolean commonElement(int a[],int[] b) {
		return (a[0]==b[0]||a[a.length-1]==b[b.length-1]);
	}
	public static int sum(int num[]) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		return sum;
	}
	public static int[] rotateArr(int data[]) {
		int rotate[]= {data[1],data[2],data[0]};
		return rotate;
	}
	public static void main(String arg[]) {
		int val[]= {110,2,3,4,5,101,7,7};
		int val1[]= {110,2,3,4,90,7};
		int data[]= {1,2,3,4};
		System.out.println(sum(data));
		/*int data[]=makePi();
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}*/
		
	}

}
