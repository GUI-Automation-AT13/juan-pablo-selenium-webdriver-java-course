package tasks;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.*;

public class TaskVideo6Test extends BaseTests {

    @Test
    public void testSlideToWholeNumber(){
        String value = "2";
        HorizontalSliderPage sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "value incorrect");
    }
}
