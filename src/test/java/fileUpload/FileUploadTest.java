package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.*;

public class FileUploadTest extends BaseTests {

    @Test
    public void testFileUpload(){
        FileUploadPage uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\juamp\\Documents\\jala\\gui\\selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "wrong file");
    }
}
