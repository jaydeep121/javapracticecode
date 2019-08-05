package com.innovaccer.collection.assignment;


import java.util.Arrays;

public class ArrayShorting {
	
	public static void inBuiltShorting() {
		int arr[]= {4,5,11,-1,55,0,0,1};
		Arrays.sort(arr); 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
    public static void withoutBuiltInShouritng() {
        int  temp;
        int num[] = {4,5,11,-1,55,0,0,1};
        for (int i = 0; i < num.length; i++){
            for (int j = i + 1; j < num.length; j++) { 
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length - 1; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        System.out.print(num[num.length - 1]);  	
    } 
	public static void main(String arg[]) {
		withoutBuiltInShouritng();
		inBuiltShorting();
	}

}
