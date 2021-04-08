package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement month_DD = driver.findElement(By.id("month"));

		Select month = new Select(month_DD);
		month.selectByVisibleText("Dec");

		WebElement selectedMonth = month.getFirstSelectedOption();

		String textValue = selectedMonth.getText();

		System.out.println("Last Selected Value is ::" + textValue);

	}

}
