package Com.DemoWebShop_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Com.DemoWebShop_GenericUtility.BaseTest;
import Com.DemoWebShop_POM.Address_Page;

public class TC_002_Verify_User_is_able_to_delete_address_or_not2 extends BaseTest{
	
	@Test
	public void deleteAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(2000);
		webDriverUtility.javaScriptScrollToElement(driver, homePage.getAddressesBtn());
		homePage.getAddressesBtn().click();
		
		Address_Page addressPage = new Address_Page(driver);
		addressPage.getDeleteBtn().click();
		Thread.sleep(2000);
		webDriverUtility.alertForAccept(driver);
		
		Thread.sleep(3000);
		webDriverUtility.webPageScreenshot(driver);
		
	} 

}
