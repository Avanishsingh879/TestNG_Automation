package com.genpact.stepdefinition;

import org.testng.annotations.Test;

public class TestNG_ParallelExecution_Method {
	
	//
	
	  
	   @Test
	   public void Test_Method_1() {
		   
		   System.out.println("Test Method First: " +Thread.currentThread().getId());
	   }
	   
	   @Test
	   public void Test_Method_2() {
		   
		   System.out.println("Test Method Second: " +Thread.currentThread().getId());
	   }

}
