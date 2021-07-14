package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTests {

    @Test
    public void testAcceptAlert() {
        JavaScriptAlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.showAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert","wrong message");
    }

    @Test
    public void testGetTextFromAlert() {
        JavaScriptAlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.showConfirnAlert();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","wrong message");
    }

    @Test
    public void testSetInputInAlert(){
        JavaScriptAlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.showAlertPrompt();
        String text = "Juampi!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "wrong result");
    }
}
