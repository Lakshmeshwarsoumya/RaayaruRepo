package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KawasakiTest {
	@Test
	public void launchWebsite() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.kawasaki-india.com/");
		Reporter.log("kawasaki browser launched ",true);
	}

}
