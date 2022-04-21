	package com.phone;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class MouseOverAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavithra MuthuKrish\\eclipse-workspace\\Task3\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	    driver.get("https://www.t-mobile.com/?src=spr&rdpage=/");
	    driver.manage().window().maximize();
	    
	    WebElement btnclose = driver.findElement(By.xpath("//button[@class='phx-modal__close']"));
	     btnclose.click();
	     Thread.sleep(7000);
	    
	      WebElement btnclose1 = driver.findElement(By.xpath("//button[@tabindex='0']"));
	      btnclose1.click();
	      
	      WebElement lnkphonesdevices = driver.findElement(By.xpath("//a[@href='/cell-phones?INTNAV=tNav%3ADevices']"));
		 Actions actions = new Actions(driver);
		    actions.moveToElement(lnkphonesdevices).perform();
		    
		    WebElement btn5g = driver.findElement(By.xpath("//a[@href='/devices/5g-phones?INTNAV=tNav%3ADevices%3A5GPhones']"));
		    btn5g.click();
		    Thread.sleep(7000);
		    
		    WebElement txtprint = driver.findElement(By.xpath("//a[@id='digital-footer-bottom-link-bottom-9']"));
		    String text = txtprint.getText();
		    System.out.println(text);
		   
	    
	    
	    
	    
	}
	}
