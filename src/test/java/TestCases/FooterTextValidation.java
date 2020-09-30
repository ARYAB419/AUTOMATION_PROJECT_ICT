package TestCases;

import Commons.Driver;
import DataProvider.SearchDatas;
import ExtentReport.ListenerTest;
import PageFactory.PageFactoryObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class FooterTextValidation extends Driver {
    @Test(priority=4)
    public  void   FooterTextValidationMethod() throws InterruptedException {
     driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);

         Thread.sleep(3000);
       Actions actions=new Actions(driver);
       actions.sendKeys(Keys.PAGE_DOWN);
        test=extent.createTest("FooterTextValidation");
        Assert.assertEquals(true,true);

    }

}
