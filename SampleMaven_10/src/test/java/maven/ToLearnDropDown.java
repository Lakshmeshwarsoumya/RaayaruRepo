package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement numberList = driver.findElement(By.id("select1"));
		Select select = new Select(numberList);
		select.selectByVisibleText("+91");
	}

}
