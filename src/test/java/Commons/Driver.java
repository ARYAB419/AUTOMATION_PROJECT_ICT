package Commons;

import Config.Config;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver driver = null;
    public static Config config;

    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test=null;

    static {
        try {
            config = Config.ConfigReturn();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @BeforeSuite //creates a template for the report
    public void beginReport() throws UnknownHostException {
        htmlReporter = new ExtentHtmlReporter("Reports//report.html");
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Functional Report");
        htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("Hostname", InetAddress.getLocalHost().getHostName());
        extent.setSystemInfo("OS", "Windows");
        extent.setSystemInfo("Tester", "Arya B");
        extent.setSystemInfo("Browser", "Chrome");
    }

    @BeforeTest
    public static WebDriver openBrowser() {
        String browser = config.get("BROWSER");
        String url = config.get("URL");
        switch (browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("useAutomationExtention", false);
                // WebDriver driver;
                driver = new ChromeDriver(options);
                break;



            case "IE":
                System.setProperty("webdriver.ie.driver", "src//main//resources//IEDriverServer.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                InternetExplorerOptions ieoptions = new InternetExplorerOptions(capabilities);
                driver = new InternetExplorerDriver(ieoptions);
                break;
        }
        driver.manage().window().maximize();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        return driver;


    }
    public static String takeScreenshot(WebDriver driver, String name) throws IOException
    {
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File image = screenshot.getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String file = "image"+random.nextInt(1000)+".png";
        String filename = System.getProperty("user.dir")+"\\Reports\\" +file;
        FileUtils.copyFile(image, new File(filename));
        return file;
    }
//    public static void scroll(String value)
//    {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript(value);// value = window.scrollBy(0,xx)
//    }






    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }

    @AfterSuite
    public void endReport()
    {
        extent.flush();
    }
}



