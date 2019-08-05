package com.seleniumGo.warmup;

public class StaticAndNonStatic {
	String name="jaydeep";
	static int id=1012;
	public void nonStaticMethod() {
		System.out.println("nonStaticMethid called");
	}
	public static void staticMethod() {
		System.out.println("staticMethod called");
	}
	public static void main(String arg[]) {
		//calling non static method
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.nonStaticMethod();
		System.out.println(obj.id+" : "+obj.name);
		System.out.println(id);//we can not call directly non static members , we need to create object
		
		
		//static method calling :
		staticMethod();
		StaticAndNonStatic.staticMethod();
		System.out.println(StaticAndNonStatic.id);
		
	}

}
