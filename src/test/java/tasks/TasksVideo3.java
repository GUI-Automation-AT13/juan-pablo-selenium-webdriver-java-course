package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertEquals;

public class TasksVideo3 {
    
    private static WebDriver driver;
    
    @BeforeTest
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test
    void Task1() {
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.cssSelector("a[href='/shifting_content/menu']")).click();
        List<WebElement> menuList = driver.findElements(By.tagName("li"));
        assertEquals(menuList.size(),5);
    }

    @AfterTest
    public static void close(){
        driver.quit();
    }
}
