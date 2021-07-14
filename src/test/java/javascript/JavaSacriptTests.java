package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaSacriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeDeepDOM().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
