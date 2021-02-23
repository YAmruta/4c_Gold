package Steps;

import net.thucydides.core.annotations.Step;
import GoldPages.ClientJourneyPage;

public class ClientJourneySteps {
    private ClientJourneyPage clientJourneyPage;

    @Step
    public void clickPmiBt(){
        clientJourneyPage.clickPmi();
    }

    @Step
    public String checkContactPage(){
        return clientJourneyPage.contactPageExist();
    }

    @Step
    public void ContactPageStep(){
        clientJourneyPage.contactPage();
    }

    @Step
    public void AlertPageStep(){
        clientJourneyPage.alertPage();
    }

    @Step
    public void someoneAnsweredStep(){
        clientJourneyPage.someoneAnswered();
    }

    @Step
    public void TheyMadeRequestStep(){
        clientJourneyPage.theyMadeRequest();
    }
    @Step
    public void okayToProceedStep(){
        clientJourneyPage.firstTimeBuyer();
    }
    @Step
    public void saveAndProgressStep(){
        clientJourneyPage.saveAndProgressBtn();
    }
    @Step
    public void searchPostcodeStep(){
         clientJourneyPage.findAddress();
    }
    @Step
    public void saveAndProgPostalAddress(){
        clientJourneyPage.saveAndProgressPeoplePage();
    }
    @Step
    public void peopleToCoverStep(){
        clientJourneyPage.peopleToCoverPage();

    }
    @Step
    public void medicalInsuranceStep(){
        clientJourneyPage.typeOfMedicalInsurancePage();
    }
    @Step
    public void explainedProductStep(){
        clientJourneyPage.productOverviewPage();
    }
    @Step
    public void confirmBudgetAndStartDateStep(){
        clientJourneyPage.budgetAndStartDatePage();
    }
    @Step
    public void medicalHistoryStep(){
        clientJourneyPage.medicalHistoryPage();
    }
    @Step
    public void underwritingStep(){
        clientJourneyPage.underwritingPage();
    }
    @Step
    public void hospitalStep(){
        clientJourneyPage.hospitalsPage();
    }
    @Step
    public void verifyPreCompareStatement(){
        clientJourneyPage.verifyPreCompareStatement();
    }
    @Step
    public void quotationStep(){
        clientJourneyPage.quotationPanel();
    }

    @Step
    public void SummaryOfEnrolmentSteps(){
        clientJourneyPage.summaryOfEnrolment();
    }
    @Step
    public void toViewDocumentation(){
        clientJourneyPage.documentation();
    }
    @Step
    public void clickOnHappyWithSummary() {
        clientJourneyPage.happyWithSummary();
    }
    @Step
    public void toKeyPaymentDetails(){
     clientJourneyPage.paymentValidation();
    }
    @Step
    public void completeOnboardingStep(){
        clientJourneyPage.completePage();
    }
    @Step
    public void optOutSelectStep(){
        clientJourneyPage.optOutPage();
    }
    @Step
    public void printingPageView(){
        clientJourneyPage.printing();
    }
}
