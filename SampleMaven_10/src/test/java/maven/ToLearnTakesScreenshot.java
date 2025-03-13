package maven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnTakesScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File temp=
		 * ts.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("./Screenshots/Basic.png"); FileHandler.copy(temp, dest);
		 */
		
		/*
		 * File temp=driver.findElement(By.id("name")).getScreenshotAs(OutputType.FILE);
		 * File dest = new File("./Screenshots/BasicsWE.png"); FileHandler.copy(temp,
		 * dest);
		 */
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+timeStamp+".png");
		FileHandler.copy(temp, dest);
		
		
	}

}
