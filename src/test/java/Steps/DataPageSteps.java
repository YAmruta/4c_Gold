package Steps;

import GoldPages.*;
import net.thucydides.core.annotations.Step;

import GoldPages.TrainingPage;
import net.thucydides.core.annotations.Step;

    public class DataPageSteps {

        private DataPage dataPage;


        @Step
        public void navigateToDataPageStep(){
            dataPage.navigateToDataPage();
        }

    }

