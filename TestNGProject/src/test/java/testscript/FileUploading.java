package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploading extends Base {
	@Test
	public void fileUploadingUsingSendKeys()
	{
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement fileUpload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		fileUpload.sendKeys("C:\\Users\\robin\\Downloads\\thinkpalm manual.pdf");
		WebElement submit = driver.findElement(By.xpath("//input[@id='file-submit']"));
		submit.click();
	}

	@Test
	public void fileUploadingUsingRobotClass() throws AWTException

	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement robotFileUpload = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		robotFileUpload.click();

		StringSelection  fileselection = new StringSelection("C:\\Users\\robin\\Downloads\\thinkpalm manual.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileselection, null);
		
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}