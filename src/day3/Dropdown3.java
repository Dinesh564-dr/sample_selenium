package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement month_DD = driver.findElement(By.id("year"));

		Select month = new Select(month_DD);

		List<WebElement> allValues = month.getOptions();

		for (WebElement ele : allValues) {
			System.out.println(ele.getText());
		} 

	}

}
