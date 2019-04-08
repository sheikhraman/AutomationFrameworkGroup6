package SearchDropDown;
import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Collectibles extends CommonAPI {
    public Collectibles() {
        PageFactory.initElements (driver, this);
    }
    public void CollectiblesPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("star wars");
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("1");
        driver.findElement (By.id ("gh-btn")).click ();
    }
}
