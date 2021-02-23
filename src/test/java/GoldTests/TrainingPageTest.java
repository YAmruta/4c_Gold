package GoldTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import Steps.StaffPageSteps;
import Steps.LoginPageSteps;
import Steps.HomePageSteps;
import Steps.ClientJourneySteps;
import Steps.TrainingPageSteps;

@RunWith(SerenityRunner.class)
public class TrainingPageTest extends BaseTest {

    @Steps
    LoginPageSteps loginPageSteps;
    @Steps
    HomePageSteps homePageSteps;
    @Steps
    ClientJourneySteps clientJourneySteps;
    @Steps
    StaffPageSteps staffPageSteps;
    @Steps
    TrainingPageSteps trainingPageSteps;

    @Before
    public void setup() {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
        loginPageSteps.loggedInAs();
        homePageSteps.navigateToHomePanel();
    }
    @Test
    public void TrainingPageTest(){
        trainingPageSteps.navigateToTrainingPageStep();
    }
}