package TestCases;

import Commons.Driver;
import DataProvider.SearchDatas;
import ExtentReport.ListenerTest;
import PageFactory.PageFactoryObjects;
//import ReportCommon.Reports;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(ListenerTest.class)

public class ListYourShowHost extends Driver {
    @Test(priority = 4)
    public static void ListYourShowHostMethod() throws IOException {
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);
        PageFactoryObjects pageFactoryObjects = new PageFactoryObjects(driver);
        pageFactoryObjects.searchReportAndBussiness();
        driver.findElement(By.xpath("//*[@id=\"page\"]/div[1]/div[2]/div[3]/div[1]/div/div[1]/h3 "));

            Dimension d = new Dimension(1600,800);
             driver.manage().window().setSize(d);

        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        test=extent.createTest("List your show Host");
        Assert.assertEquals(true,true);



    }

}
