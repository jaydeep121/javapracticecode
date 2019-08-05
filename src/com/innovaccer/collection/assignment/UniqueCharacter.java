package com.innovaccer.collection.assignment;

public class UniqueCharacter {
	public static void uniqueCharacters(String test){
	    String temp = "";
	    for (int i = 0; i < test.length(); i++){
	        char current = test.charAt(i);
	        if (temp.indexOf(current) <0){
	            temp = temp + current;
	        } else {
	            temp = temp.replace(String.valueOf(current), "");
	        }
	    }
	    System.out.println(temp + " ");
	}
	public static void main(String arg[]) {
		uniqueCharacters("gvgdhgggggdhfgdhhhgdgfds  ghdgfdhfg shddsdshh");
	}
	
}
