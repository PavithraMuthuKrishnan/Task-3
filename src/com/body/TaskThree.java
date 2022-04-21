package com.body;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThree {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavithra MuthuKrish\\eclipse-workspace\\Task3\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://www.instagram.com/");
        
		driver.manage().window().maximize();
		
		WebElement txtUsername = driver.findElement(By.xpath("//input[@name='username']"));
		txtUsername.sendKeys("Pavithra");
		
        WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
        txtPassword.sendKeys("12345");
        
		
		
		
	}	

}
