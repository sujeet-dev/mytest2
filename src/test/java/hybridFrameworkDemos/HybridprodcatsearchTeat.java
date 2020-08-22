package hybridFrameworkDemos;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPages.BrowserFactory;
import pomPages.ClsEbay;
import pomPages.GetData;

public class HybridprodcatsearchTeat 
{
	  @Test(dataProvider = "ebayData")
	  public void CatSearch(String ddValue, String txtValue) 
	  {
		WebDriver driver=BrowserFactory.startBrowser("Chrome","http://ebay.com");
		  
		ClsEbay obj=new ClsEbay(driver);
		obj.fnCatsearch(ddValue, txtValue);
		  
		  Reporter.log("'" + txtValue + "' product searched in '" + ddValue + "' category test  is successfull....",true);
		  
	  }

	  @DataProvider
	  public Object[][] ebayData() throws Exception
	  {
	    Object[][] myData=GetData.getExcelData(System.getProperty("user.dir") + "\\src\\test\\resources\\ebayData.xlsx");
	    
	    return myData;
	  }
}
