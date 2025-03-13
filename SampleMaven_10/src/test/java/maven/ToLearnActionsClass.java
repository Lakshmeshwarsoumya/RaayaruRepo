package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnActionsClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
		driver.findElement(By.linkText("Right Click")).click();
		Actions act = new Actions(driver);
		WebElement rightClickbtn = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		act.contextClick(rightClickbtn).perform();
		Thread.sleep(2000);
		WebElement defaultClick = driver.findElement(By.xpath("//div[text()='Yes']"));
		act.click(defaultClick).perform();
		
		
		driver.findElement(By.linkText("Double Click")).click();
		WebElement doubleClick = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		act.doubleClick(doubleClick).perform();

	}

}
