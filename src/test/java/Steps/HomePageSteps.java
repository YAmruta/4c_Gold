package Steps;

import GoldPages.LoginPage;
import GoldPages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class HomePageSteps {

    private HomePage homePage;

    @Step
    public void isOnLoginPage() {
        homePage.open();
    }
    @Step
    public void navigateToHomePanel(){
        homePage.inHomePage();
    }



}
