package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base {
	@Test
	public void assertEqualsTest () 
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualString = driver.getTitle();
		System.out.println(actualString);
		String expectedString = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualString, expectedString);
	}

	@Test
	public void assertNotEqualsTest () 
	{
		driver.navigate().to("https://www.browserstack.com/");
		String actualString = driver.getTitle();
		System.out.println(actualString);
		String expectedString = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertNotEquals(actualString, expectedString);
	}

	@Test
	public void assertFalseTest () 
	{
		driver.navigate().to("https://www.browserstack.com/");
		Boolean verifyTitle1 = driver.getTitle().equalsIgnoreCase("most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertFalse(verifyTitle1,"Title is False");

	}

	@Test
	public void assertTrueTest () 
	{
		driver.navigate().to("https://www.browserstack.com/");
		Boolean verifyTitle2 = driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertTrue(verifyTitle2,"Title is True");
	}
}