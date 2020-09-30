package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryObjects {
    public PageFactoryObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "inp_RegionSearch_top")
    private WebElement txt_SearchId;
    @FindBy(id = "input-search-box")
    private WebElement txt_SearchBox;
    @FindBy(id="input-search-box")
    private WebElement txt_Onward;
    @FindBy(xpath ="//*[@id=\"navbar\"]/div[3]/div/div[2]/ul/li[1]/a")
    private  WebElement txt_ListMyShow;

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
    public void searchReportAndBussiness(){
        txt_ListMyShow.sendKeys(Keys.ENTER);
    }

}
