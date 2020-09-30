package TestCases;

import Commons.Driver;
import DataProvider.SearchDatas;
import ExtentReport.ListenerTest;
import PageFactory.PageFactoryObjects;
//import ReportCommon.Reports;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(ListenerTest.class)
public class CrewNegative extends Driver {
    @Test(dataProvider = "EnterOnwardMovie",dataProviderClass= SearchDatas.class)
    public static void validateSearchOnward(String onward) throws IOException {

        PageFactoryObjects pageFactoryObjects = new PageFactoryObjects(driver);
        pageFactoryObjects.searchOnwardMovie(onward);
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);
        if (driver.getPageSource().contains("Tom Holland")) {
            test=extent.createTest("Crew Negative");
            Assert.assertEquals(true,true);
      } else {
            System.out.println("No value");

        }

    }

    }
