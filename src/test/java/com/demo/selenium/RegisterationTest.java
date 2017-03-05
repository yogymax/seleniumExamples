package com.demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterationTest {
	
	private static final String appUrl = "C:\\Users\\VINEED\\git\\seleniumExamples\\src\\main\\java\\com\\others\\sample.html";
	LoginPageObject loginInPO =null;
	@BeforeClass
	public void myMethod() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get(appUrl);
	  loginInPO = PageFactory.initElements
	  (driver, LoginPageObject.class);
	}
	
	
	
  @Test
  public void registrationPageTest() {
	  loginInPO.fillRegistrationDetails("A", "B", 
			  "13213", "31231", 1232141);
  }
  
  @Test
  public void validateRegPage() {
	  loginInPO.validateRegisterPage();
  }
  

}
