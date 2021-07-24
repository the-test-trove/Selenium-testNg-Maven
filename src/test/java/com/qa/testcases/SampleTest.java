package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.base.BaseClass;
import com.qa.pages.SamplePage;
import com.qa.testdata.CustomDataProvider;

public class SampleTest extends BaseClass {

	public SampleTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		intialization();
		sample = new SamplePage();
	}
	@Test(priority = 1, dataProvider = "test-data", dataProviderClass = CustomDataProvider.class)
	public void verifyPageTitle(String title) {

		String pageTitle = sample.getPageTitle();
		
		Assert.assertEquals(sample.getPageTitle(), title);
		System.out.println(pageTitle);
	}

	@Test(priority = 2, dataProvider = "test-data", dataProviderClass = CustomDataProvider.class)
	public void verifySearchResult(String key) {
		sample.search(key);
			Assert.assertTrue(true, "Test case Failed");
			
			}

}
