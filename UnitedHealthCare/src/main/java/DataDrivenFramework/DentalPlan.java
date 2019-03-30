package DataDrivenFramework;

import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DentalPlan extends CommonAPI {
    public DentalPlan() {
        PageFactory.initElements(driver, this);
    }
    //@FindBy(xpath = "//a[@href='https://www.uhone.com/shop/#/census?LeadSourceName=UHC-Website-Dental']")
    @FindBy(how = How.XPATH,using ="//a[@href='https://www.uhone.com/shop/#/census?LeadSourceName=UHC-Website-Dental']" )
    public static WebElement viewDentalPlan;
    @FindBy(xpath = "//div[@class='input-group']//input[@id='zipCode']")
    WebElement enterZipCode;
    //@FindBy(how = How.XPATH,using = "//div[@class='input-group']//input[@id='zipCode']")
    public void viewLink(){
        TestsLoggers.log(getClass().getSimpleName()+";"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewDentalPlan.click();
        //driver.findElement(By.xpath("//a[@href='https://www.uhone.com/shop/#/census?LeadSourceName=UHC-Website-Dental']")).click();
    }
    public void enterZipCodes(){
        driver.findElement(By.xpath("//div[@class='input-group']//input[@id='zipCode']")).sendKeys("11372");
    }
}
