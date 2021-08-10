package org.text;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
	
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");	
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.co.in/webhp");
			driver.manage().window().maximize();


	WebElement txtSearch = driver.findElement(By.name("q"));
	txtSearch.sendKeys("Vels",Keys.ENTER);
	
	Actions actions = new Actions(driver);
	
//actions.doubleClick(txtSearch).perform();





//Robot robot = new Robot();

//robot.keyPress(KeyEvent.VK_DOWN);
//robot.keyPress(KeyEvent.VK_X);	
//robot.keyRelease(KeyEvent.VK_X);	
//robot.keyRelease(KeyEvent.VK_CONTROL);
	
	
	
	
	
	
	
	
	
	
	}}
