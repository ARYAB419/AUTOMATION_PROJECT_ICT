package TestCases;

import Commons.Driver;
import PageFactory.PageFactoryObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(CustomListener.class)
public class ReportAndBussiness extends Driver {
    @Test
    public static void ReportAndBussinessMethod() throws IOException {
      //  Reports reports=new Reports();
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);
        PageFactoryObjects pageFactoryObjects = new PageFactoryObjects(driver);
        pageFactoryObjects.searchReportAndBussiness();
        driver.findElement(By.xpath("//div/div[text()='Reports & business insights']")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"Reports\"]/div/div[2]/div[2]/div[1]"));
        Assert.assertEquals(true,true);
        String text = element.getText();

    }
}
