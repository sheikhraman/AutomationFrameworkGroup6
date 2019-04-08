package UnitedHome;
import Reportint.TestsLoggers;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployerPage extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//li[@class='employers ']//a[contains(text(),'Employers') and @class='top-menu3']")
    public static WebElement clickOnToEmployer;
    @FindBy(how = How.XPATH, using = "//a[@href='/employer/health-plans']//span[contains(text(),'Group Benefits Plan Search') and @class='child-list-item-link-text' and @xpath='1']")
    public static WebElement groupBenefitPlan;
    @FindBy(how = How.LINK_TEXT, using = "Group Health Insurance Basics")
    public static WebElement groupHealthInsurance;
    @FindBy(how = How.LINK_TEXT, using = "Small Business")
    public static WebElement smallBusiness;
    @FindBy(how = How.XPATH, using = "//div[@class='uhc-wrapper']//ul[@class='child-list']//li[4]//a[1]")
    public static WebElement medicalInsurance;
    @FindBy(how = How.LINK_TEXT, using = "Why UnitedHealthcare")
    public static WebElement unitedHealthCare;
    @FindBy(how = How.LINK_TEXT, using = "Programs and Tools")
    public static WebElement programsAndTools;
    @FindBy(how = How.LINK_TEXT, using = "Large Business")
    public static WebElement largeBusiness;
    @FindBy(how = How.LINK_TEXT, using = "National Accounts")
    public static WebElement nationalAccount;
    @FindBy(how = How.LINK_TEXT, using = "Public Sector")
    public static WebElement publicSector;
    @FindBy(how = How.LINK_TEXT, using = "Group Retiree Solutions from Market Leader")
    public static WebElement groupLeader;
    @FindBy(how = How.LINK_TEXT, using = "Specialty Benefits")
    public static WebElement specialtyBenefits;
    @FindBy(how = How.LINK_TEXT, using = "Other Coverage ")
    public static WebElement otherCoverage;
    @FindBy(how = How.LINK_TEXT, using = "Pharmacy")
    public static WebElement pharMacy;
    @FindBy(how = How.LINK_TEXT, using = "News")
    public static WebElement newsReport;
    @FindBy(how = How.XPATH, using = "//span[@class='button-primary-common button-digital-blue span-focus']")
    public static WebElement getAQuote;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Request a quote for a different state.')]")
    public static WebElement requestQuote;
    @FindBy (how = How.LINK_TEXT, using = "Request a quote")
    public static WebElement medicalQuote;
    @FindBy(how = How.XPATH, using = "//div[@class='32 parsys']//span[@class='arrow-link'][contains(text(),'Request a quote')]")
    public static WebElement dentalQuote;
    @FindBy(how = How.XPATH, using = "//div[@class='33 parsys']//span[@class='arrow-link'][contains(text(),'Request a quote')]")
    public static WebElement visionQuote;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Learn More')]")
    public static WebElement retireeHealthCare;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Disability (Short and Long-Term)')]")
    public static WebElement disabilityShortandLong;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Critical Illness Protection Plan')]")
    public static WebElement criticalIllnessPlan;
    @FindBy(how = How.LINK_TEXT, using = "Communication Resource")
    public static WebElement communicationResource;
    @FindBy(how = How.LINK_TEXT, using = "Getting Started Toolkit")
    public static WebElement gettingStartedToolkit;
    public void checkEmployers() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnToEmployer.click();
    }
    public void checkgroupBenefitPlan() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        groupBenefitPlan.click();
    }
    public void checkgroupHealthInsurance() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        groupHealthInsurance.click();
    }
    public void checksmallBusiness() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        smallBusiness.click();
    }
    public void checkmedicalInsurance() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        medicalInsurance.click();
    }
    public void checkunitedHealthCare() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        unitedHealthCare.click();
    }
    public void checkprogramsAndTools() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        programsAndTools.click();
    }
    public void checklargeBusiness() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        largeBusiness.click();
    }
    public void checknationalAccount() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nationalAccount.click();
    }
    public void checkpublicSector() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        publicSector.click();
    }
    public void checkgroupLeader() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        groupLeader.click();
    }
    public void checkspecialtyBenefits() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        specialtyBenefits.click();
    }
    public void checkotherCoverage() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        otherCoverage.click();
    }
    public void checkpharMacy() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        pharMacy.click();
    }
    public void checknewsReport() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        newsReport.click();
    }
    public void checkgetAQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getAQuote.click();
    }
    public void checkrequestQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        requestQuote.click();
    }
    public void checkmedicalQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        medicalQuote.click();
    }
    public void checkdentalQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dentalQuote.click();
    }
    public void checkvisionQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        visionQuote.click();
    }
    public void checkretireeHealthCare() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        retireeHealthCare.click();
    }
    public void checkdisabilityShortandLong() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        disabilityShortandLong.click();
    }
    public void checkcriticalIllnessPlan() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        criticalIllnessPlan.click();
    }
    public void checkcommunicationResource() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        communicationResource.click();
    }
    public void checkgettingStartedToolkit() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        gettingStartedToolkit.click();

    }

}
