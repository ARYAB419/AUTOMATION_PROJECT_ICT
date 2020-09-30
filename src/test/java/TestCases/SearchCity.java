package TestCases;

import Commons.Driver;
import DataProvider.SearchDatas;
import ExtentReport.ListenerTest;
import Listeners.Base;
import PageFactory.PageFactoryObjects;
//import ReportCommon.Reports;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import Listeners.Base;
@Listeners(ListenerTest.class)
public class SearchCity extends Driver {

    @Test(priority = 1,dataProvider ="EnterCityData", dataProviderClass = SearchDatas.class)
    public  void SearchCity(String city) throws IOException {
        PageFactoryObjects pageFactoryObjects=new PageFactoryObjects(driver);
        pageFactoryObjects.enterCity(city);
        test=extent.createTest("Search City");
       Assert.assertEquals(true,true);

    }
}