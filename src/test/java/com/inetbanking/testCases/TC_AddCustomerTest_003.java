package com.inetbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomerTest_003 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException
	{
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.pagenewUser();
		
		System.out.println("Page reached New Customer");
		
		Thread.sleep(3000);
		
		addcust.setname("AvirM");
		addcust.setdob("001990","10","03");
		
		
		Thread.sleep(5000);
		addcust.setaddress("3108 barons Road Lucknow");
		addcust.setcity("Nanaimo");
		addcust.setstate("BC");
		addcust.settelephoneno("1234666");
		addcust.setpinno("123466");
		addcust.setemailid(randomstring()+"@yahoo.ca");
		addcust.setpassword(randomstring());
		Thread.sleep(5000);
		addcust.submitform();
		
		Thread.sleep(5000);
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if (res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	public String randomstring()
	{
		String email=RandomStringUtils.randomAlphabetic(6);
		return email;
		
	}
}
