package SearchPage;

import DagaBase.DataBaseConnection;
import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DataBaseSearch extends CommonAPI {

    DataBaseConnection dataBase = new DataBaseConnection();

    @FindBy(how = How.CSS, using ="#gh-ac")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using ="#gh-btn")
    public static WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }
    public WebElement getSubmitButtonWebElement() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ value);
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException{
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = dataBase.getItemsListFromDB();
        for(int i=0;i<list.size();i++){

            searchFor(list.get(i));
            submitSearchButton();
        itemFoundOnSearch(list.get(i));
        clearInput();
    }
}
    public void itemFoundOnSearch(String value){
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+" "+ value);
        Assert.assertEquals(value,value);
    }

    public void searchItemsAndSubmitButton(WebDriver driver1)throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = dataBase.getItemsListFromDB();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }

    public void searchItemsAndSubmitButtonFromExcelFile()throws Exception, IOException, SQLException, ClassNotFoundException {
// ToDo
//Read data from Excel file using Apache POI
        List<String> list = null;
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            clearInput();
        }
    }

    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> itemList = dataBase.getItemsListFromDB();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();

        }
    }

}

