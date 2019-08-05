package com.seleniumGo.warmup;

public class Emp {
	int id;
	String name;
	 Emp(int id,String name){
		 //parameterized constructor 
		 this.id=id;
		 this.name=name;
	 }
	 void disp() {
		 System.out.println(id+"  :  "+name);
	 }
	 public static void main(String arg[]) {
		 Emp e=new Emp(1, "anuj");
		 Emp e2=new Emp(2, "jaydeep");
		 e.disp();
		 e2.disp();
	 }
}
