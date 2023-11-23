package com.genpact.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(BCG.CRM.Generic.Listeners.class)
public class TestNG_Test_Listeners {
	
	
	
	
	public static WebDriver driver;
	public static Properties files;

	@Test(priority=1)
	
	public void Open_Browser() throws IOException, InterruptedException {
		
		FileInputStream fis=new FileInputStream("Config.properties");
		files=new Properties();
		files.load(fis);
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver_119.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(files.getProperty("Url"));
		System.out.println("Browser Launch");
		Thread.sleep(2000);	
	}
	
	 @Test(priority=2)
	 public void Valid_Login() throws InterruptedException, IOException {
		 
		 WebElement signin=driver.findElement(By.xpath("//input[@name='Login']"));
		 driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(files.getProperty("username"));
		 Thread.sleep(2000);
		 WebElement pwd=driver.findElement(By.xpath("//input[@name='user_password']"));
		 ////////JavaScriptExecuotr/////////////////////////
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='admin';",pwd);
		 js.executeScript("arguments[0].click()",signin);
		 Thread.sleep(3000);
		 ////////TakeScreenshot/////////////////
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("./Screenshots/test.png"));
		 System.out.println("Screnshot verify");
		 Thread.sleep(2000);
		 
		 
		 
	 }

}






















