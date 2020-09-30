package Listeners;

import Commons.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;
//test.jpg
public class Base extends Driver {

    public static void pass(String testMethodName) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          try{
              FileUtils.copyFile(screenshot, new File("C:\\Users\\athira-hp\\IdeaProjects\\ICTAssignmentBookMyShow\\screenshots\\"+testMethodName+".jpg"));

          }
          catch (IOException e){
              e.printStackTrace();
          }

    }
}
