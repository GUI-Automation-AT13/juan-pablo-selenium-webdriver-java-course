package tasks;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingExample2Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class TaskVideo9Test extends BaseTests {

    @Test
    public void testName() {
        DynamicLoadingPage loadingPage = homePage.clickDynamicLoading();
        DynamicLoadingExample2Page example2Page = loadingPage.clickExample2();
        example2Page.clickStart();
        assertEquals(example2Page.getLoadedText(), "Hello World!", "Loading Failed");
    }
}
