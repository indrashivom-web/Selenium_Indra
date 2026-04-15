package Com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.DemoWebShop_GenericUtility.BaseTest;
import Com.DemoWebShop_POM.AddNewAddress_Page;
import Com.DemoWebShop_POM.Address_Page;

public class TC_001_Verify_User_is_able_to_add_address_or_not_Test extends BaseTest{
	
	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(2000);
		webDriverUtility.javaScriptScrollToElement(driver, homePage.getAddressesBtn());
		homePage.getAddressesBtn().click();
		
		Address_Page addressPage = new Address_Page(driver);
		webDriverUtility.javaScriptScrollToElement(driver, addressPage.getAddnewBtn());
		addressPage.getAddnewBtn().click();
		
		AddNewAddress_Page addNewAddressPage = new AddNewAddress_Page(driver);
		addNewAddressPage.getFirstNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 0));
		addNewAddressPage.getLastNameTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 1));
		addNewAddressPage.getEmailTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 2));
		
		webDriverUtility.selectByVisibleText(addNewAddressPage.getCountryDropDown(), fileUtility.readDataFromExcelFile("Sheet1", 1, 3));
		
		//addNewAddressPage.getCountryDropDown().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 3));
		
		addNewAddressPage.getCityTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 4));
		addNewAddressPage.getAddress1TextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 5));
		addNewAddressPage.getZipCodeTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 6));
		addNewAddressPage.getPhoneNumberTextField().sendKeys(fileUtility.readDataFromExcelFile("Sheet1", 1, 7));
		addNewAddressPage.getSaveBtn().click();
		Thread.sleep(3000);
		webDriverUtility.webPageScreenshot(driver);
		
	} 

}
