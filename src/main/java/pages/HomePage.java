package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
//    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink (String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication() {
//        driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public JavaScriptAlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public IframeEditorPage clickWysiwygEditor() {
        clickLink("WYSIWYG Editor");
        return new IframeEditorPage(driver);
    }

    public FramesPage clickFrames() {
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDOMPage clickLargeDeepDOM() {
        clickLink("Large & Deep DOM");
        return new LargeDeepDOMPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

//    public DynamicLoadingPage clickDynamicLoading(){
//        clickLink("Dynamic Loading");
//        return new DynamicLoadingPage(driver);
//    }
}
