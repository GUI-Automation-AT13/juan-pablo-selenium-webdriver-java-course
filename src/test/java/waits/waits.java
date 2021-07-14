package waits;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.*;

public class waits extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        DynamicLoadingPage loadingPage = homePage.clickDynamicLoading();
        DynamicLoadingExample1Page example1Page = loadingPage.clickExample1();
        example1Page.clickStart();
        assertEquals(example1Page.getLoadedText(), "Hello World!", "Loading Failed");
    }

    @Test
    public void testWaitUntilHiddenWithFluent() {
        DynamicLoadingPage loadingPage = homePage.clickDynamicLoading();
        DynamicLoadingExample1Page example1Page = loadingPage.clickExample1();
        example1Page.clickStartWithFluent();
        assertEquals(example1Page.getLoadedText(), "Hello World!", "Loading Failed");
    }
}
