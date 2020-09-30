package TestCases;

import Listeners.Base;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class CustomListener extends Base implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed");
        try {
            pass(result.getMethod().getMethodName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
