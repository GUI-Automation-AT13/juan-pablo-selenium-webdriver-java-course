package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.IframeEditorPage;

import static org.testng.Assert.assertEquals;

public class IframeEditor extends BaseTests {
    @Test
    public void testIframeEditor() {
        IframeEditorPage iframeEditorPage = homePage.clickWysiwygEditor();
        iframeEditorPage.clearTextArea();
        String text1 = "hello ";
        String text2 = "iframe ";
        String text3 = "Juan Pablo";
        iframeEditorPage.setTextArea(text1);
        iframeEditorPage.decreaseIndention();
        iframeEditorPage.setTextArea(text2);
        iframeEditorPage.decreaseIndention();
        iframeEditorPage.setTextArea(text3);
        assertEquals(iframeEditorPage.getTextFromEditor(), text1 + text2 + text3, "Wrong Text");
    }
}
