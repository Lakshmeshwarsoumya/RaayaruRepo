package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnShadowrootElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		//identify shadow host using xpath
		SearchContext shadowHost = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		shadowHost.findElement(By.cssSelector("input[type='text']")).sendKeys("Soumya");
		
		
	}

}
