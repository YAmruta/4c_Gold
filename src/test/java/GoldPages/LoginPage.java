package GoldPages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;



public class LoginPage extends PageObject {

    public void doLogin() {

        $("[name='email_address_login']").sendKeys("amruta.yembuluru@usaycompare.com");
        $("//button[. = 'submit']").click();
        $("[name='username']").sendKeys("usay");
        $("[name='password']").sendKeys("usay");
        $("//button[. = 'Sign In']").click();
       /* start of the day object */ //$("//td/img").click();
       // $("//td[2]//input[2]").click();
    }
    public void logout(){
        $("//span/span/a/img").click();

    }
      public String checkUserLoggedInAs(){
       String text = $("//b[. = 'Amruta Yembuluru']").getText();
       System.out.println(text);
       return text;
    }


}
