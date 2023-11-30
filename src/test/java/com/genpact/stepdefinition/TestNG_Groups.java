package com.genpact.stepdefinition;

import org.testng.annotations.Test;

public class TestNG_Groups {
	
	///
	
	   @Test(groups="Regression")
	   public void TestCase_One() {
		   
		   System.out.println("Test case one in Regression Group");
	   }
	   
	   @Test(groups="Smoke")
	   public void TestCase_Two() {
		   
		   System.out.println("Test case two in Smoke Group");
	   }
	   
	   @Test(groups="Regression")
	   public void TestCase_Three() {
		   
		   System.out.println("Test case three in Regression Group");
	   }
	   
	   @Test(groups="Regression")
	   public void Testcase_Four() {
		   
		   System.out.println("Test case Four in Regrssion Group");
		   
		   
	   }

}
