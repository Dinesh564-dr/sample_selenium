package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://stuntcoders.com/snippets/javascript-countdown/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement ele = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='javascript_countdown_time']")));
		System.out.println(ele.getText());
		driver.close();
	}

}
