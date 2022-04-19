package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;

	public AddCustomerPage(WebDriver driver) {
		this.ldriver = driver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath= "//a[contains(.,'New Customer')]")
	@CacheLookup
	WebElement newUser;
	
	@FindBy(name = "name")
	@CacheLookup
	WebElement txtname;

	@FindBy(name = "rad1")
	@CacheLookup
	WebElement m;

	@FindBy(id = "dob")
	@CacheLookup
	WebElement txtdob;

	@FindBy(name = "addr")
	@CacheLookup
	WebElement txtaddress;

	@FindBy(name = "city")
	@CacheLookup
	WebElement txtcity;

	@FindBy(name =  "state")
	@CacheLookup
	WebElement txtstate;

	@FindBy(name = "pinno")
	@CacheLookup
	WebElement txtpinno;

	@FindBy(name = "telephoneno")
	@CacheLookup
	WebElement txttelephoneno;

	@FindBy(name = "emailid")
	@CacheLookup
	WebElement txtemailid;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement submitform;

	public void pagenewUser()
	{
		newUser.click();
	}
	public void setname(String name) {
		txtname.sendKeys(name);
	}

	public void setdob(String mm,String dd, String yy) throws InterruptedException {
		
		txtdob.sendKeys(mm+"-"+dd+"-"+yy);
		/*
		Thread.sleep(3000);
	
		txtdob.sendKeys(dd);
		Thread.sleep(3000);
		txtdob.sendKeys(yy);
		Thread.sleep(3000);
	System.out.println(mm+"======"+dd+"======"+yy);
	*/
	}

	public void setaddress(String address) {
		txtaddress.sendKeys(address);
	}

	public void setcity(String city) {
		txtcity.sendKeys(city);
	}

	public void setstate(String state) {
		txtstate.sendKeys(state);
	}
	
	public void setpinno(String pinno) {
		txtpinno.sendKeys(pinno);
	}

	public void settelephoneno(String telephoneno) {
		txttelephoneno.sendKeys(telephoneno);
	}

	public void setemailid(String emailid) {
		txtemailid.sendKeys(emailid);
	}

	public void setpassword(String password) {
		txtpassword.sendKeys(password);
	}
	public void submitform()
	{
		submitform.click();
	}

}
