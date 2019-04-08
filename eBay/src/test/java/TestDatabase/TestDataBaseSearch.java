package TestDatabase;

import SearchPage.DataBaseSearch;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDataBaseSearch extends CommonAPI{
    @Test
    public void dataSercgh() throws Exception {
        DataBaseSearch dataBaseSearch = PageFactory.initElements(driver,DataBaseSearch.class);
        dataBaseSearch.searchItemsAndSubmitButton();
    }
}
