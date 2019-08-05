package com.seleniumGo.warmup;

public class Test {
	//constructor overloading
	int x,y;
	Test(){
		x=y=11;
	}
	Test(int x,int y){
		this.x=x;
		this.y=y;
	}
	void disp() {
		System.out.println(x+" :  "+y);
	}
	public static void main(String arg[]) {
		Test t=new Test();
		t.disp();
		Test t2=new Test(1, 2);
		t2.disp();
	}
	
}
