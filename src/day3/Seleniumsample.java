package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumsample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.close();
	}

}
