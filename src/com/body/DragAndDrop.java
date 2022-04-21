package com.body;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavithra MuthuKrish\\eclipse-workspace\\Task3\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        
        WebElement bank = driver.findElement(By.id("credit2"));
        WebElement account = driver.findElement(By.id("bank"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(bank,account).perform();
        
        WebElement fourth = driver.findElement(By.id("fourth"));
        WebElement amt = driver.findElement(By.id("amt7"));
        Actions actions1 = new Actions(driver);
        actions1.dragAndDrop(fourth,amt).perform();
        
        WebElement sales = driver.findElement(By.id("credit1"));
        WebElement amt1 = driver.findElement(By.id("loan"));
        Actions actions2 = new Actions(driver);
        actions2.dragAndDrop(sales,amt1).perform();
        
         WebElement four = driver.findElement(By.id("fourth"));
         WebElement amnt = driver.findElement(By.id("amt8"));
         Actions actions3 = new Actions(driver);
         actions3.dragAndDrop(four,amnt).perform();

         WebElement txtprint = driver.findElement(By.id("equal"));
         String text = txtprint.getText();
         System.out.println(text);
        
         
        
        
        
        
        
        
        
        
        
        
		
	}

}



