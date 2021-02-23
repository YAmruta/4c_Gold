package GoldPages;
import java.io.File;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilClass {
    public static String generateRandomString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public static String generateRandomNumber(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public static String generateRandomAlphaNumeric(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    public static String generateStringWithAllowedSplChars(int length, String allowdSplChrs) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
                "1234567890" + // numbers
                allowdSplChrs;
        return RandomStringUtils.random(length, allowedChars);
    }

    public static String generateEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
                "1234567890"; // numbers
        // special characters
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@usaytest.org";
        return email;
    }

    public static String generateUrl(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
                "1234567890" + // numbers
                "_-."; // special characters
        String url = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        url = temp.substring(0, 3) + "." + temp.substring(4, temp.length() - 4) + "."
                + temp.substring(temp.length() - 3);
        return url;
    }
    public static void scrollPageDown(WebDriver driver) {

        JavascriptExecutor js = ((JavascriptExecutor) driver);

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
}
