package maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataIntoTextFieldWithPlaceHolder {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui");
		WebElement nameTextField = driver.findElement(By.id("name"));
		/*
		 * String placeholderTextField = nameTextField.getAttribute("placeholder");
		 * System.out.println(placeholderTextField);
		 */
		String tooltipTF = nameTextField.getAttribute("title");
		System.out.println(tooltipTF);
		nameTextField.sendKeys("Soumya");

		driver.quit();
	}

}
