package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	
	public WebDriver getDriver() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe"); // this is code of invoking browser 
		
		WebDriver driver = new ChromeDriver (); // we have accessed chromdriver class
		driver.get(getProperty("url"));
		driver.manage().window().maximize();
		
		return driver;
	}

		public static String getProperty(String key) throws IOException
		{
			File file = new File("src/test/resources/data/master.properties");
			
			FileInputStream fileInputStream = new FileInputStream(file);
			
			Properties properties = new Properties();
			
			properties.load(fileInputStream);
			
			
			
			return properties.getProperty(key);
			
			//this is use to access properties file into code 
		}
		
	public static List<String> readExcel() throws IOException
	{
		List<String> excelData = new ArrayList<String>();
		File file = new File("src/test/resources/data/Testdata.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		
		
	     // it represent complete workbook
		XSSFWorkbook xssfworkbook = new XSSFWorkbook(fileInputStream);

		
		XSSFSheet sheet  = xssfworkbook.getSheet("data");
		
		int lastRow = sheet.getLastRowNum();
		
		for(int i = 1 ; i<lastRow; i++) 
		{
			XSSFRow row = sheet.getRow(i);
			
			int lastCellNum = row.getLastCellNum();
			
			for (int j = 0 ; j<lastCellNum; j++)
			{
				excelData.add(row.getCell(j).toString());
			}
		
		}
		
		xssfworkbook.close();
		return excelData;
				
	}
//
//	
//	
		

public static ArrayList<String> selectOptionFromDropDown(WebElement dropdown, String[] options)
{
	Select select = new Select( dropdown);
	ArrayList<String>  selectedOptions = new ArrayList<String>();
	
	for (String option:options)
	{
		select.selectByVisibleText(option);
	} 
	
	List<WebElement> selectedOptionByLogic =select.getAllSelectedOptions(); 
	
	for(WebElement element:selectedOptionByLogic)
	{
		selectedOptions.add(element.getText());
	}
	
	return selectedOptions;
	
}

	public static String switchToNewWindow(WebDriver driver)
	{
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandle = driver.getWindowHandles();
		
		for (String handle:allWindowHandle)
		{
			if(!(handle.equals(currentWindowHandle)))
			{
				driver.switchTo().window(handle);
			}
		}
		return currentWindowHandle;
	}
	
	
	public static  void switchToWindow(WebDriver driver,String windowHandle)
	{
		driver.switchTo().window(windowHandle);
	}
	
	
	public static ArrayList<String> getAllTabelData(WebDriver driver, String table)
	{
		 List<WebElement> tableOptions =driver.findElements(By.xpath(table));
		 
		 ArrayList<String> allTableData =new ArrayList<>();
		 
		 for (WebElement td : tableOptions)
		 {
			 allTableData.add(td.getText());
		 }
		 
		 return allTableData;
	}
	
	
	
}




