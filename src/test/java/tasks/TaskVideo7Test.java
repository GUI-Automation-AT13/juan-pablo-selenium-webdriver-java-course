package tasks;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.*;

public class TaskVideo7Test extends BaseTests {

    @Test
    public void testPressRightClicks() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.pressRightClick();
        String text = contextMenuPage.getAlertText();
        contextMenuPage.alert_clickToAccept();
        assertEquals(text, "You selected a context menu", "wrong message");
    }
}
