package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By fileUploadBtn = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");
    private By uploadedFilesTxt = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(fileUploadBtn).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public void clickUploadButton(){
        driver.findElement(uploadBtn).click();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFilesTxt).getText();
    }
}
