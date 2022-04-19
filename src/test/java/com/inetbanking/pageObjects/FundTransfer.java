package com.inetbanking.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FundTransfer {
	
	
	
	@FindBy(xpath="//a[text()='Fund Transfer']")
	@CacheLookup
	WebElement FundTranferbtn1;

	@FindBy(name="payersaccount")
	@CacheLookup
	WebElement payeracc;
	
	@FindBy(name="payeeaccount")
	@CacheLookup
	WebElement payeeacc;

	@FindBy(name="ammount")
	@CacheLookup
	WebElement amt;
	
	@FindBy(name="desc")
	@CacheLookup
	WebElement desc;
	
	


	public void FundTransferbtn()
	{
		FundTranferbtn1.click();
		
	}
	public void payeraccount()
	{
		payeracc.sendKeys("51100009");
	}
	public void payeeaccount()
	{
		payeeacc.sendKeys("71188999");
	}
	public void amount()
	{
		amt.sendKeys("270");	
	}
	public void desc()
	{
		desc.sendKeys("Hello World");
	}
	
}
