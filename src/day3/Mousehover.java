package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/course/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[@class='menulink']"));
		act.moveToElement(element).build().perform();

		WebElement element2 = driver.findElement(By.xpath("//a[normalize-space()='Articles']"));
		element2.click();
		
		System.out.println(driver.getCurrentUrl());

		driver.close();
	}

}
