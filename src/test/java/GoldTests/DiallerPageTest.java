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
import Steps.DataPageSteps;
import Steps.DiallerPageSteps;


    @RunWith(SerenityRunner.class)
    public class DiallerPageTest extends BaseTest {

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
        @Steps
        DataPageSteps dataPageSteps;
        @Steps
        DiallerPageSteps diallerPageSteps;

        @Before
        public void setup() {
            loginPageSteps.isOnLoginPage();
            loginPageSteps.loginAsUser();
            loginPageSteps.loggedInAs();
            homePageSteps.navigateToHomePanel();
        }
        @Test
        public void DiallerPageTest(){
            diallerPageSteps.navigateToDiallerPageStep();
        }
    }

