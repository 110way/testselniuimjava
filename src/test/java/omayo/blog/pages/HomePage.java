package omayo.blog.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//page object model

public class HomePage {

    WebDriver driver;
    
    WebElement multiselectDropDown;
    
    public HomePage(WebDriver driver)
    {
    	this.driver = driver;  // this declare instance  memeber variable

    }
    
    public WebElement getMultiselectDropdownLocator()
    {
    	multiselectDropDown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
    	
    	return multiselectDropDown;
    }
    
    
    public void clickOnThisBlogCreatedForLink()
    {
    	driver.findElement(By.xpath("//a[@id='selenium143']")).click();
    }

}
