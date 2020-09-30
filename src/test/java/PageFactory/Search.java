package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Commons.Driver;

public class Search {
    public Search(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "inp_RegionSearch_top")
    private WebElement txt_SearchId;
    @FindBy(id = "input-search-box")
    private WebElement txt_SearchBox;
    @FindBy(id="input-search-box")
    private WebElement txt_Onward;

   public void SearchMovie(String movie) {
        txt_SearchBox.sendKeys(movie);
        txt_SearchBox.sendKeys(Keys.ENTER);

   }
public void enterCity(String city) {
    txt_SearchId.sendKeys(city);
     //

}
public void searchOnwardMovie(String onward){
    txt_Onward.sendKeys(onward);
    txt_Onward.sendKeys(Keys.ENTER);

}

}
