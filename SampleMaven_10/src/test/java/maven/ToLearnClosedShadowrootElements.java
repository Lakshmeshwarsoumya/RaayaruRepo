package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnClosedShadowrootElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");

		// identify the web element which is nearer to that shadow root
		driver.findElement(By.xpath("//h1[text()='Login']")).click();

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("Soumya").perform();

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("Soumya").perform();

	}
}
