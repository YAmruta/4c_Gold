package GoldPages;

import net.serenitybdd.core.pages.PageObject;

public class StaffPage extends PageObject {

    public void navigateToStaffPage() {

        $("//input[@title='staff panel']").click();

    }
}