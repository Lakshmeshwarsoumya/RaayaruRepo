package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnJavascriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * WebElement registerWE = driver.findElement(By.linkText("Register"));
		 * js.executeScript("arguments[0].click()",registerWE); WebElement fnTextField =
		 * driver.findElement(By.id("FirstName"));
		 * js.executeScript("arguments[0].value='Soumya'", fnTextField);
		 * 
		 * js.executeScript("window.scrollBy(0,100)");
		 */
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
}
