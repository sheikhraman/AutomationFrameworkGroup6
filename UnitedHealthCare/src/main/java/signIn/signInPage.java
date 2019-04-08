package signIn;

import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signInPage extends CommonAPI {
    @FindBy(how= How.ID,using ="hsid-registerNow")
    public static WebElement ResigterNow;
    @FindBy(how = How.XPATH,using ="//input[@id='piFirstName']")
    public static WebElement firstName;
    @FindBy(how = How.CLASS_NAME,using ="form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required")
    public static WebElement lastName;
    @FindBy(how = How.CLASS_NAME,using = "form-control dob ng-scope ng-empty ng-invalid ng-invalid-required ng-valid-mask ng-dirty ng-valid-parse ng-touched")
    public static WebElement dob;
    @FindBy(how = How.XPATH,using = "//input[@id='registerWithMember' and @value='N']")
    public static WebElement noId;
    @FindBy(how = How.CLASS_NAME,using = "button button--primary ng-scope")
    public static WebElement contButton;
public void checkRegisterNow(){
    TestsLoggers.log((getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName())));
    ResigterNow.click();
  }
  public void checkFirstName(){
    TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    firstName.click();
  }
    public void checkLastName(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lastName.click();
    }
    public void checkDob(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dob.click();
    }
    public void checkNoId(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noId.click();
    }
    public void checkContinue(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        contButton.click();
    }
    public void clickContinue(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ResigterNow.click();
        firstName.sendKeys("John");
        lastName.sendKeys("Dow");
        dob.sendKeys("10/20/21");
        noId.click();
        contButton.click();
    }


}