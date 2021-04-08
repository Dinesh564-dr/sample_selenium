package day3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
		String message="element is not clickable";
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		//to apply border
		org.openqa.selenium.JavascriptExecutor jse = (org.openqa.selenium.JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='3px solid red'", ele);
		

		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Gangadhar\\eclipse-workspace\\selenium\\screenshot\\orangeHRM.png"));
		//driver.close();
		
		//to generate alert
		org.openqa.selenium.JavascriptExecutor jse2 = (org.openqa.selenium.JavascriptExecutor) driver;
		jse2.executeScript("alert('"+message+"')");
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//to click on element
		org.openqa.selenium.JavascriptExecutor jse3 = (org.openqa.selenium.JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].click();", ele);
		
		
		//to scroll the page
		org.openqa.selenium.JavascriptExecutor scroll = (org.openqa.selenium.JavascriptExecutor) driver;
		scroll.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		//to scroll the page until element is visible
		WebElement elementtobeclick=driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		org.openqa.selenium.JavascriptExecutor scrolluntilelevisible = (org.openqa.selenium.JavascriptExecutor) driver;
		scrolluntilelevisible.executeScript("arguments[0].scrollIntoView(true)",elementtobeclick);
		
		elementtobeclick.click();
}
}