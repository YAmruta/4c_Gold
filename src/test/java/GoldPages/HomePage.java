package GoldPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


public class HomePage extends PageObject {

    public void inHomePage() {

        $("//td[2]//input[2]").click();
    }
}

