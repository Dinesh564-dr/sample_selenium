package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listinselenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
		
		List<WebElement>allLinks = driver.findElements(By.xpath("//div[contains(@class,'hidden-sm')]//a"));
		
		System.out.println(allLinks.size());
		
		for(WebElement ele:allLinks)
		{
			System.out.println(ele.getAttribute("href"));
			System.out.println(ele.getAttribute("class"));
		}
		driver.close();
	}

}
