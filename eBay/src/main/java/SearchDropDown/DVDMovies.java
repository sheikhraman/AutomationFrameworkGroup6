package SearchDropDown;
import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class DVDMovies extends CommonAPI {
    public DVDMovies() {
        PageFactory.initElements (driver, this);
    }
    public void DVDPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("Avatar");
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("11232");
        driver.findElement (By.id ("gh-btn")).click ();
    }
}
