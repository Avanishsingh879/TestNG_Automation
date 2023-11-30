package com.genpact.stepdefinition;

import org.testng.annotations.Test;

public class TestNG_Include_Exclude {
	
	
	///
	  @Test(priority=1)
	  public void TestCase_AddLocation() {
		  
		  System.out.println("I am Add Location");
		  
	  }
	  @Test(enabled=false)
	  public void TestCase_AddEmp() {
		  
		  System.out.println("I am Add Emp");
	  }
	  
	  @Test
	  public void TestCase_AddDep() {
		  
		  System.out.println("I am Add Dep");
	  }

}
