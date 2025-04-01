package testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public WebDriver driver;

	@BeforeMethod // This method runs before every test method.
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	@AfterMethod // This method runs after every test method.
	public void driverQuitAndClose () {
		//		driver.quit();
		//		driver.close(); //Parent Window
	}
}