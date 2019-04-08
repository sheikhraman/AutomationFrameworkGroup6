package DataDrivenFramework;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class DentalPlan extends CommonAPI {
    public DentalPlan() {
        PageFactory.initElements(driver, this);
    }

}
