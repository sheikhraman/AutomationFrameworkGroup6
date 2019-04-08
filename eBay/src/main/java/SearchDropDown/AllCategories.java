package SearchDropDown;

import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AllCategories extends CommonAPI {
    public AllCategories() {
        PageFactory.initElements (driver, this);
    }
    public void AllCatPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Honey");
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("0");
        driver.findElement (By.id ("gh-btn")).click ();
    }
}
