import SearchPage.SearchHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearchHomePage extends SearchHomePage {
    @Test(priority = 1)
    public void ebayLogo() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.homePageLogo();
    }

    @Test(priority = 2)
    public void ebaySignInLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.signInLink();
    }

    @Test(priority = 3)
    public void ebayRegisterLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.registerLink();
    }

    @Test(priority = 4)
    public void ebayDailyDealsLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.dailyDealsLink();
    }

    @Test(priority = 5)
    public void ebayGiftCardLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.giftCardLink();
    }

    @Test(priority = 6)
    public void ebayHelpAndContractLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.helpAndContractLink();
    }

    @Test(priority = 7)
    public void ebaySellLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.sellLink();
    }

    @Test(priority = 8)
    public void ebayOrderLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.orderLink();
    }

    @Test(priority = 9)
    public void ebayMyLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.myEbayLink();
    }

    @Test(priority = 10)
    public void ebayShopByCatagoryLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.shopByCatagoryLink();
    }

    @Test(priority = 11)
    public void ebaySearchBox() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.searchBoxs();
    }

    @Test(priority = 12)
    public void ebayallCatagoryLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.allCatagorytLink();
    }

    @Test(priority = 13)
    public void ebayAdvanceSearchLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.advanceSearchLink();
    }

    @Test(priority = 14)
    public void ebayHomeLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.homeLink();
    }

    @Test(priority = 15)
    public void ebaySavedLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.savedLink();
    }

    @Test(priority = 16)
    public void ebayMotorLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.motorLink();
    }

    @Test(priority = 17)
    public void ebayFashionLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.fashionLink();
    }

    @Test(priority = 18)
    public void ebayElectronicsLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.electronicsLink();
    }

    @Test(priority = 19)
    public void ebayCollectionAndLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.collectionAndAritsLink();
    }

    @Test(priority = 20)
    public void ebaySportingGoodLinkLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.sportingGoodLink();
    }

    @Test(priority = 21)
    public void ebayToyLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.toyLink();
    }

    @Test(priority = 22)
    public void ebayBusinessAndIndustrialLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.businessAndIndustrialLink();
    }

    @Test(priority = 23)
    public void ebayMusicLink() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.musicLink();
    }

    @Test(priority = 24)
    public void ebayRegistration() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.registrationLink();
    }

    @Test(priority = 25)
    public void moneyBack() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.moneybackGuranttLink();
    }

    @Test(priority = 26)
    public void buideAndBuy() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.bidingAndBuyingLink();
    }

    @Test(priority = 27)
    public void storeLinks() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.searchStoreLink();
    }

    @Test(priority = 28)
    public void ebaySeles() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.sellsLink();
    }

    @Test(priority = 29)
    public void ebayStartSelling() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.startSellinglink();
    }

    @Test(priority = 30)
    public void ebayMobileApp() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.mobIleAppLink();
    }

    @Test(priority = 31)
    public void ebayDeveloper() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.developerLink();
    }

    @Test(priority = 32)
    public void ebaySecurity() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.securityLink();
    }

    @Test(priority = 33)
    public void ebayRealTime() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebayRealTimeLink();
    }

    @Test(priority = 34)
    public void siteMaps() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebySiteMap();
    }

    @Test(priority = 35)
    public void classified() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebayClassideLink();
    }

    @Test(priority = 36)
    public void StubHub() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebayStubhubLink();
    }

    @Test(priority = 37)
    public void ebayCompanys() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebasyCompanyLink();
    }

    @Test(priority = 38)
    public void CompanyInfo() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebayCompanyInfo();
    }

    @Test(priority = 39)
    public void newsEbay() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebayNews();
    }

    @Test(priority = 40)
    public void investorsEbay() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebayInverstoLink();
    }

    @Test(priority = 41)
    public void CarrierEbay() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebayCarrer();
    }

    @Test(priority = 42)
    public void DividonEbay() {
        SearchHomePage ehomepage = PageFactory.initElements(driver, SearchHomePage.class);
        ehomepage.ebayDivisonLink();
    }
}