package org.text;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsRobot {
	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumPractice\\driver\\chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	robot.keyPress(KeyEvent.VK_M);
	robot.keyRelease(KeyEvent.VK_M);robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);robot.keyPress(KeyEvent.VK_I);
	robot.keyRelease(KeyEvent.VK_I);robot.keyPress(KeyEvent.VK_L);robot.keyRelease(KeyEvent.VK_L);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	
	robot.keyPress(KeyEvent.VK_X);
	robot.keyRelease(KeyEvent.VK_X);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	
	
	
	
	
	
	
	
	
	
	}

}
