package openEmr.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import openEmr.pages.LogoutPage;
import openEmr.utils.BrowserUtils;
import org.testng.Assert;

public class Logout extends BrowserUtils {


    LogoutPage logoutPage=new LogoutPage();

    @Given("User navigates to home page")
    public void user_navigates_to_home_page() {
        System.out.println("we are in home page");
    }
    @When("User clicks to Log out button")
    public void user_clicks_to_log_out_button() throws InterruptedException {
        Thread.sleep(2000);
        logoutPage.setUserData();
    }
    @When("User navigates to login page with title as {string}")
    public void user_navigates_to_login_page_with_title_as(String title) {
        Assert.assertEquals(title,logoutPage.getTitle());
    }
}
