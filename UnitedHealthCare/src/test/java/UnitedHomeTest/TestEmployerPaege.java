package UnitedHomeTest;

import Reportint.TestsLoggers;
import UnitedHome.EmployerPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEmployerPaege extends EmployerPage {
    EmployerPage employerPage;
    @BeforeMethod
    public void initElements() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage = PageFactory.initElements(driver, EmployerPage.class);
        //setUrl("https://www.uhc.com/employer");
    }
    @Test
    public void testEmployers() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkEmployers();
    }
    @Test
    public void testgroupBenefitPlan() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //driver.navigate().to("https://www.uhc.com/employer");
        employerPage.checkgroupBenefitPlan();
    }
    @Test
    public void testgroupHealthInsurance() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkgroupHealthInsurance();
    }
    @Test
    public void testsmallBusiness() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checksmallBusiness();
    }
    @Test
    public void testmedicalInsurance() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkmedicalInsurance();
    }
    @Test
    public void testunitedHealthCare() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkunitedHealthCare();
    }
    @Test
    public void testprogramAndTools() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkprogramsAndTools();
    }
    @Test
    public void testlargeBusiness() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checklargeBusiness();
    }
    @Test
    public void testnationalAccount() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checknationalAccount();
    }
    @Test
    public void testpublicSector() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkpublicSector();
    }
    @Test
    public void testgroupLeader() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkgroupLeader();
    }
    @Test
    public void testspecialtyBenefits() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkspecialtyBenefits();
    }
    @Test
    public void testotherCoverage() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkotherCoverage();
    }
    @Test
    public void testpharMacy() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkpharMacy();
    }
    @Test
    public void testnewsReport() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checknewsReport();
    }
    @Test
    public void testgetAQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkgetAQuote();
    }
    @Test
    public void testrequestQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkrequestQuote();
    }
    @Test
    public void testmedicalQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkmedicalQuote();
    }
    @Test
    public void testdentalQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkdentalQuote();
    }
    @Test
    public void testvisionQuote() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkvisionQuote();
    }
    @Test
    public void testretireeHealthCare() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkretireeHealthCare();
    }
    @Test
    public void testdisabilityShortandLong() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkdisabilityShortandLong();
    }
    @Test
    public void testcriticalIllnessPlan() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkcriticalIllnessPlan();
    }
    @Test
    public void testcommunicationResource() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkcommunicationResource();
    }
    @Test
    public void testgettingStartedToolkit() {
        TestsLoggers.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        employerPage.checkgettingStartedToolkit();
    }
}
