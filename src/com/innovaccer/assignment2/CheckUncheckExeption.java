package com.innovaccer.assignment2;

import java.io.FileWriter;
import java.io.IOException;

public class CheckUncheckExeption {
	public static void checkException(String path,String text) throws IOException {
		FileWriter fr=new FileWriter(path,true);
		fr.write(text);
		fr.close();
	}
	public static void uncheckException(int a,int b) {
		int result=a/b;
		System.out.println(result);
	}
	public static void main(String arg[]) throws IOException {
		checkException("", ""); // checked exception
		uncheckException(10,0);   //unchecked exception
	}
	

}
