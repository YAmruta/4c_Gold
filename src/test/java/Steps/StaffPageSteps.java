package Steps;

import GoldPages.HomePage;
import GoldPages.StaffPage;
import net.thucydides.core.annotations.Step;

public class StaffPageSteps {
    private StaffPage staffPage;


    @Step
    public void navigateToStaffPanelStep(){
        staffPage.navigateToStaffPage();
    }

}
