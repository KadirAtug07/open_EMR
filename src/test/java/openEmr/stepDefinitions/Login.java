package openEmr.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import openEmr.pages.LoginPage;
import openEmr.utils.BrowserUtils;
import org.testng.Assert;

public class Login extends BrowserUtils {

LoginPage loginPage=new LoginPage();
    @Given("User navigates to website")
    public void user_navigates_to_website() {
        System.out.println("we are in login page");
        String expectedTitle="OpenEMR Login";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("User enters valid username")
    public void user_enters_valid_username() throws InterruptedException {
       loginPage.setUserName();
       Thread.sleep(1000);
    }
    @Then("User enters valid password")
    public void user_enters_valid_password() throws InterruptedException {
         loginPage.setPassword();
        Thread.sleep(1000);
    }
    @Then("User selects {string}")
    public void user_selects(String language) throws InterruptedException {
        loginPage.setSelectLanguage(language);
        Thread.sleep(1000);
    }
    @Then("User clicks to login button")
    public void user_clicks_to_login_button() throws InterruptedException {
         loginPage.setLoginButton();
        Thread.sleep(1000);
    }
    @Then("User verifies home page title as {string}")
    public void user_verifies_home_page_title_as(String title) throws InterruptedException {
        String actualHomePageTitle= loginPage.getTitle();
         Assert.assertEquals(title,actualHomePageTitle);
        Thread.sleep(1000);
    }
    @When("user enters invalid userName")
    public void user_enters_invalid_user_name() {
      loginPage.invalidUserName();
    }
    @Then("user gets error message as {string}")
    public void user_gets_error_message_as(String errorMessage) {
      String actualErrorMessage= loginPage.getErrorMessage();
      Assert.assertEquals(errorMessage,actualErrorMessage);
    }
    @Then("User enters invalid password")
    public void user_enters_invalid_password() {
      loginPage.invalidPassword();
    }
}
