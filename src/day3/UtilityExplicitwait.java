package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityExplicitwait {
	public static WebElement waitForWebElement(WebDriver driver, int time, By by) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(
				ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static WebElement waitForWebElement(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
}
