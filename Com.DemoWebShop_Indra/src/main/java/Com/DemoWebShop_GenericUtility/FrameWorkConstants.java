package Com.DemoWebShop_GenericUtility;

public interface FrameWorkConstants {
	
	JavaUtility jUtil= new JavaUtility();

	static final String excelFilePath="./src/test/resources/testData/addressDataN2.xlsx";
	
	static final String propertyFilePath="./src/test/resources/testData/commonData.properties";
	
	static final String screenshotPath="./screenshots/"+jUtil.localDateAndTime()+".png";
	
	static final String listenersScreenshotPath="./listenersScreenshots/"+jUtil.localDateAndTime()+".png";
	
	static final String reportsPath="./reports/"+jUtil.localDateAndTime()+".html";
	
}
