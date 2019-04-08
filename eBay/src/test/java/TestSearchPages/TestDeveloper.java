package TestSearchPages;

import SearchPage.Developer;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDeveloper extends Developer {

    @Test

    public void TestDeveloper() {

        Developer developer = PageFactory.initElements (driver, Developer.class);

        developer.DeveloperPage ();



    }
}
