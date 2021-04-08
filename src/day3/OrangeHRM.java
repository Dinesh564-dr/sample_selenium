package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();	
		
		clickOnTab(driver,"Leave");
		driver.close();
		
	}

	public static void clickOnTab(WebDriver driver,String tabName) 
	{
		List<WebElement> menuTab=driver.findElements(By.xpath("//div[@class='menu']//ul//a[@class='firstLevelMenu']//b"));
	
		for(WebElement menu:menuTab)
		{
			String name=menu.getText();
			
			if(name.equalsIgnoreCase(tabName))
			{
				menu.click();
				break;
			}
		}
	}

}
