package com.seleniumGo.warmup;

public class Employee {
	String eName;
	int rollNo;
	String cName="innovaccer";
	void input(int roll,String en) {
		eName=en;
		rollNo=roll;
	}
	void show() {
		System.out.println(rollNo+" : "+eName+" : "+cName);
	}
	public static void main(String agr[]) {
		Employee emp=new Employee();//default constructor
		emp.input(1, "jaydeep");
		emp.show();
	}

}
