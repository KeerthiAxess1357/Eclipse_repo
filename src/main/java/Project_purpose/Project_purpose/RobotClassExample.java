package Project_purpose.Project_purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class RobotClassExample {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/login/");
		driver.get("https://www.google.com");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement email = driver.findElement(By.id("email"));
        js.executeScript("arguments[0].value='keerthi@gmail.com'",email);
		
		WebElement password = driver.findElement(By.id("pass"));
        js.executeScript("arguments[0].value='keerthi'",password);
        
        WebElement loginbtn = driver.findElement(By.id("loginbutton"));
        js.executeScript("arguments[0].setAttribute('style','color:black')", loginbtn);
        js.executeScript("arguments[0].click()",loginbtn);
        Thread.sleep(5000);
        driver.close();
		
        
        
        
        
//		js.executeScript("argument[0].click()",cl);
		
		
		
		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_M);
//		robot.keyRelease(KeyEvent.VK_A);
//		Thread.sleep(1000);
		
////      ==================================================	
////		Keyboard Events
//		
//		// Press and release the "A" key
//		robot.keyPress(KeyEvent.VK_C);
//		robot.keyRelease(KeyEvent.VK_A);
//		
//
////		=======================================================
//		
//        // Simulate pressing and releasing Ctrl+C (copy shortcut)
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_C);
//        robot.keyRelease(KeyEvent.VK_C);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//
////        =======================================================
//        
////        dollor simple
//        
//        // Simulate pressing the Shift key
//        robot.keyPress(KeyEvent.VK_SHIFT);
//
//        // Simulate pressing the 4 key (which types the dollar sign when Shift is held down)
//        robot.keyPress(KeyEvent.VK_4);
//
//        // Simulate releasing the 4 key
//        robot.keyRelease(KeyEvent.VK_4);
//
//        // Simulate releasing the Shift key
//        robot.keyRelease(KeyEvent.VK_SHIFT);
//        
////        =========================================================
//        
//        // Simulate pressing the Caps Lock key
//        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
//
//        // Simulate releasing the Caps Lock key
//        robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
//
////        =========================================================
//        
//        
//        
//        
////        javascript executor 
//        
//        
//        // Find the text box using its ID, name, or other locators
//        WebElement textBox = driver.findElementById("textboxId"); // Replace "textboxId" with the actual ID
//
//        // Use JavascriptExecutor to set the value of the text box
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("arguments[0].value = 'Hello, Selenium!';", textBox);
//
//        
//        
//        
//        
//        
//		// Close the browser
//		driver.quit();
	}


}
