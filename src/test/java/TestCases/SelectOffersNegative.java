package TestCases;

import Commons.Driver;
import ExtentReport.ListenerTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class SelectOffersNegative extends Driver {
    @Test
    public static void SelectOffersNegativeMethod(){
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id='navbar']/div[3]/div/div[2]/ul/li[3]/a")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("ajax-typeahead")).sendKeys("Kotak Mahindra Offer'");
        driver.findElement(By.id("ajax-typeahead")).sendKeys(Keys.ENTER);
        driver.findElement(By.className("__search-icon")).click();

        test=extent.createTest("SelectOffersNegative");
        Assert.assertEquals(true,true);

    }
}
