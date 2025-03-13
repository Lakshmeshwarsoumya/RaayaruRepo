package maven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnDatePicker {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(checkBoxes.size());
		driver.quit();
		
		
	}

}
