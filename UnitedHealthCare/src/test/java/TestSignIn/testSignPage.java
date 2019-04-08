package TestSignIn;

import Reportint.TestsLoggers;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signIn.signInPage;

public class testSignPage extends signInPage {
    public String signIn;
    signInPage sign;
    @BeforeMethod
    public void initElement(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sign= PageFactory.initElements(driver,signInPage.class);
       // setUrl("https://www.myuhc.com/member/prewelcome.do?currentLanguageFromPreCheck=en");
    }
    @Test
    public void testRegisterNowButton(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sign.checkRegisterNow();
    }
    @Test
    public void testFristNameTextField(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sign.checkFirstName();
    }
    @Test
    public void testLastNameTextField(){
        //TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sign.checkLastName();
    }
    @Test
    public void testDobTextField(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sign.checkDob();
    }
    @Test
    public void testIDcheckBox(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sign.checkNoId();
    }
    @Test
    public void testCheckContinueButton(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sign.checkContinue();
    }
    @Test
    public void testClickOnContinue(){
        TestsLoggers.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sign.clickContinue();
    }
}
