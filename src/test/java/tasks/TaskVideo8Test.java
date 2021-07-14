package tasks;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class TaskVideo8Test extends BaseTests {

    @Test
    public void testIframeTask() {
        FramesPage framesPage = homePage.clickFrames();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "frame incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "frame incorrect");
    }
}
