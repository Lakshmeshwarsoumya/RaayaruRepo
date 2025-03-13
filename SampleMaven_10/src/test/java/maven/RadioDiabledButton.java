package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioDiabledButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/radio/disabled?sublist=2");
		Thread.sleep(2000);
		WebElement radiobtn = driver.findElement(By.xpath("//span[text()='Net Banking']/..//input[@type='radio']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * js.executeScript("arguments[0].removeAttribute('disabled');", radiobtn);
		 * radiobtn.click();
		 */
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement radiobtn1 = wait.until(ExpectedConditions.elementToBeClickable(radiobtn));
	           
		js.executeScript("arguments[0].click();",radiobtn1);
		
	}

}
