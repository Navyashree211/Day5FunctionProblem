package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class LeapYear 
 {
	 public static void main(String[] args) 
	    {
	    	Utility utility = new Utility();
	    	System.out.println("Enter the number to check the Leap year or Not : "); 
			int year = utility.getIntValue();
	    	utility.checkLeapYear(year);
}
