package GoldPages;

import net.serenitybdd.core.pages.PageObject;

public class DiallerPage extends PageObject {
    public void navigateToDiallerPage() {

        $("//input[@title='dialler panel']").click();

    }
}
