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

public class Pomcatsearchtest {
  @Test
  public void CatSearch()
  {
	  
	WebDriver driver=BrowserFactory.startBrowser("Chrome","http://ebay.com");
	  
	 
ClsEbay obj=new ClsEbay(driver);
obj.fnCatsearch("Cameras & Photo","Sony");
	  
	  Reporter.log("Ebay searched is successfull,true");

  }
}
