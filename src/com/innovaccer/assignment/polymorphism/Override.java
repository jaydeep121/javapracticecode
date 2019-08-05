package com.innovaccer.assignment.polymorphism;

public class Override extends Polymorphism {
	
	public int sum(int x,int y) {
		int sum;
		sum=x+y-150;
		return sum;
	}
	public static void main(String arg[]) {
		Override obj=new Override();
		int result=obj.sum();//parrent class method
		int result2=obj.sum(100, 200);
		System.out.println("parrent class sum : "+result+"  child class sum : "+result2);
	}
}
