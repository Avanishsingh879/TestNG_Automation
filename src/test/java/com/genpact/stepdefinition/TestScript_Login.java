package com.genpact.stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScript_Login {
	
	public static WebDriver driver;
	public static Properties files;
	
	@Given("Open url and start application")
	public void open_url_and_start_application() throws IOException{
		
		files=new Properties();
	    FileInputStream fis=new FileInputStream("Config.properties"); 
	    files.load(fis);
	    System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver_118.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    driver.get(files.getProperty("Url"));
	    //driver.get("http://localhost:8888/");
	    System.out.println("Browser Launch");
		
		
	    
	}

	@When("User enters UserName and Password")
	public void user_enters_UserName_and_Password(){
		
		driver.findElement(By.name("user_name")).sendKeys(files.getProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(files.getProperty("password"));
		driver.findElement(By.xpath(files.getProperty("Click_Login"))).click();
		System.out.println("Login Successfully");
	  
	}


	@When("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully(){
		
		String ActualTitle=driver.getTitle();
		String ExceptedTitle="admin - My Home Page - Home - vtiger CRM 5 - Commercial Open Source CRM";
		if(ActualTitle.equalsIgnoreCase(ExceptedTitle)) {
			
		 System.out.println("Title Matched");
		}
		
		else {
			
	    System.out.println("Title Not matched");
		}
	    
	}
	

	@Then("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application(){
	  
		//driver.findElement(By.linkText("Sign Out")).click();
		System.out.println("Verify_Logout Link");
	}
	
	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully(){
		
		driver.findElement(By.linkText("Sign Out")).click();
		String ActualTitle=driver.getTitle();
		String ExceptedTitle="vtiger CRM 5 - Commercial Open Source CRM";
		if(ActualTitle.equalsIgnoreCase(ExceptedTitle)) {
			
		 System.out.println("Title Matched");
		}
		
		else {
			
	    System.out.println("Title Not matched");
		}
	   
	}


}
