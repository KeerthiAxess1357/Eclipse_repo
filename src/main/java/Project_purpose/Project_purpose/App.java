package Project_purpose.Project_purpose;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement clk = driver.findElement(By.id("email"));
//		clk.click();
		js.executeScript("arguments[0].click()", clk);
		js.executeScript("arguments[0].value='helloo'", clk);
		
		
		
		
		
		
		
		
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//		driver.switchTo().frame(0);
//		WebElement button1 = driver.findElement(By.id("RESULT_TextField-0"));
//		button1.sendKeys("keerthana");
//		WebElement button2 = driver.findElement(By.xpath(
//				"//div[@class=\"form_table\"]//preceding::table[@class=\"inline_grid choices\"]//preceding::label[text()=\"Female\"]"));
////		input[@name=\"RESULT_RadioButton-1\"]//preceding::label[text()=\"Male\"]
////		div[@class="form_table"]//preceding::table[@class="inline_grid choices"]//preceding::label[text()="Female"]
//		button2.click();
//		WebElement datefield = driver.findElement(By.id("RESULT_TextField-2"));
//		datefield.sendKeys("12-06-2000");
//		WebElement dropdownlocate = driver.findElement(By.id("RESULT_RadioButton-3"));
//		Select dropdown1 = new Select(dropdownlocate);
//		dropdown1.selectByVisibleText("Automation Engineer");
//		WebElement Returntap = driver.findElement(By.id("Report abuse"));
//		Returntap.sendKeys(Keys.RETURN);
//		Thread.sleep(2000);
//		driver.close();
//	}
	}
}
