package maven;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnSetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='ROADSTER']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='compare']")).click();
		String parentWindow = driver.getWindowHandle();

		Set<String> childWindowIds = driver.getWindowHandles();
		for (String id : childWindowIds) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains("flipkart")) {
				break;
			}
		}
		
		Point flipkartPos = driver.manage().window().getPosition();
		System.out.println(flipkartPos.getX());
		System.out.println(flipkartPos.getY());
		
		for (String id : childWindowIds) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains("ebay")) {
				break;
			}
		}
		
		Point ebayPosition = driver.manage().window().getPosition();
		System.out.println(ebayPosition.getX());
		System.out.println(ebayPosition.getY());
		driver.manage().window().setPosition(ebayPosition);
		
		System.out.println("switched successfully");
		

	}
}
