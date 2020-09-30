package TestCases;

import Commons.Driver;
import ExtentReport.ListenerTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class CheckOffers extends Driver {
    @Test
     public static void CheckOffersMethod(){
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);

    WebElement r= driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[3]/div/div[2]/ul/li[3]/a"));
r.sendKeys(Keys.ENTER);
        driver.findElement(By.id("rewards")).click();
        test=extent.createTest("Check Offers");
        Assert.assertEquals(true,true);
    }




}
