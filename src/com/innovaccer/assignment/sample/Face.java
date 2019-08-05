package com.innovaccer.assignment.sample;

public class Face {
	/*public static void printFace() {
		System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
	}*/
	public static void printFace() {
		String arr[]=new String[5];
		arr[0]=" +\"\"\"\"\"+ ";
		arr[1]="[| o o |]";
		arr[2]=" |  ^  | ";
		arr[3]=" | '-' | ";
		arr[4]=" +-----+ ";
		for(String ar:arr) {
			System.out.println(ar);
		}	
	}
	public static void main(String arg[]) {
		printFace();
		
	}
}
