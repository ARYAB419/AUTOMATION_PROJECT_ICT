package TestCases;

import Commons.Driver;
import ExtentReport.ListenerTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.security.Key;
@Listeners(ListenerTest.class)
public class ReportHost extends Driver {
    @Test
    public void ReportHostClick(){
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[text()='ListYourShow']")).click();

        test=extent.createTest("ReportHost");
        Assert.assertEquals(true,true);
        }

}
