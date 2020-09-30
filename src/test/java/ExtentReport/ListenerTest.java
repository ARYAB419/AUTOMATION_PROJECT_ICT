package ExtentReport;

import Commons.Driver;
import TestCases.SearchCity;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class ListenerTest extends Driver implements ITestListener {


    @Override
    public void onTestSuccess(ITestResult Result)
    {
      try
        {
          String screens = Driver.takeScreenshot(driver, Result.getName());
         test.pass("ScreenShot Captured", MediaEntityBuilder.createScreenCaptureFromPath(screens).build());

        }
       catch (IOException e)
       {
           e.printStackTrace();
       }


}
}
