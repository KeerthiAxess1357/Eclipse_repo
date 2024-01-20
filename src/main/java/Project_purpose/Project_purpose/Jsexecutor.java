package Project_purpose.Project_purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='google'", email);
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].value='hello'", password);
//		WebElement loginbtn = driver.findElement(By.xpath("//button[text()=\"Log in\"]"));
//		js.executeScript("arguments[0].click()", loginbtn);
		WebElement loginbtnclr = driver.findElement(By.xpath("//button[text()=\"Log in\"]"));
		js.executeScript("arguments[0].setAttribute('style','color:black')", loginbtnclr);
		
	}

}
