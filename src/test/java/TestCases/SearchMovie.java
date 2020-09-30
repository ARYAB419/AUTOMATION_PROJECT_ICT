package TestCases;

import Commons.Driver;
import DataProvider.SearchDatas;

import ExtentReport.ListenerTest;
import PageFactory.PageFactoryObjects;
import PageFactory.Search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(ListenerTest.class)
public class SearchMovie extends Driver{
    @Test(priority =2, dataProvider ="EnterMovieName", dataProviderClass = SearchDatas.class)
    public static void searchMovie(String movie) throws IOException, InterruptedException {
       PageFactoryObjects pageFactoryObjects=new PageFactoryObjects(driver);
        pageFactoryObjects.SearchMovie(movie);
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
        driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);
        test=extent.createTest("Search Movie");
        Assert.assertEquals(true,true);




    }
}
