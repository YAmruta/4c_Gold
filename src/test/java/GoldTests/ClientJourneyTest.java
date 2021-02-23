package GoldTests;
import Steps.LoginPageSteps;
import Steps.HomePageSteps;
import Steps.ClientJourneySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



@RunWith(SerenityRunner.class)
public class ClientJourneyTest extends BaseTest {

        @Steps
        LoginPageSteps loginPageSteps;
        @Steps
        HomePageSteps homePageSteps;

        @Steps
        ClientJourneySteps clientJourneySteps;

        @Before
        public void setup(){
            loginPageSteps.isOnLoginPage();
            loginPageSteps.loginAsUser();
            loginPageSteps.loggedInAs();
            homePageSteps.navigateToHomePanel();

        }
        @Test
        public void ClientJourneyTest(){
            clientJourneySteps.clickPmiBt();
           // clientJourneySteps.checkContactPage();
            clientJourneySteps.ContactPageStep();
            clientJourneySteps.AlertPageStep();
            clientJourneySteps.someoneAnsweredStep();
            clientJourneySteps.TheyMadeRequestStep();
            clientJourneySteps.okayToProceedStep();
            clientJourneySteps.saveAndProgressStep();
            clientJourneySteps.searchPostcodeStep();
            clientJourneySteps.saveAndProgPostalAddress();
            clientJourneySteps.peopleToCoverStep();
            clientJourneySteps.medicalInsuranceStep();
            clientJourneySteps.explainedProductStep();
            clientJourneySteps.confirmBudgetAndStartDateStep();
            clientJourneySteps.medicalHistoryStep();
            clientJourneySteps.underwritingStep();
            clientJourneySteps.hospitalStep();
            clientJourneySteps.verifyPreCompareStatement();
            clientJourneySteps.quotationStep();
            clientJourneySteps.SummaryOfEnrolmentSteps();
            clientJourneySteps.toViewDocumentation();
            clientJourneySteps.clickOnHappyWithSummary();
            clientJourneySteps.toKeyPaymentDetails();
            clientJourneySteps.completeOnboardingStep();
            clientJourneySteps.optOutSelectStep();
            clientJourneySteps.printingPageView();
        }
    }