package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {


    private WebDriver driver;
    private By emailTxtBox = By.id("email");
    private By retrievePasswordBtn = By.cssSelector(".icon-2x.icon-signin");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailTxtBox).sendKeys(email);
    }

    public EmailSentPage clickRetrievePassword(){
        driver.findElement(retrievePasswordBtn).click();
        driver.get("https://the-internet.herokuapp.com/email_sent");
        return new EmailSentPage(driver);
    }

    public EmailSentPage retrievePassword(String email){
        enterEmail(email);
        return clickRetrievePassword();
    }
}
