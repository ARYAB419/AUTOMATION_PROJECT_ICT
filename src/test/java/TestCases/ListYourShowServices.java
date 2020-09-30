package TestCases;

import Commons.Driver;
import ExtentReport.ListenerTest;
import PageFactory.PageFactoryObjects;
//import ReportCommon.Reports;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(ListenerTest.class)
public class ListYourShowServices extends Driver {
    @Test(priority = 5)
    public static void ListYourShowServicesMethod() throws IOException {

        PageFactoryObjects pageFactoryObjects = new PageFactoryObjects(driver);
        pageFactoryObjects.searchReportAndBussiness();
         driver.findElement(By.xpath("//div[@class='__para']/p[text()='After successful collaborations with the best event organisers over the past decade and a half, we’re well equipped to bring your vision to life.']"));
        test=extent.createTest(" List Your Show Services");
        Assert.assertEquals(true,true);


    }
}
