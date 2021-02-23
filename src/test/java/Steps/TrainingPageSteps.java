package Steps;

import GoldPages.HomePage;
import GoldPages.StaffPage;
import GoldPages.TrainingPage;
import net.thucydides.core.annotations.Step;

public class TrainingPageSteps {

    private TrainingPage trainingPage;


    @Step
    public void navigateToTrainingPageStep(){
        trainingPage.navigateToTrainingPage();
    }

}