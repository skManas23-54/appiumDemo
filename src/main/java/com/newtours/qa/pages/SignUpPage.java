package com.newtours.qa.pages;

import com.newtours.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage extends TestBase {
    @FindBy(xpath = "//a[contains(text(),'REGISTER')]")
    @CacheLookup
    WebElement RegBtn;

    @FindBy(xpath = "//input[@name='firstName']")
    @CacheLookup
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    @CacheLookup
    WebElement lastName;

    @FindBy(xpath = "//input[@name='phone']")
    @CacheLookup
    WebElement ph;

    @FindBy(xpath = "//input[@name='userName']")
    @CacheLookup
    WebElement email;
    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickRegBtn(String FirstName,String LastNumber,String PhNo,String Email){
        RegBtn.click();
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastNumber);
        ph.sendKeys(PhNo);
        email.sendKeys(Email);
    }
}


