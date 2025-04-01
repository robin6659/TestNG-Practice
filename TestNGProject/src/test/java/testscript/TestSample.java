package testscript;

import org.testng.annotations.Test;

public class TestSample extends Base {
	//@Test marks a method as a TestNG test case
	@Test(priority=3)
	public void display() // Test method 1
	{
		System.out.println("Display");	
	}

	@Test(priority = 2)
	public void show() // Test method 2
	{
		System.out.println("Show");	
	}

	@Test(priority = 1)
	public void sample() // Test method 3
	{
		System.out.println("Sample");	
	}
}