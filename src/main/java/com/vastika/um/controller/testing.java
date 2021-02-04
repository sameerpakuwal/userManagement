package com.vastika.um.controller;

import java.util.Iterator;

public class testing {

	public static void main(String[] args) {
		
//		String s = "ateiutowu"; //ate,tei,eiu,iut,uto,tow,owu
//	     String [] a = new String[s.length()-2];
//	     char [] ch = new char[3];
//	     int count =0;
//	     int count1=0;
//	     int count2=0;
//	     int count3=0;
//	     for(int i=0;i<s.length()-2;i++) {
//	    	 a[i] = s.substring(i, i+3);
//	    	 System.out.println(a[i]);
//	    	 for(int j=0;j<a[i].length();j++) {
//	    		 ch[j]=a[i].charAt(j); //ch[0]=r,a,j
//	    	 }
//	    	 if(check(ch[0])) {
//	    		 if(!check(ch[1])) {
//	    			 if(check(ch[2])) {
//	    				 count++;
//	    			 }else {
//	    				 count1++;}
//	    		 }else {
//	    			 count2++;
//	    		 }
//	    	 }else {
//	    		 count3++;
//	    	 }
//	    	 }
//	     
//	     System.out.println(count);
//	     System.out.println(count1+count2+count3);
//	     
//		}
//		 public static boolean check(char c) {
//	    	 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
//	    		 return true;
//	    	 else
//	    		 return false;
//	    	 
//	     }
		
		
	    String  b  = "bijayata";
	    String  [] bb = new String[b.length()-2];
	    char[]c=new char[3];
	    int count=0;
	    
	    for (int i = 0; i < b.length()-2; i++) {
	    	bb[i]= b.substring(i, i+3);
	    	System.out.println(bb[i]);
	    	
	    	for (int j = 0; j < bb[i].length(); j++) {
				c[j]=bb[i].charAt(j);
				System.out.println(c[j]);
			}
	    	
	    	System.out.println(c);
	    	
	    	if (checkVowel(c[0])== true) {
	    		if(!checkVowel(c[1])==true) {
	    			if (checkVowel(c[2])==true) {
	    				count++;
	    			}
	    		}
	    	}
		}
	    System.out.println("the conditions meet  for "+count+" times.");
		

	    
	}
	 public static boolean checkVowel(char ch) {
		 
		 if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	    	return true;
		 } else {
			 return false;
		 }
	 }
}
