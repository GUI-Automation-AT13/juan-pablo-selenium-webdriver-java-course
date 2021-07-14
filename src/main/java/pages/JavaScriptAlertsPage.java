package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By alertBtn = By.xpath("//button[text()='Click for JS Alert']");
    private By alertConfirmBtn = By.xpath("//button[text()='Click for JS Confirm']");
    private By alertPromptBtn = By.xpath("//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void showAlert() {
        driver.findElement(alertBtn).click();
    }

    public void showConfirnAlert() {
        driver.findElement(alertConfirmBtn).click();
    }

    public void showAlertPrompt(){
        driver.findElement(alertPromptBtn).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }

    public String alert_getText() {
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
