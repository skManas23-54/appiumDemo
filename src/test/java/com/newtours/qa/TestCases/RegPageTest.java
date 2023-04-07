package com.newtours.qa.TestCases;

import com.newtours.qa.Util.TestUtil;
import com.newtours.qa.base.TestBase;
import com.newtours.qa.pages.SignUpPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegPageTest extends TestBase {
    SignUpPage signUpPage;
    String sheetName="Sheet1";
    public RegPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp() {
        initialization();
        signUpPage=new SignUpPage();
    }
    @DataProvider
    public Object[][]TestData(){
        Object data[][]=TestUtil.getTestData(sheetName);
        return data;
    }
    @Test(dataProvider = "TestData")
    public void rTest(String firstName,String lastName,String phNo,String email ){
//        signUpPage.clickRegBtn("FirstName","LastName","PhNumber","Email");
        signUpPage.clickRegBtn(firstName,lastName,phNo,email);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
