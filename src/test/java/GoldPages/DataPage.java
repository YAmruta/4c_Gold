package GoldPages;

import net.serenitybdd.core.pages.PageObject;

public class DataPage extends PageObject {
    public void navigateToDataPage() {

        $("//input[@title='data panel']").click();

    }
}
