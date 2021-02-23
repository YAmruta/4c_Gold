package GoldTests;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class BaseTest {

    @Managed(uniqueSession = true , clearCookies=BeforeEachTest)
      WebDriver browser;


}
