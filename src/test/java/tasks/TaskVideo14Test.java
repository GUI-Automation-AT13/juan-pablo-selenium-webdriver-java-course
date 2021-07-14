package tasks;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CookieManager;

public class TaskVideo14Test extends BaseTests {

    @Test
    public void testDeleteCookie() {
        CookieManager cookieManager = getCookieManager();
        Cookie cookie = cookieManager.buildCookie("juampi", "123");
        cookieManager.deleteCookie(cookie);
        Assert.assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
    }
}
