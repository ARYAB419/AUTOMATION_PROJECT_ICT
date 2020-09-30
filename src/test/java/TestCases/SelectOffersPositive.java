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
public class SelectOffersPositive extends Driver {
    @Test
    public static void SelectOffersNegativeMethod(){
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[3]/div/div[2]/ul/li[3]/a")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("ajax-typeahead")).sendKeys("ICICI BANK 25%");
        driver.findElement(By.id("ajax-typeahead")).sendKeys(Keys.ENTER);
         ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        test=extent.createTest("SelectOffersPositive");
        Assert.assertEquals(true,true);

    }
}
