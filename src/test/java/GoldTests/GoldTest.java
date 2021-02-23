package GoldTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import Steps.LoginPageSteps;
import Steps.HomePageSteps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class GoldTest extends BaseTest{

    @Steps
    LoginPageSteps loginPageSteps;
    @Steps
    HomePageSteps homePageSteps;

    @Test
    public void goldLoginTest(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
        loginPageSteps.logout();
    }

    @Test
    public void homePanel(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
        loginPageSteps.loggedInAs();
        homePageSteps.navigateToHomePanel();

    }

}
