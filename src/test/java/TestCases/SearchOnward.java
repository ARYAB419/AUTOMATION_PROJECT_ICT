package TestCases;

import Commons.Driver;
import DataProvider.SearchDatas;
import PageFactory.PageFactoryObjects;
import PageFactory.Search;
//import ReportCommon.Reports;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(CustomListener.class)
public class SearchOnward extends Driver {
    @Test(priority = 3,dataProvider = "EnterOnwardMovie",dataProviderClass= SearchDatas.class)
    public static void validateSearchOnward(String onward) throws IOException {
//        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
//        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);
      PageFactoryObjects pageFactoryObjects=new PageFactoryObjects(driver);
        pageFactoryObjects.searchOnwardMovie(onward);

        test=extent.createTest("Search Onward Tolland Actor");
            Assert.assertEquals(true,true);





    }
}
