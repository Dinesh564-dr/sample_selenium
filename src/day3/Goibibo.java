package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goibibo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
		//driver.findElement(By.xpath("//input[@id='departureCalendar']"))
		driver.findElement(By.xpath("//button[normalize-space()='SEARCH']")).click();
		
		//driver.close();
	}

}
