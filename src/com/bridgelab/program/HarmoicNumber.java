package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class HarmoicNumber 
 {
    public static void main(String[] args) 
    {
    	Utility utility = new Utility();
    	System.out.println("Enter the number to check the harmonic number : "); 
		int number = utility.getIntValue();
    	utility.getHarmonicNumber(number);
	}
}
