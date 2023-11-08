package com.stqa;




import java.lang.module.Configuration;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;




@SuppressWarnings("deprecation")
public class TestAutomation {

	   WebDriver driver =null;


	@Before
	   public void prerequsities()
	   {
		   
		System.setProperty("webdriver.chrome.drive" ,   "C:\\Users\\DELL\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions  co = new  ChromeOptions();
		co.setPageLoadStrategy(PageLoadStrategy.NONE);
		co.addArguments("--remote-allow-origins=*");
		 driver= new ChromeDriver(co);
//		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://melodious-cupcake-090f97.netlify.app/#food");
		driver.manage().window().maximize();
		
	   }

 
	@Test
	public void  verifyHomePageTitle()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
       wait.until(ExpectedConditions.titleContains("Document"));
        String  expectedTitle = "Document";
		
		String getTitle =driver.getTitle();
		Assert.assertEquals(getTitle, expectedTitle);
		System.out.println("Inside the test");
		
	}
	
//	@Test
//	public void  testLogin()
//	{
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"user\\\"]")));
//		driver.findElement(By.xpath("//*[@id=\"user\"]")).click();
//		
//		
//		
//	}
	@After
	public void  terminateBrowser()
	{
		driver.close();
		
	}
		
	
	        
	
		
		
		
	}

