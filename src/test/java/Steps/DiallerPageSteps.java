package Steps;

import GoldPages.DataPage;
import GoldPages.DiallerPage;
import net.thucydides.core.annotations.Step;

public class DiallerPageSteps {
    private DiallerPage diallerPage;


    @Step
    public void navigateToDiallerPageStep(){
        diallerPage.navigateToDiallerPage();
    }

}



