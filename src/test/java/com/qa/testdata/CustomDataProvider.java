package com.qa.testdata;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	@DataProvider(name = "test-data")
	
	public static Object[][] getData(Method m) {
		switch (m.getName()) {
		case "verifySearchResult":
			return new Object[][] { { "Wallpaper" }, { "City Images" } };
		case "verifyPageTitle":
			return new Object[][] { { "Google" } };
		}

		return null;
	}

}
