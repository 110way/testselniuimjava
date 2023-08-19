package omayo.blog.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium142 {

	
    WebDriver driver;
    
    
    public Selenium142(WebDriver driver)
    {
    	this.driver = driver;  // this declare instance  memeber variable

    }
    
    public String getLinkText()
    {
    	return driver.findElement(By.xpath("//a[text()='what is selenium?']")).getText();
    	}
}
