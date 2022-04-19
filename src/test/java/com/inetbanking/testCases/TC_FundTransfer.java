package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_FundTransfer extends BaseClass {

	@Test
	public void fundTransfer() throws IOException, InterruptedException
	{
		TC_LoginTest_001 obj=new TC_LoginTest_001();
		obj.loginTest();
		
		Thread.sleep(5000);
		
		
		
	}

}
