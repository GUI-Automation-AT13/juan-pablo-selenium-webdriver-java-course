package tasks;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class TaskVideo4Test extends BaseTests {

    @Test
    public void testRetrievePassword() {
        ForgotPasswordPage forgetPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = forgetPasswordPage.retrievePassword("jp@example.com");
        Assert.assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Message incorrect");
    }
}
