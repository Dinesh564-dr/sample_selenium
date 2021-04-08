package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsclass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		WebElement target = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		//act.dragAndDrop(source, target).perform();
		act.clickAndHold(source).moveToElement(target).release().build().perform();

	}

}
