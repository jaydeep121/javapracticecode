package com.seleniumGo.warmup;

public class CopyConst {
	int x,y;
	
	CopyConst(int x,int y){
		this.x=x;
		this.y=y;
	}
	CopyConst(CopyConst z){
		this.x=z.x;
		this.y=z.y;
	}
	void show() {
		System.out.println(x+"  :  "+y);
	}
	public static void main(String arg[]) {
		CopyConst c=new CopyConst(10, 20);
		c.show();
		CopyConst c1=new CopyConst(c);
		c1.show();
	}
}
