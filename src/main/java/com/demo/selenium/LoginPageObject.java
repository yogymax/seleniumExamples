package com.demo.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPageObject {

	private static final String REGISTRATIONTEXT ="Registration Form For Sports";
	
	@FindBy(id="abcd")
	WebElement registrationLabel;
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(id="dob")
	WebElement dob;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="zipcode")
	WebElement zip;
	
	WebElement firstNameInput;
	WebElement lastNameInput;
	WebElement dobInput;
	WebElement addressInput;
	WebElement phoneInput;
	WebElement emailInput;
	WebElement zipcodeInput;
	
	@FindBy(xpath="/html/body/table[3]/tbody/tr/td/input")
	WebElement registerBtn;
	
	public void validateRegisterPage(){
		Assert.assertEquals(registrationLabel.getText(), REGISTRATIONTEXT);
		Assert.assertEquals(registerBtn.getAttribute("value"), "register");
	}

	public void fillRegistrationDetails
	(String fname,String lname,String db,String addr, long phoneN)
	{
		firstName.clear();
		firstName.sendKeys(fname);
		
		lastName.clear();
		lastName.sendKeys(lname);
		
		dob.clear();
		dob.sendKeys(db);
		
		address.clear();
		address.sendKeys(addr);
		
		phone.clear();
		phone.sendKeys(String.valueOf(phoneN));
		
		email.clear();
		email.sendKeys(addr);
		
		zip.clear();
		zip.sendKeys(fname);
	}
	
}
