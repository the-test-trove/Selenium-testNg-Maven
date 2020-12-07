package com.qa.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import com.qa.pages.SamplePage;
import com.qa.util.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends Utility {

	public SamplePage sample;

	public BaseClass() {

		propertyInit();
	}

	public static void intialization() {

		String browserName = prop.getProperty("Browser");
		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("url"));

	}

	@AfterTest
	public void tearDown() {
		// closes all the browser windows opened by web driver
		driver.quit();
	}

}
