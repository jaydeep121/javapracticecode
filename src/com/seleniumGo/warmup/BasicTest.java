package com.seleniumGo.warmup;

public class BasicTest {
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  if (!weekday || vacation) {
		    return true;
		  }
		  return false;
		}
	public static boolean monkeySmiling(boolean a,boolean b) {
		return(a==b);
	}
	public static boolean parretTrouble(boolean talking,int time) {
		/*if(talking==true &&time>=7) {
			return true;
		}
		else {
			return false;
		}*/
		 return (talking && (time < 7 || time > 20));
	} 
	public static void main(String arg[]) {
		System.out.println(parretTrouble(true, 7));
	}
}
