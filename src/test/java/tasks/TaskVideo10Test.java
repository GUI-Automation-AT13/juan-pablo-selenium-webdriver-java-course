package tasks;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class TaskVideo10Test extends BaseTests {

    @Test
    public void testName() {
        DropdownPage dropDownPage = homePage.clickDropdown();
        dropDownPage.addMultipleAttribute();

        List<String> optionsToSelect = new ArrayList<>();
        optionsToSelect.add( "Option 1");
        optionsToSelect.add( "Option 2");
        optionsToSelect.forEach(s -> {
            dropDownPage.selectFromDropdown(s);
        });

        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
