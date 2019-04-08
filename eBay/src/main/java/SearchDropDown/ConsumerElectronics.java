package SearchDropDown;
import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class ConsumerElectronics extends CommonAPI {
    public ConsumerElectronics() {
        PageFactory.initElements (driver, this);
    }

    public void ElectronicsPage() {
        driver.findElement (By.id ("gh-ac")).sendKeys ("headphones");
        TestsLoggers.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select s = new Select (driver.findElement (By.id ("gh-cat")));
        s.selectByValue ("293");
        driver.findElement (By.id ("gh-btn")).click ();
    }
}
