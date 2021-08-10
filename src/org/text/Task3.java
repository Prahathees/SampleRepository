package org.text;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");	
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			

			driver.manage().window().maximize();

WebElement btnInt = driver.findElement(By.id("interview-question-accordion"));
	btnInt.click();
	
	WebElement lnkCTS = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
	Actions actions = new Actions(driver);
	
	actions.contextClick(lnkCTS).perform();
	
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}