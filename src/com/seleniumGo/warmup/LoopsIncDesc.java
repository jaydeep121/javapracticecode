package com.seleniumGo.warmup;

public class LoopsIncDesc {
	public static void main(String arg[]) {
		int i=0;
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);
		int n=1;
		while(n<=10) {
			System.out.print(n+" ");
			n++;
		}
		System.out.println();
		for(int j=1;j<=10;j++) {
			System.out.print(j+" ");
		}
	}

}
