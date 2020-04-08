package GlueCode;

import TestRunners.TestDefaultValues;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FacebookLoginPage;
import pages.FacebookWelcomePage;


public class FacebookStepDefinitions {

    private String email = TestDefaultValues.getUser();
    private String password = TestDefaultValues.getPassword();
    private WebDriver driver = GeneralStepDefinitions.getDriver();
    private FacebookLoginPage facebookLoginPage;
    private FacebookWelcomePage facebookWelcomePage;

    @When("^I successfully login to Facebook with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void successfulLoginToFacebookWithSpecifiedCredentials(String email, String password) throws Throwable {
        facebookLoginPage = new FacebookLoginPage(driver);
        facebookWelcomePage = facebookLoginPage.successfulLogin(email, password);
    }

    @When("^I successfully login to Facebook with default credentials$")
    public void successfulLoginToFacebookWithDefaultCredentials() throws Throwable {
        facebookLoginPage = new FacebookLoginPage(driver);
        facebookWelcomePage = facebookLoginPage.successfulLogin(email, password);
    }


    @Then("^Facebook Welcome Page is successfully displayed$")
    public void validateFacebookWelcomePage() throws Throwable {
        facebookWelcomePage.validateFacebookWelcomePage();
    }



}
