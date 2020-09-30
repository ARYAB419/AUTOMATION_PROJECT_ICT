//package Listeners;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Random;
//
//public class ListenerClass extends Base implements ITestListener {
//    public static WebDriver driver = null;
//    @Override
//    public void onTestSuccess(ITestResult result) {
////        ITestListener.super.onTestSuccess(result);
////        System.out.println("TestCase Passed!!");
//
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//       // ITestListener.super.onTestFailure(result);
//        try {
//            failed();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
