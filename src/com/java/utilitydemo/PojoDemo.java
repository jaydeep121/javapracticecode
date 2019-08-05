package com.java.utilitydemo;

public class PojoDemo {
	String name;
	public String id;
	private double salary;
	
	public PojoDemo(String name,String id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public String  getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public static void main(String arg[]) {
		PojoDemo p=new PojoDemo("jaydeeep", "1012", 39000.12);
		System.out.println(" id :"+p.id+" name :"+p.name+" salary :"+p.salary);
	}
	

}
