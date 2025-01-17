package pageObjects.admin;

import admin.DashboardPageUI;
import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;


public class AdminDashboardPageObject extends BasePage {

    private WebDriver driver;

    public AdminDashboardPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public AdminLoginPageObject clickToLogoutButton() {
        waitForElementClickable(DashboardPageUI.LOGOUT_LINK);
        clickToElement(DashboardPageUI.LOGOUT_LINK);
        return PageGenerator.getAdminLoginPage(driver);
    }
}
