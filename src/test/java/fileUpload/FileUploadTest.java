package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/georgeashraf/emirates_webdriver_java/resources/chromedriver");
        //uploadPage.clickUploadButton();
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver","Files are incorrect");
    }
}
