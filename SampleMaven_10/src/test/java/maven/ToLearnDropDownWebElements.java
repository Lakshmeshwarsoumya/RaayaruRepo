package maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDropDownWebElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("BOOKS")).click();
		WebElement position = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(position);
		//sel.selectByIndex(3);
		Thread.sleep(2000);
		List<WebElement> byValues = sel.getOptions();
		for(WebElement ele : byValues) {
			System.out.println(ele.getText());
		}
		

		/*
		 * WebElement display = driver.findElement(By.id("products-pagesize")); Select
		 * sel1 = new Select(display); sel1.selectByVisibleText("12");
		 * 
		 * WebElement view = driver.findElement(By.id("products-viewmode")); Select sel3
		 * = new Select(view); sel3.selectByVisibleText("Grid");
		 */

		/*
		 * driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		 * Thread.sleep(2000); WebElement numbers =
		 * driver.findElement(By.id("select1")); Select objsel= new Select(numbers);
		 * Thread.sleep(2000); objsel.selectByVisibleText("+01"); Thread.sleep(2000);
		 * objsel.selectByValue("+92"); Thread.sleep(1000); objsel.selectByIndex(4);
		 */

	}

}
