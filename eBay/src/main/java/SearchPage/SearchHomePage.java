package SearchPage;

import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchHomePage extends CommonAPI {
    public SearchHomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#gh-logo")
    WebElement HomePage;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement SignIn;
    @FindBy(xpath = "//a[contains(text(),'register')]")
    WebElement Register;
    @FindBy(xpath = "//li[@class='gh-t gh-divider-l' and @id='gh-p-1']//a[@href='https://www.ebay.com/deals']")
    WebElement DailyDeals;
    @FindBy(xpath = "//li[@id='gh-p-4']//a[contains(text(),' Gift Cards')]")
    WebElement GiftCared;
    @FindBy(xpath = "//li[@id='gh-p-3']//a[contains(text(),' Help & Contact')]")
    WebElement HealpAndContact;
    @FindBy(xpath = "//li[@class='gh-eb-li gh-t-rt gh-divider']//a[@href='https://www.ebay.com/sl/sell' and contains(text(),'Sell')]")
    WebElement Sell;
    @FindBy(xpath = "//li[@id='gh-p-5']//a[@href='https://www.ebay.com/myb/PurchaseHistory' and contains(text(),' Orders')]")
    WebElement Orders;
    @FindBy(xpath = "//li[@class='gh-eb-li gh-dd rt']//a[@href='https://my.ebay.com/ws/eBayISAPI.dll?MyEbay&gbh=1' and contains(text(),' My eBay')]")
    WebElement MyEbay;
    @FindBy(id = "gh-shop-a")
    WebElement ShopByCatagory;
    @FindBy(xpath = "//input[@id='gh-ac' and @class='gh-tb ui-autocomplete-input ui-autocomplete-loading']")
    WebElement SearchBox;
    @FindBy(xpath = "//select[@id='gh-cat' and @class='gh-sb gh-sprRetina']")
    WebElement AllCatagory;
    @FindBy(xpath = "//a[contains(text(),'Advanced') and @title='Advanced Search']")
    WebElement AdvancedSearch;
    @FindBy(xpath = "//li[@class='hl-cat-nav__active']//span[contains(text(),'Home')]")
    WebElement Home;
    @FindBy(xpath = "//a[@href='https://www.ebay.com/feed' and contains(text(),'Saved')]")
    WebElement Saved;
    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Motors') and @href='https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334']")
    WebElement Motor;
    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Fashion') and @href='https://www.ebay.com/b/Fashion/bn_7000259856']")
    WebElement Fashion;
    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Electronics') and @href='https://www.ebay.com/b/Electronics/bn_7000259124']")
    WebElement Electronics;
    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Collectibles & Art') and @href='https://www.ebay.com/b/Collectibles-Art/bn_7000259855']")
    WebElement CollectionAndArt;
    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Sporting Goods') and @href='https://www.ebay.com/b/Sporting-Goods/888/bn_1865031']")
    WebElement SportingGoods;
    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Toy') and @href='https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497']")
    WebElement Toy;
    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Business & Industrial') and @href='https://www.ebay.com/b/Business-Industrial/12576/bn_1853744']")
    WebElement BusinessAndIndustrial;
    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Music') and @href='https://www.ebay.com/rpp/music']")
    WebElement Music;
    @FindBy(xpath = "//li[@class='gf-li']//h3[@class='gf-bttl']//a[contains(text(),'Buy') and @href='https://www.ebay.com/v/allcategories']")
    WebElement Buy;
    @FindBy(xpath = "//li[@class='gf-li']//a[contains(text(),'Registration')and @href='https://pages.ebay.com/help/account/registration.html']")
    WebElement Registration;
    @FindBy(xpath = "//a[@href='https://pages.ebay.com/ebay-money-back-guarantee/' and contains(text(),'eBay Money Back Guarantee')]")
    WebElement MoneyBackGurantee;
    @FindBy(xpath ="//a[@href='https://pages.ebay.com/help/buy/basics.html' and contains(text(),'Bidding & buying help')]")
    WebElement BiddingAndBuyingHelp;
    @FindBy(xpath = "//a[@href='https://pages.ebay.com/seller-center/run-your-store/why-get-an-ebay-store.html?utm_source=gf-stores&utm_medium=onsite' and contains(text(),'Stores')]")
    WebElement store;
    @FindBy(xpath = " //h3[@class='gf-bttl']//a[@href='https://www.ebay.com/sl/sell' and contains(text(),'Sell')]")
    WebElement sell;
    @FindBy(xpath = " //li[@class='gf-li']//a[@href='https://www.ebay.com/sl/sell' and contains(text(),'Start selling')]")
    WebElement startSelling;
    @FindBy(xpath = " //a[@href='https://pages.ebay.com/seller-center/get-started/selling-basics.html?utm_source=gf-learn-to-sell&utm_medium=onsite' and contains(text(),'How to sell')]")
    WebElement HowToSell;
    @FindBy(xpath = "//li[@class='gf-li'] //a[@href='https://partnernetwork.ebay.com/' and contains(text(),'Affiliates') and @_exsp='m571.l2921']")
    WebElement artificials;
    @FindBy(xpath = "//h3[@class='gf-bttl' and contains(text(),'Tools & apps')]")
    WebElement toolsAndApp;
    @FindBy(xpath = "//a[@href='https://anywhere.ebay.com/mobile/' and contains(text(),'Mobile apps')]")
    WebElement mobileApp;
    @FindBy(xpath = "//a[@href='https://developer.ebay.com' and contains(text(),'Developers')]")
    WebElement deVelopers;
    @FindBy(xpath = "//a[@href='https://pages.ebay.com/securitycenter/index.html' and contains(text(),'Security center')]")
    WebElement securityCenters;
    @FindBy(xpath = "//a[@href='http://ofr.ebay.com/ws/eBayISAPI.dll?EbayTime' and contains(text(),'eBay official time')]")
    WebElement ebayRealTime;
    @FindBy(xpath = "//a[@href='https://pages.ebay.com/sitemap.html' and contains(text(),'Site map')]")
    WebElement siteMap;
    @FindBy(xpath = "//a[@href='https://www.ebayclassifiedsgroup.com/' and contains(text(),'eBay Classifieds')]")
    WebElement ebayClassified;
    @FindBy(xpath = "//a[@href='https://www.stubhub.com/' and contains(text(),'StubHub')]")
    WebElement ebayStubHub;
    @FindBy(xpath = "//a[@href='https://www.ebayinc.com/our-company/our-other-businesses/' and contains(text(),'See all companies')]")
    WebElement ebayAllCompanies;
    @FindBy(xpath = "//a[@href='https://www.ebay.com/stories/']")
    WebElement ebayBlogs;
    @FindBy(xpath = "//a[@href='https://www.ebayinc.com/our-company/' and contains(text(),'Company info')]")
    WebElement companyinfo;
    @FindBy(xpath = "//a[@href='https://www.ebayinc.com/stories/news/' and contains(text(),'News')]")
    WebElement news;
    @FindBy(xpath = "//a[@href='https://investors.ebayinc.com' and contains(text(),'Investors')]")
    WebElement investor;
    @FindBy(xpath = "//a[@href='https://careers.ebayinc.com/' and contains(text(),'Careers')]")
    WebElement carrer;
    @FindBy(xpath = "//a[@href='https://www.ebayinc.com/our-company/diversity-inclusion/' and contains(text(),'Diversity & Inclusion')]")
    WebElement divisionAndInclusion;


    public WebElement homePage(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return HomePage;
    }
    public WebElement signIn(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SignIn;
    }
    public WebElement register(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Register;
    }
    public WebElement dailyDeals(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return DailyDeals;
    }
    public WebElement giftCard(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return GiftCared;
    } public WebElement helpAndContact(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return HealpAndContact;
    }
    public WebElement sell(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Sell;
    }
    public WebElement order(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Orders;
    }
    public WebElement myEbay(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return MyEbay;
    }
    public WebElement shopByCatagory(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ShopByCatagory ;
    }
    public WebElement searchBox(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SearchBox;
    }
    public WebElement allCatagory(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AllCatagory;
    }
    public WebElement advancedSearch(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdvancedSearch;
    }
    public WebElement home(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Home;
    }
    public WebElement saved(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Saved;
    }
    public WebElement motor(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Motor;
    }
    public WebElement fashion(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Fashion;
    }
    public WebElement electronics(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Electronics;
    }
    public WebElement collectionAndArt(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return CollectionAndArt;
    }
    public WebElement sportingGood(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SportingGoods;
    }
    public WebElement toy(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Toy;
    }
    public WebElement businessAndIndustrial(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return BusinessAndIndustrial;
    }
    public WebElement music(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Music;
    }
    public WebElement buy(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Buy;
    }
    public WebElement registration(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Registration;
    }
    public WebElement moneyBackGurantee(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return MoneyBackGurantee;
    }
    public WebElement helpBiddingAndBuying(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return BiddingAndBuyingHelp;
    }
    public WebElement searchStore(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return store;
    }
    public WebElement searcSell(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return sell;
    }
    public WebElement startSell(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return startSelling;
    }
    public WebElement howtoSell(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return HowToSell;
    }
    public WebElement artificialLink(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return artificials;
    }
    public WebElement toolsAndAppLink(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return toolsAndApp;
    }
    public WebElement mobilAppLink(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return mobileApp;
    }
    public WebElement developers(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return deVelopers;
    }
    public WebElement securityCenter(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return securityCenters;
    }
    public WebElement ebayRealtimeL(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ebayRealTime;
    }
    public WebElement siteMapl(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return siteMap;
    }
    public WebElement classifiedLink(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ebayClassified;
    }
    public WebElement stubHub(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ebayRealTime;
    }
    public WebElement allCompanies(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ebayAllCompanies;
    }
    public WebElement ebayInfo(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return companyinfo;
    }
    public WebElement newsLink(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return news;
    }
    public WebElement investorLink(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return investor;
    }
    public WebElement carrierLink(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return carrer;
    }
    public WebElement ebayDivison(){
        TestsLoggers.log(getClass().getSimpleName()+":"+CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return divisionAndInclusion;
    }



    public void homePageLogo(){
        //homePage().click();
        String title =driver.getTitle();
        Assert.assertEquals(title,"Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
    }
    public void signInLink(){ signIn().click(); }
    public void registerLink(){
        register().click();
    }
    public void dailyDealsLink(){
        dailyDeals().click();
    }
    public void giftCardLink(){
        giftCard().click();
    }
    public void helpAndContractLink(){
        helpAndContact().click();
    }
    public void sellLink(){
        sell().click();
    }
    public void orderLink(){
        order().click();
    }
    public void myEbayLink(){
        myEbay().click();
    }
    public void shopByCatagoryLink(){
        shopByCatagory().click();
    }
    public void searchBoxs(){
        searchBox().sendKeys("computer");
    }
    public void allCatagorytLink(){
        allCatagory().click();
    }
    public void advanceSearchLink(){
        advancedSearch().click();
    }
    public void homeLink(){
        home().click();
    }
    public void savedLink(){ saved().click(); }
    public void motorLink(){
        motor().click();
    }
    public void fashionLink(){
        fashion().click();
    }
    public void electronicsLink(){
        electronics().click();
    }
    public void collectionAndAritsLink(){
        collectionAndArt().click();
    }
    public void sportingGoodLink(){
        sportingGood().click();
    }
    public void toyLink(){
        toy().click();
    }
    public void businessAndIndustrialLink(){
        businessAndIndustrial().click();
    }
    public void musicLink(){
        music().click();
    }
    public void registrationLink(){registration().click();}
    public void moneybackGuranttLink(){moneyBackGurantee().click();}
    public void bidingAndBuyingLink(){helpBiddingAndBuying().click();}
    public void searchStoreLink(){searchStore().click();}
    public void sellsLink(){searcSell().click();}
    public void startSellinglink(){startSell().click();}
    public void hotwoSellLink(){howtoSell().click();}
    public void mobIleAppLink(){mobilAppLink().click();}
    public void developerLink(){developers().click();}
    public void securityLink(){securityCenter().click();}
    public void ebayRealTimeLink(){ebayRealtimeL().click();}
    public void ebySiteMap(){siteMapl().click();}
    public void ebayClassideLink(){classifiedLink().click();}
    public void ebayStubhubLink(){stubHub().click();}
    public void ebasyCompanyLink(){allCompanies().click();}
    public void ebayCompanyInfo(){ebayInfo().click();}
    public void ebayNews(){newsLink().click();}
    public void ebayInverstoLink(){investorLink().click();}
    public void ebayCarrer(){carrierLink().click();}
    public void ebayDivisonLink(){ebayDivison().click();}

}
