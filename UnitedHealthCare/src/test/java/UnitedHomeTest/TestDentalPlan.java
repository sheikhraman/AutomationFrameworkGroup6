package UnitedHomeTest;

import DataDrivenFramework.DentalPlan;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestDentalPlan extends DentalPlan {
    @Test
    public void testViewDentalPlan(){
        DentalPlan dplan= PageFactory.initElements(driver,DentalPlan.class);
        dplan.viewLink();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.uhone.com/shop/#/census?LeadSourceName=UHC-Website-Dental");
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        enterZipCodes();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
}
