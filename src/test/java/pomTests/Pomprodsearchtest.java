package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.BrowserFactory;
import pomPages.ClsEbay;

public class Pomprodsearchtest
{
  @Test
  public void Search() 
  {
	  
	 WebDriver driver=BrowserFactory.startBrowser("Chrome","http://ebay.com");
	  
	ClsEbay obj=new ClsEbay(driver);
	obj.fnSearch("Sony");
	  
	  Reporter.log("Ebay searched is successfull,true");
 
  }
}
