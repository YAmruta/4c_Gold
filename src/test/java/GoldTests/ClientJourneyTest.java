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
            clientJourneySteps.quotationAVIVA();
            clientJourneySteps.SummaryOfEnrolmentSteps();
            clientJourneySteps.toViewDocumentation();
            clientJourneySteps.clickOnHappyWithSummary();
            clientJourneySteps.toKeyPaymentDetails();
            clientJourneySteps.completeOnboardingStep();
            clientJourneySteps.optOutSelectStep();
            clientJourneySteps.printingPageView();
        }
    @Test
    public void ClientJourneyWPA(){
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
        clientJourneySteps.quotationWPA();
        clientJourneySteps.SummaryOfEnrolmentSteps();
        clientJourneySteps.toViewDocumentation();
        clientJourneySteps.clickOnHappyWithSummary();
        clientJourneySteps.toKeyPaymentDetails();
        clientJourneySteps.completeOnboardingStep();
        clientJourneySteps.optOutSelectStep();
        clientJourneySteps.printingPageView();
    }
    @Test
    public void ClientJourneyElite(){
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
        clientJourneySteps.quotationElite();
        clientJourneySteps.SummaryOfEnrolmentSteps();
        clientJourneySteps.toViewDocumentation();
        clientJourneySteps.clickOnHappyWithSummary();
        clientJourneySteps.toKeyPaymentDetails();
        clientJourneySteps.completeOnboardingStep();
        clientJourneySteps.optOutSelectStep();
        clientJourneySteps.printingPageView();
    }
    @Test
    public void ClientJourneyBupaByYou(){
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
        clientJourneySteps.quotationBupaByYou();
        clientJourneySteps.SummaryOfEnrolmentSteps();
        clientJourneySteps.toViewDocumentation();
        clientJourneySteps.clickOnHappyWithSummary();
        clientJourneySteps.toKeyPaymentDetails();
        clientJourneySteps.completeOnboardingStep();
        clientJourneySteps.optOutSelectStep();
        clientJourneySteps.printingPageView();
    }

    @Test
    public void ClientJourneyVitalityHealth(){
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
        clientJourneySteps.quotationVitalityHealth();
        clientJourneySteps.SummaryOfEnrolmentSteps();
        clientJourneySteps.toViewDocumentation();
        clientJourneySteps.clickOnHappyWithSummary();
        clientJourneySteps.toKeyPaymentDetails();
        clientJourneySteps.completeOnboardingStep();
        clientJourneySteps.optOutSelectStep();
        clientJourneySteps.printingPageView();
    }
    @Test
    public void ClientJourneyAXA(){
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
        clientJourneySteps.quotationAXA();
        clientJourneySteps.SummaryOfEnrolmentSteps();
        clientJourneySteps.toViewDocumentation();
        clientJourneySteps.clickOnHappyWithSummary();
        clientJourneySteps.toKeyPaymentDetails();
        clientJourneySteps.completeOnboardingStep();
        clientJourneySteps.optOutSelectStep();
        clientJourneySteps.printingPageView();
    }
    @Test
    public void ClientJourneyHOL(){
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
        clientJourneySteps.quotationHOL();
        clientJourneySteps.SummaryOfEnrolmentSteps();
        clientJourneySteps.toViewDocumentation();
        clientJourneySteps.clickOnHappyWithSummary();
        clientJourneySteps.toKeyPaymentDetails();
        clientJourneySteps.completeOnboardingStep();
        clientJourneySteps.optOutSelectStep();
        clientJourneySteps.printingPageView();
    }
    @Test
    public void ClientJourneyBupaFund(){
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
        clientJourneySteps.quotationBupaFund();
        clientJourneySteps.SummaryOfEnrolmentSteps();
        clientJourneySteps.toViewDocumentation();
        clientJourneySteps.clickOnHappyWithSummary();
        clientJourneySteps.toKeyPaymentDetails();
        clientJourneySteps.completeOnboardingStep();
        clientJourneySteps.optOutSelectStep();
        clientJourneySteps.printingPageView();
    }
    @Test
    public void ClientJourneyPHC(){
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
        clientJourneySteps.quotationPHC();
        clientJourneySteps.SummaryOfEnrolmentSteps();
        clientJourneySteps.toViewDocumentation();
        clientJourneySteps.clickOnHappyWithSummary();
        clientJourneySteps.toKeyPaymentDetails();
        clientJourneySteps.completeOnboardingStep();
        clientJourneySteps.optOutSelectStep();
        clientJourneySteps.printingPageView();
    }
    @Test
    public void ClientJourneyExeter(){
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
        clientJourneySteps.quotationExeter();
        clientJourneySteps.SummaryOfEnrolmentSteps();
        clientJourneySteps.toViewDocumentation();
        clientJourneySteps.clickOnHappyWithSummary();
        clientJourneySteps.toKeyPaymentDetails();
        clientJourneySteps.completeOnboardingStep();
        clientJourneySteps.optOutSelectStep();
        clientJourneySteps.printingPageView();
    }
    }