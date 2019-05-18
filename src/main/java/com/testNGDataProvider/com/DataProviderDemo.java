package com.testNGDataProvider.com;

import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider ="LoginDataProvider",dataProviderClass=CustomDataProvider.class)
	public void loginTest(String email,String pwd) {
		
		System.out.println(email + "  " + pwd);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}