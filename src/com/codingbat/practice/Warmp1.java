package com.codingbat.practice;

public class Warmp1 {
	public static boolean speepIn(boolean weekday,boolean vocation) {
		if(!weekday||vocation) {
			return true;
		}
		return false;
	}
	public static boolean monkeTrouble(boolean aSmile,boolean bSmile) {
		return (aSmile==bSmile);
	}
	public static int sumDouble(int a,int b) {
		if(a==b) {
			return 2*(a+b);
		}
		else {
			return (a+b);
		}
	}	
	public static int diff21(int n) {
		if(n<=21) {
			return (21-n);
		}
		else {
			return (n-21)*2;
		}	
	}
	public static boolean parrotTrouble(int hour,boolean talking) {
		if((hour<=7||hour>=20)&&talking==true) {
			return true;
		}
		return false;
	}
	public static boolean make10(int a,int b){
		if((a==1||b==1)||(a==10||b==10)||(a+b==10)) {
			return true;
		}
		
		return false;
	}
	public static boolean nearHundred(int n) {
		if(Math.abs(100-n)<=10) {
			return true;
		}
		return false;
	}
	public static boolean negPos(int a,int b) {
		if((a<0)||(b<0)) {
			return true;
		}
		return false;
	}
	public static String notString(String str) {
		if(str.startsWith("not")) {
			return str;
		}
		else{
			return "not "+str;		
		}
	}
	public static String missingChar(String str,int n) {
		StringBuilder sb=new StringBuilder(str);
		sb.deleteCharAt(n);
		return sb.toString();
	}
	public static String stringCharExchange(String str) {
		String first;
		String middle;
		String last;

		if(str.length()==0) {
			return str;
		}
		if(str.length()==1) {
			return str;
		}
		if(str.length()==2) {
			first=str.substring(0,1);
			last=str.substring(1);
			return first+last;
		}
		else {
			first=str.substring(0, 1);
			middle=str.substring(1, str.length()-1);
			last=str.substring(str.length()-1);
			
			return last+middle+first;
		}
	}
	public static String front3(String str) {
		if(str.length()<=3) {
			return str;
		}
		else {
			String front;
			front=str.substring(0, 3);
			
			return front+front+front;
		}
	}
	public static String lastcharadd(String str) {
		if(str.length()>=1) {
			return (str.substring(str.length()-1)+str+str.substring(str.length()-1));
			
		}
		return "string length less than 1";
	}
	public static boolean mul3or5(int num) {
		if((num%3==0)||(num%5==0)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static String front2back2(String str) {
		if(str.length()>=2) {
			String front;
			front=str.substring(0,2);
			return (front+str+front);
		}
		else {
			return ("string lenght is less than 2");
		}
	}
	public static boolean startHi(String str) {
		if(str.toLowerCase().startsWith("hi")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean checkTemp(int a,int b) {
		if((a<0||b<0)||(a>100||b>100)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static boolean int1020(int a,int b) {
		return ((a>=10&&a<=20)||(b>=10&&b<=20));
	}
	public static boolean hasTeen(int a,int b,int c) {
		return((a>=13&&a<=19)||(b>=13&&b<=19)||(c>=13&&c<=19));
	}
	public static boolean loneTeen(int a,int b) {
		boolean aTeen=(a>=13&&a<=19);
		boolean bTeen=(b>=13&&b<=19);
		return ((aTeen&&!bTeen)||(!aTeen&&bTeen));
	}
	public static String delDel(String str) {
		String del=str.substring(1, 4);
		if((str.length()>=4)&&del.toLowerCase().equals("del")) {
			return (str.subSequence(0, 1)+str.substring(4));
		}
		else {
			return str;
		}
	}
	public static boolean mixStart(String str) {
		if(str.length()<3) {
			return false;
		}
		String two=str.substring(1,3);
		if (two.toLowerCase().equals("ix")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static String startOz(String str) {
		String result="";
		if(str.charAt(0)=='o') {
			result=result+str.charAt(0);
		}
		if(str.charAt(1)=='z') {
			result=result+str.charAt(1);
		}
		
		return result;
	}
	public static int intMax(int a,int b,int c) {
		int max;
		if(a>b) {
			max=a;
		}
		else {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		return max;
	}
	public static int close10(int a,int b) {
		int aDiff=Math.abs(a-10);
		int bDiff=Math.abs(b-10);
		if(aDiff<bDiff) {
			return a;
		}
		if(bDiff<aDiff) {
			return a;
		}
		return 0;
	}
	public static boolean in3050(int a, int b) {
		if((a>=30 &&a<=40)&&(b<=30&&b<=40)) {
			return true;
		}
		if((a>=40 &&a<=50)&&(b<=40&&b<=50)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int max1020(int a,int b) {
		if(a>b) {
			if(a>=10&&a<=20	) {
				return a;
			}
		}
		if(a<b) {
			if(b>=10&&b<=20	) {
				return b;
			}
		}
		return 0;	
	}
	public static boolean stringE(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {	
			if(str.charAt(i)=='e') {
				count++;
			}
		}
		return (count >= 1 && count <= 3);
	}
	public static boolean lastDigit(int a,int b) {
		if(b%10==a%10) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static String endUp(String str) {
		if(str.length()<=3) {
			return str.toUpperCase();
		}
		int cut=str.length()-3;
		String front=str.substring(0, cut);
		String last=str.substring(cut);
		return front+last.toUpperCase();
	}
	public static String everyNth(String str,int n) {
		String result="";
		for(int i=0;i<str.length();i=i+n) {
			result=result+str.charAt(i);
		}	
		return result;
	}
	public static void main(String arg[]) {
		System.out.println(everyNth("jaydeep",6));
		//System.out.println(endUp("jaydeep"));
		//System.out.println(lastDigit(113,3));
		//System.out.println(stringE("helooetee"));
		//System.out.println(max1020(15,12));
		//System.out.println(in3050(30,49));
		//System.out.println(close10(1, 2));
		//System.out.println(intMax(1,2,5));
		//System.out.println(startOz("qzovza"));
		//System.out.println(mixStart("5ix  the"));
		//System.out.println(delDel("adelha"));
		//System.out.println(loneTeen(12,12));
		//System.out.println(hasTeen(190,15,103));
		//System.out.println(int1020(10,220));
		//System.out.println(checkTemp(1,0));
		//System.out.println(startHi("HI jaydeep"));
		//System.out.println(front2back2("j"));
		//System.out.println(mul3or5(8));
		//System.out.println(lastcharadd("jay"));
		//System.out.println(front3("cholate"));
		//System.out.println(stringCharExchange("anuj"));
		//System.out.println(missingChar("anuj",1));
		//System.out.println(notString("candy"));
		//System.out.println(negPos(1,-1));
		//System.out.println(nearHundred(89));
		//System.out.println(make10(1, 9));
		//System.out.println(parrotTrouble(20,true));
		//System.out.println(diff21(20));
		//System.out.println(speepIn(false,false));
		//System.out.println(monkeTrouble(false,false));
		//System.out.println(sumDouble(3,3));
	}
}
