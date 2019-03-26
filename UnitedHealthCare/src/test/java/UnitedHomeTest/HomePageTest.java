package UnitedHomeTest;

import UnitedHome.AllLinkInHomePage;
import UnitedHome.HomePage;
import UnitedHome.UnitedHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends AllLinkInHomePage {
//  @Test
//  public void cliclOnHomePageLogo(){
//      HomePage homePage = PageFactory.initElements(driver,HomePage.class);
//      homePage.homePageMainLogo();
//  }
  @Test
    public void testProviderLink(){
      AllLinkInHomePage homePage = PageFactory.initElements(driver,AllLinkInHomePage.class);
        homePage.homePageProviderLink().click();
        driver.navigate().back();
    }
    @Test
    public void testHomePageLanguageLink(){
      AllLinkInHomePage homePage =PageFactory.initElements(driver,AllLinkInHomePage.class);
      homePage.homePageLanguageLink().click();
      driver.navigate().back();
    }

}
