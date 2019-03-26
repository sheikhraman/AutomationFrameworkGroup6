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
//  @Test
//    public void testProviderLink(){
//      AllLinkInHomePage homePage = PageFactory.initElements(driver,AllLinkInHomePage.class);
//        homePage.homePageProviderLink().click();
//        driver.navigate().back();
//    }
  @Test(priority = 1)
  public void testHomePageLanguageLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageLanguageLink().click();
    driver.navigate().back();
  }

  @Test(priority = 2)
  public void testHomePageSignInLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageSignInlink().click();
    driver.navigate().back();

  }
  @Test(priority = 3)
  public void testhomePageHomeButton() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageHomeLink().click();
    driver.navigate().back();

  }
  @Test(priority = 4)
  public void testhomePageIndividualAndFamilyLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageIndividualAndFamilyLink().click();
    driver.navigate().back();
  }
  @Test(priority = 5)
  public void testhomehomePageEmployerLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageEmployerLink().click();
    driver.navigate().back();
  }
  @Test(priority = 6)
  public void testhomehomePageMedicareLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageMedicareLink().click();
    driver.navigate().back();
  }
  @Test(priority = 7)
  public void testHomePageFindDoctorsLink() {
    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
    homePage.homePageFindDoctorsLink().click();
    driver.navigate().back();
  }
//  public void testhomePageSearchProviderLink() {
//    AllLinkInHomePage homePage = PageFactory.initElements(driver, AllLinkInHomePage.class);
//    homePage.homePageSearchProviderLink().click();
//    driver.navigate().back();
//  }
}