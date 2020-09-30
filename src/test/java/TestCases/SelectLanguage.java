package TestCases;

import Commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(CustomListener.class)


    public class SelectLanguage extends Driver {
    @Test
        public static void selectLanguage(){
            driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Goa");
            driver.findElement(By.id("inp_RegionSearch_top")).sendKeys(Keys.ENTER);

        }


    }

