package com.javaGo.demo;

public class Pattern {
	public static void printStar() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}
	public static void oppositeStar(int n) {
		for(int i=0;i<n;i++) {
			for(int j=2*(n-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void printIncrement(int n) {
		for(int i=0;i<n;i++) {
			int num=1;
			for(int j=0;j<i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	public static void main(String arg[]) {
		//printStar();
		//oppositeStar(5);
		printIncrement(5);
	}
}
