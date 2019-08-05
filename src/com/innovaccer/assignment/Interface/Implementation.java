package com.innovaccer.assignment.Interface;

public class Implementation implements Int1,Int2 {
	
	public void show() {
		/*Int1.super.show();
		Int2.super.show();*/
	}
	public static void main(String arg[]) {
		Implementation ob=new Implementation();
		ob.show();
		Int1 o=new Implementation();
		
	}

}
