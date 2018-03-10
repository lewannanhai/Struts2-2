package com;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.*;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.sun.org.apache.bcel.internal.generic.RETURN;
 
import java.io.IOException;  
import java.io.PrintWriter;  


public class yunsuan {

	private int s1;
	
	private int  s2;
	private String y;
	
	
	
	
	/*public String getS1() {
		return s1;
	}



	public void setS1(String s1) {
		this.s1 = s1;
	}



	public String getS2() {
		return s2;
	}



	public void setS2(String s2) {
		this.s2 = s2;
	}*/



	public String getY() {
		return y;
	}



	public int getS1() {
		return s1;
	}



	public void setS1(int s1) {
		this.s1 = s1;
	}



	public int getS2() {
		return s2;
	}



	public void setS2(int s2) {
		this.s2 = s2;
	}



	public void setY(String y) {
		this.y = y;
	}



	public String  execute(){
		
		if(getY().equals("+")){
			
		     s1=s1+s2;

		return "1";
		
		}
		else if (getY().equals("-")) {
			 s1=s1-s2;
				return "2";
		}
		
		else if (getY().equals("*")) {
			 s1=s1*s2;
				return "3";
		}
		
		else if (getY().equals("/")) {
			 s1=s1/s2;
				return "4";
		}
		
		else {
			
			return "5";
		}
		
		
		
		
		

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
