package GoldPages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import GoldPages.UtilClass;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClientJourneyPage extends PageObject {

    WebDriver driver;


    public void clickPmi() {
        $("//button[. = 'PMI']").click();
        $("//select[@id='source']").selectByVisibleText("Test Source (PMI)");
        $("//button[normalize-space()='save']").click();
    }

    public String contactPageExist() {
        String contact = $("//div[. = '  contact']").getTextContent();
        System.out.println(contact);
        return contact;

    }

    public void contactPage() {
        shouldBeVisible(By.xpath("//table[3]//b[. = 'Individual Health Insurance']"));
        shouldBeVisible(By.xpath("//table[10]//b[. = 'Callback']"));
   /*     String ContactScript= $("//b[. = ' speaking prompt']").getTextContent();
        System.out.println(ContactScript);*/
        $("[name='alias']").sendKeys(UtilClass.generateRandomString(6));
        $("[name='phone_number']").sendKeys(UtilClass.generateRandomNumber(10));
        $("[name='phone_number_work']").sendKeys(UtilClass.generateRandomNumber(10));
        $("[name='phone_number_mobile']").sendKeys(UtilClass.generateRandomNumber(10));
        $("[name='email_address']").sendKeys(UtilClass.generateEmail(15));
        $("#referral-select").selectByValue("Facebook");
        $("//span/input[2]").click();
    }
    public void alertPage(){
        $("//input[@value='      alerts']").click();
        $("//button[normalize-space()='Create New Alert']").click();
        $("//input[@name='alert_text']").clear();
        $("//input[@name='alert_text']").sendKeys("Alert Text- Client should be called as xxxxxxxxxxx");
        $("#alert_complete").click();
        $("//td[4]//button[. = 'save']").click();
        $("//input[@value='      contact']").click();

        //tr[@id='rand_id_2828_4363']//button[@value='save'][normalize-space()='save']
    }

    public void someoneAnswered() {
        $("//button[. = 'Someone Answered']").click();
    }

    public void theyMadeRequest() {
        $("//button[. = 'They Made Request']").click();
    }

    public void neverHadPolicyBtn() {
        $("//button[. = 'Never Had Policy']").click();
    }

    public void firstTimeBuyer() {
        // shouldBeVisible(By.xpath("//b[. = 'First Time Buyer']"));
        // shouldBeVisible(By.xpath("//span/div[. = 'My company is Usay Compare and we are the largest Individual Health insurance intermediary in the UK.  What I will do for you today is compare a panel of the leading insurers such as Bupa, AXA and Aviva and establish which is going to be the most suitable for you.  ']"));
        //  shouldContainAllText("//span/div[. = 'I’m regulated by the financial conduct authority which means I’m authorised to give you advice and because of that our calls are recorded.  Is that ok {{ first_name }}?']")

        $("//button[. = 'Okay To Proceed']").click();
    }

    public void saveAndProgressBtn() {
        $("//span/input[3]").click();
    }

    public void findAddress() {
        $("[name='postcode_search']").sendKeys("sn3 1aa");
        clickOn($("[name='find_postcode']"));
        clickOn($("[name='submit_address']"));

    }

    public void saveAndProgressPeoplePage() {
        clickOn($("[name='save_and_progress']"));
    }

    // By status = By.id("DN_maritial_status");
    public void peopleToCoverPage() {

        $("#DN_maritial_status", "+user").selectByVisibleText("married");
        $("#title", "+user").selectByVisibleText("Mr");
        $("[name='first_name']").sendKeys("Christopher");
        $("[name='middle_name']").sendKeys(UtilClass.generateRandomString(8));
        $("[name='last_name']").sendKeys("mark");
        $("#person1_smoke").selectByVisibleText("non smoker");
        $("#dob_input_0_d").selectByIndex(26);
        $("#dob_input_0_m").selectByVisibleText("Apr");
        $("#dob_input_0_y").selectByValue("1978");
        $("//td[8]/select").selectByVisibleText("2 more");
        $("[name='person1_feet']").selectByValue("5");
        $("[name='person1_inches']").selectByValue("5");
        $("[name='person1_stones']").selectByValue("10");
        $("[name='person1_pounds']").selectByValue("8");
        $("#person1_employment").selectByVisibleText("self employed");
        $("[name='person1_occupation_code']").selectByVisibleText("Advertising Manager");
        $("#memb0_prof_assoc_id").selectByIndex(0);
        $("#memb0_uk_resident").click();
        $("#memb0_uk_gp").click();

        // ------------partner objects---------------------------------------
        $("#memb1_title", "+user").selectByVisibleText("Mrs");
        $("[name='memb1_first_name']").sendKeys("Rachel");
        $("[name='memb1_middle_name']").sendKeys(UtilClass.generateRandomString(7));
        $("[name='memb1_last_name']").sendKeys("mark");
        $("[name='memb1_smoke']").selectByVisibleText("non smoker");
        $("#dob_input_1_d").selectByIndex(21);
        $("#dob_input_1_m").selectByVisibleText("Aug");
        $("#dob_input_1_y").selectByValue("1980");
        $("#memb1_employment").selectByVisibleText("self employed");
        $("[name='memb1_occupation_code']").selectByVisibleText("Advertising Manager");
        $("#memb1_prof_assoc_id").selectByIndex(0);
        $("#memb1_uk_resident").click();
        $("#memb1_uk_gp").click();
        //----------------childobjects-----------------------------------------
        $("#memb2_title", "+user").selectByVisibleText("Master");
        $("[name='memb2_first_name']").sendKeys("George");
        $("[name='memb2_middle_name']").sendKeys(UtilClass.generateRandomString(8));
        $("[name='memb2_last_name']").sendKeys("mark");
        $("[name='memb2_smoke']").selectByVisibleText("non smoker");
        $("#dob_input_2_d").selectByValue("2");
        $("#dob_input_2_m").selectByVisibleText("Aug");
        $("#dob_input_2_y").selectByValue("2006");
        $("#memb2_employment").selectByVisibleText("fulltime education");
        $("#memb2_uk_resident").click();
        $("#memb2_uk_gp").click();
        $("//span/input[2]").click();
        $("//span/input[3]").click();

    }

    public void typeOfMedicalInsurancePage() {
        $("//button[. = 'Individual']").click();
        $("//button[. = 'save and progress']").click();
    }

    public void productOverviewPage() {
        $("//button[. = 'Explained Product']").click();
    }

    public void budgetAndStartDatePage() {

        $("[name='DN_policy_month_afford']").clear();
        $("[name='DN_policy_month_afford']").sendKeys("180");
        $("//button[. = 'Confirmed Budget']").click();
        $("//button[. = 'save and progress']").click();
    }

    public void medicalHistoryPage() {
        $("//button[. = 'Take Medical History Now']", "+user").click();
        $("//span/input[3]").click();
    }

    public void underwritingPage() {
        $("//button[. = 'Explained Underwriting']").click();
        $("//span//button[. = 'Christopher Moratorium']").click();
        $("//span//button[. = 'Rachel Moratorium']").click();
        $("//span//button[. = 'George Moratorium']").click();
        $("//button[. = 'save and progress']").click();
    }

    public void hospitalsPage() {
        $("//*[@id=\"continue_to_quotes\"]").click();

    }

    public void verifyPreCompareStatement() {
        $("//button[. = 'save and progress']").click();

    }

    public void quotationPanel() {
        $("//img[@title='Flexible Health (2011-10) by (WPA)']").click();
        $("//td[1]/a[3]/img").click();
        getDriver().switchTo().frame("quote_iframe");
      //  $(" #SelectList > td.button_ijb_on.new-button-row > a > div").click();
     // $("#SelectList > td.button_ijb_on_of.new-button-row > a > div").click();

       // $("//*[@id=\"SelectList\"]/td[3]/a/div").click();

        $("//table[10]/tbody/tr/td[1]/table/tbody/tr/td[1]/a", "+user").click();
       // $("//table[10]/tbody/tr/td[1]/table/tbody/tr/td[2]/a","+user").click();
        getDriver().switchTo().defaultContent();
        $("//input[@name='submitbutton']", "+user").click();
    }

    public void summaryOfEnrolment() {
        $("//button[normalize-space()='Payment Frequency']").click();
        $("//button[normalize-space()='pay monthly']").click();
    }

    public void documentation() {
        String handleWindow = (String) getDriver().getWindowHandle();
        $("//a[normalize-space()='confirmation cover letter']").click();
        getDriver().switchTo().window(handleWindow);
        $("//a[normalize-space()='demands and needs']").click();
        getDriver().switchTo().window(handleWindow);
        $("//a[normalize-space()='illustration']").click();
        getDriver().switchTo().window(handleWindow);
        $("//a[normalize-space()='hospital list']").click();
        getDriver().switchTo().window(handleWindow);
    }

    public void happyWithSummary() {
        $("//button[normalize-space()='Happy With Summary']").click();
    }

    public void paymentValidation() {
        /*Direct debit details*/
       $("//input[@id='policy_pay_dd_accname1']").sendKeys("Mr Christopher");
       $("//input[@id='policy_pay_dd_accnumber']").sendKeys("36595074");
        $("//input[@id='policy_pay_dd_sortcode']").sendKeys("400515");
        /* Please tick the boxes for the adults who are linked to this account or select the third party payer option*/
       $(" //input[@id='person1_bank_assoc']").click();
        //b[normalize-space()='Christopher mark']
        //b[normalize-space()='Rachel mark']
        $("//input[@name='memb1_bank_assoc']").click();
        $("//input[@value='save changes']").click();
        $("//input[@value='save and continue']").click();
      /* Explained Direct Debit Guarantee*/
        $("//input[@name='speech_n']").click();
        $("//input[@value='save and continue']").click();
    }
   public void completePage(){
    /*   //span[@class='text_new_script_banana']//b[contains(text(),'4005713')]
       //span[@class='text_new_script_banana']//form[@action='admin.php']*/
       $("//input[@id='no_marketing']").click();
       $("//button[normalize-space()='Stated General Exclusions']").click();
       String completeText = $("//span[@class='text_new_script_banana']").getTextContent();
       System.out.println(completeText);
   }
   public void optOutPage(){
       $("//input[@value='      opt out']").click();
      $("//tr[1]/td[2]/span/input[2]").click();
      $("[name='opt_notes']").sendKeys(UtilClass.generateRandomString(25));
      $("//button[. = 'save preferences']").click();
     // $("//button[. = '#no_marketing']").click();
      $("//tr[2]//button[. = 'save']").click();

   }
   public void printing(){
        $("//input[@value='      printing']").click();
     /*  JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,373)"); */
   }

}