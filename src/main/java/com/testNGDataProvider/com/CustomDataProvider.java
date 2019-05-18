package com.testNGDataProvider.com;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	
	
	

    @DataProvider(name ="LoginDataProvider")
	public Object[][] getData() {

		Object[][] data = { { "shifa@gmail.com", "abc" }, { "salma@gmail.com", "testng" }, { "shafee@gmail.com", "xyz" } };

		return data;

	}

}
