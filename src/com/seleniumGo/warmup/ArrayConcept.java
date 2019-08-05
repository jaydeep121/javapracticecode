package com.seleniumGo.warmup;

public class ArrayConcept {
	public static void main(String arg[]) {
		/* limitation of array : 
		1.Size is fixed (static array ): to overcome this issue we use dynamic array that is arrayLst 	
		2.stores only similar data types value : to over come this we use object array
		*/
		int a[]= {1,2,3,33,44,55};
		System.out.println(a[2]);
		
		String s[]= {"jaydeep","anuj","sumit","nilanshu"};
		for(String s1:s) {
			System.out.println(s1);
		}
		char c[]= {'j','a','y'};
		System.out.println(c[0]);
		int arr[]=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		for(int ar:arr) {
			System.out.println(ar);
		}
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[1]);
		double d[]=new double[2];
		d[0]=11.2;
		d[1]=12;
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		Object obr[]=new Object[5];
		obr[0]=1;
		obr[1]="jay";
		obr[2]=11.2;
		obr[3]='j';
		obr[4]=false;
		for(Object ob:obr) {
			System.out.println(ob);
		}
	
	}

}
