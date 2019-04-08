package SearchPage;
import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class Developer extends CommonAPI {
    public Developer() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Developers")
    WebElement develop;
    @FindBy(css = "#main-menu > li:nth-child(2) > a")
    WebElement register;
    @FindBy(id = "w4-w1-registration-username")
    WebElement username;
    @FindBy(id = "w4-w1-w1-password")
    WebElement password;
    @FindBy(id = "w4-w1-w1-8-64-characters")
    WebElement radio8;
    @FindBy(id = "w4-w1-registration-email")
    WebElement email;
    @FindBy(id = "w4-w1-registration-reenter-email")
    WebElement reemail;
    @FindBy(id = "w4-w1-w2-phone")
    WebElement phone;
    @FindBy(id = "w4-w1-checkbox-user-agreement")
    WebElement checkbox;
    @FindBy(id = "w4-w1-join-button")
    WebElement join;
    public WebElement Develop() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return develop;
    }
    public WebElement Regis() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return register;
    }
    public WebElement Usr() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return username;
    }
    public WebElement Pass() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return password;
    }
    public WebElement Rdio1() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return radio8;
    }
    public WebElement EmailAd() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return email;
    }
    public WebElement ReEmailAd() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return reemail;
    }
    public WebElement Tel() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return phone;
    }
    public WebElement rdio2() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return checkbox;
    }
    public WebElement JoinBtn() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return join;
    }
    public void DeveloperPage() {
        Develop().click();
        driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
        Regis().click();
        Usr().sendKeys("sheikh718");
        Pass().sendKeys("123456abc");
        Rdio1().click();
        EmailAd().sendKeys("sheikhrh@gmail.com");
        ReEmailAd().sendKeys("sjehahek@gmail.com");
        Tel().sendKeys("718408klajl480");
        rdio2().click();
        JoinBtn().click();
        //String title = driver.getTitle();

        //Assert.assertEquals(title, "eBay Developers Program Registration | eBay");
    }
    @Test
    public void TestDeveloper() {
        Developer developer = PageFactory.initElements (driver, Developer.class);
        developer.DeveloperPage ();
    }
}