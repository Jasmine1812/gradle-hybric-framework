package nopcommerce.users;


import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.PageGenerator;
import pageObjects.user.HomePageObject;
import pageObjects.user.RegisterPageObject;
import pageObjects.user.UserLoginPageObject;
import pageObjects.user.sidebar.*;

import java.time.Duration;

public class Level_08_Page_Navigation extends BaseTest {


    @Parameters({"browser","userUrl", "adminUrl" })
    @BeforeClass
    public void beforeClass(String browserName, String userUrl, String adminUrl) {
        driver = getBrowserDriver(browserName,userUrl);
        this.adminUrl = adminUrl;
        this.userUrl = userUrl;
        homePage = PageGenerator.getHomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        firstName = "Tran";
        lastName = "Thi";
        day = "10";
        month = "May";
        year = "1994";
        email = "jasmine" + generateRandomNumber() + "@gmail.com";
        company = "NEXTG";
        password = "abcde12345-";
        confirmPassword = "abcde12345-";
    }

    @Test
    public void TC_01_Register() {

        registerPage = homePage.clickRegisterLink();
        registerPage.clickToGenderMaleRadio();
        registerPage.enterToFirstNameTextbox(firstName);
        registerPage.enterToLastNameTextbox(lastName);
        registerPage.selectDayDropdown(day);
        registerPage.selectMonthDropdown(month);
        registerPage.selectYearDropdown(year);
        registerPage.enterToMailTextbox(email);
        registerPage.enterToCompanyNameTextbox(company);
        registerPage.enterToPasswordTextbox(password);
        registerPage.enterToConfirmPasswordTextbox(confirmPassword);
        registerPage.clickToRegisterButton();
        Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
        homePage = registerPage.clickToLogoutLink();
    }

    @Test
    public void TC_02_Login() {
        loginPage = homePage.clickToLoginLink();
        loginPage.enterToEmailTextbox(email);
        loginPage.enterToPasswordTextbox(password);
        homePage = loginPage.clickToLoginButton();
        Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
    }

    @Test
    public void TC_03_MyAccount() {
        customerInfoPage = homePage.clickToMyAccountLink();
        Assert.assertTrue(customerInfoPage.isMaleDisplayed());
        Assert.assertEquals(customerInfoPage.getFirstNameTextboxValue(), firstName);
        Assert.assertEquals(customerInfoPage.getLastNameTextboxValue(), lastName);
        Assert.assertEquals(customerInfoPage.getDayDropdownSelectedValue(), day);
        Assert.assertEquals(customerInfoPage.getMonthDropdownSelectedValue(), month);
        Assert.assertEquals(customerInfoPage.getYearDropdownSelectedValue(), year);
        Assert.assertEquals(customerInfoPage.getEmailTextboxValue(), email);
        Assert.assertEquals(customerInfoPage.getCompanyTextboxValue(), company);

    }

    @Test
    public void TC_04_Switch_Page() {
        addressPage = customerInfoPage.openAddressPage();
        ordersPage = addressPage.openOrdersPage();
        downloadablePage = ordersPage.openDownloadPage();
        backInStockPage = downloadablePage.openBackInStockPage();
        rewardPointsPage = backInStockPage.openRewardPointsPage();
        changePasswordPage = rewardPointsPage.openChangePasswordPage();
        myProductReviewPage = changePasswordPage.openMyProductReviewPage();
        customerInfoPage = myProductReviewPage.openCustomerInforPage();

    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    private WebDriver driver;
    private HomePageObject homePage;
    private UserLoginPageObject loginPage;
    private CustomerInfoPageObject customerInfoPage;
    private RegisterPageObject registerPage;

    private AddressPageObject addressPage;
    private BackInStockPageObject backInStockPage;
    private ChangePasswordPageObject changePasswordPage;
    private DownloadablePageObject downloadablePage;
    private MyProductReviewPageObject myProductReviewPage;
    private OrdersPageObject ordersPage;
    private RewardPointsPageObject rewardPointsPage;
    private String adminUrl, userUrl;

    private String firstName, lastName, day, month, year, email, company, password, confirmPassword;


}
