package DataProvider;

import org.testng.annotations.DataProvider;

public class SearchDatas {
    @DataProvider(name = "EnterCityData")
    public static Object[][] DataProviderEnterCityData() {
        return new Object[][]{
                {"Goa"}
               // {"Kolkata"}
        };
    }
    @DataProvider(name="EnterMovieName")
    public static Object[][] DataProviderEnterMovieName() {
        return new Object[][]{
                {"Fantasy Island"}
                //{"Kolkata"}
        };
    }
    @DataProvider(name="EnterOnwardMovie")
    public static Object[][] DataProviderEnterMovieOnward() {
        return new Object[][]{
                {"Onward"}
                //{"Kolkata"}
        };
    }
}
