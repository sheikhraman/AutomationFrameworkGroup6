package UnitedHomeTest;

import UnitedHome.UnitedHomePage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class TestUnitedHomePage extends CommonAPI {
    @Test
    public void testUHClogo(){
     clickByXpath("//img[@class='uhc-logo desktop-logo']");
    }
    @Test
    public void checkSearchText(){
        if(driver.getPageSource().contains("Search")){
            System.out.println("'Search' text exist before search box");
        }
        else{
            System.out.println("There is not Search text before  search box");
        }
    }
    @Test
    public void testSearchBox(){
        clickByXpath("//input[@id='q']");
    }
    @Test
    public void testSearchButton(){
        clickOnCss(".search-button");
    }
    @Test
    public void testProviderLink(){
        clickByXpath("//a[@href='https://www.uhcprovider.com/' and @class='at-element-click-tracking']");
    }
    @Test
    public void testBrokerLink(){
        clickByXpath("//a[@href='https://www.uhc.com/broker' and @class='at-element-click-tracking']");
    }
    @Test
    public void checkTextExist(){
        if(driver.getPageSource().contains("Already a member?")){
            System.out.println("'Already a member?' text exist upper right corner");
        }
        else {
            System.out.println("'Already a member?' is not exist in this webpage");
        }
    }
    @Test
    public void testClickOnSignIn(){
        clickOnCss("#loginmenubutton");
    }
    @Test
    public void testHomeButton(){
        clickOnCss(".top-menu1");
    }
    @Test
    public void testIndividualAndFamilies(){
        clickByXpath("//a[@title='Individuals & Families']");
    }
    @Test
    public void testEmployers(){
        clickOnCss(".top-menu3");
    }
    @Test
    public void testMedicare(){
        clickByXpath("//a[@href='/medicare' and @title='Medicare']");
    }
    @Test
    public void testFindAdoctor(){
        clickOnCss(".top-menu6");
    }
    public void checkFindaproviderText(){
        if(driver.getPageSource().contains("Find a provider")){
            System.out.println("'Find a provider'text exist");
        }
        else {
            System.out.println("'Find a provider' text is not existed in this page");
        }
    }
}
