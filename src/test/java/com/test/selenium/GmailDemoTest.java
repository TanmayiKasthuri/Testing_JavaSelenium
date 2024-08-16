package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/gmail/about/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("tanmayi.kasthuri@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		String et="gmail";
		String at=driver.getTitle();
		System.out.println(at);
		driver.close();
		driver.quit();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
	}

}
