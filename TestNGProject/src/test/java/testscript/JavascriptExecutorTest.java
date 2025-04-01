package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class JavascriptExecutorTest extends Base {

	//	JavaScriptExecutor is an interface to execute JS in Selenium
	@Test
	public void javaScriptExecutor()
	//	scroll
	{
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver; //
		//		js.executeScript("window.scrollBy(0,450)","");
		//		scroll towards the end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}

	@Test
	public void testSample()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor jsSample = (JavascriptExecutor) driver;

		WebElement sample=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement buttonSample = driver.findElement(By.xpath("//button[@id='button-one']"));

		//sample.sendKeys("hello world java");
		jsSample.executeScript("arguments[0].value='Hello JavaScript';", sample);
		//buttonSample.click();

		//Explicit_wait
		//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//		wait.until(ExpectedConditions.elementToBeClickable(buttonSample));

		//Fluent_wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(buttonSample));
		jsSample.executeScript("arguments[0].click();", buttonSample);
	}

}