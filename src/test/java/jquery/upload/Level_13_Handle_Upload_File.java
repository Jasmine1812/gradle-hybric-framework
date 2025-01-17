package jquery.upload;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.jquery.PageGeneratorJQuery;
import pageObjects.jquery.UploadPage;

public class Level_13_Handle_Upload_File extends BaseTest {
    private WebDriver driver;
    String image1 = "image01.jpg";
    String image2 = "image02.jpg";
    String image3 = "image03.jpg";
    String multiFile[] = {image1, image2, image3};
    private UploadPage uploadPage;

    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        uploadPage = PageGeneratorJQuery.geUploadPage(driver);
    }

    @Test
    public void TC_01_Single_Upload_File(){
        uploadPage.uploadMultipleFiles(image1);
        uploadPage.sleepInSeconds(2);

        uploadPage.uploadMultipleFiles(image2);
        uploadPage.sleepInSeconds(2);

        uploadPage.uploadMultipleFiles(image3);
        uploadPage.sleepInSeconds(2);

        Assert.assertTrue(uploadPage.isFileLoadedSuccess(image1));
        Assert.assertTrue(uploadPage.isFileLoadedSuccess(image2));
        Assert.assertTrue(uploadPage.isFileLoadedSuccess(image3));

        uploadPage.clickStartButtonOnEachFile();

        Assert.assertTrue(uploadPage.isFileUploadedSuccess(image1));
        Assert.assertTrue(uploadPage.isFileUploadedSuccess(image2));
        Assert.assertTrue(uploadPage.isFileUploadedSuccess(image3));
    }

    @Test
    public void TC_02_Multiple_Upload_File(){
        uploadPage.refreshCurrentPage();
        uploadPage.uploadMultipleFiles(multiFile);

        Assert.assertTrue(uploadPage.isFileLoadedSuccess(image1));
        Assert.assertTrue(uploadPage.isFileLoadedSuccess(image2));
        Assert.assertTrue(uploadPage.isFileLoadedSuccess(image3));

        uploadPage.clickStartButtonOnEachFile();

        Assert.assertTrue(uploadPage.isFileUploadedSuccess(image1));
        Assert.assertTrue(uploadPage.isFileUploadedSuccess(image2));
        Assert.assertTrue(uploadPage.isFileUploadedSuccess(image3));
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
