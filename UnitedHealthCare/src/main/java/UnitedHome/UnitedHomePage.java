package UnitedHome;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class UnitedHomePage extends CommonAPI {
    public void titleCheck(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Health Insurance Plans for Individuals & Families, Employers, Medicare | UnitedHealthcare ");
    }
    public void unitedHealthCareLogo(){
        driver.findElement(By.className("uhc-logo desktop-logo")).click();
    }
    public void checkTextBeforeSearchBox(){
        //if(driver.findElement())
    }
}
