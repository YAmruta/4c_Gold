package GoldPages;

import net.serenitybdd.core.pages.PageObject;

public class TrainingPage extends PageObject {
    public void navigateToTrainingPage() {

        $("//input[@title='training panel']").click();

    }
}
