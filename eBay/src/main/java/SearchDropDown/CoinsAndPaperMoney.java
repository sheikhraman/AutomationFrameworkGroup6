package SearchDropDown;

import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class CoinsAndPaperMoney extends CommonAPI {
    public CoinsAndPaperMoney() {
        PageFactory.initElements (driver, this);
    }
    public void CoinsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("world coins");
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11116");
        driver.findElement (By.id ("gh-btn")).click ();
    }
}
