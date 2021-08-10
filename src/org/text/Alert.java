package org.text;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) {
		
		
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");	
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://demo.automationtesting.in/Alerts.html");
				driver.manage().window().maximize();
				
				WebElement btn = driver.findElement(By.xpath("//a[@href=\"#Textbox\"]"));
				btn.click();
			
	//org.openqa.selenium.Alert alert = driver.switchTo().alert();
	
	//String text = alert.getText();
	//System.out.println(text);
	//alert.accept();
	
				
	
				WebElement btn1 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
				btn1.click();
				
				org.openqa.selenium.Alert al = driver.switchTo().alert();
	String text = al.getText();
	System.out.println(text);
	
	al.sendKeys("App");

	
	
	
	
	}

}
