package Steps;

import GoldPages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }
    @Step
    public void loginAsUser(){
        loginPage.doLogin();
    }

    @Step
    public void logout(){
        loginPage.logout();
    }
    @Step
    public void loggedInAs(){
        Assert.assertTrue(loginPage.checkUserLoggedInAs().equals("Amruta Yembuluru"));
    }

}
