package stepdefinitions.Login;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ErrorMessage;
import questions.FlipkartSalutationText;
import tasks.Login;
import tasks.OpenBrowser;
import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class FlipkartUserLogin {

    Actor ankit ;

    @Managed
    WebDriver theBrowser;

    @Before
    public void ankitCanBrowseTheWeb() {
        ankit = Actor.named("Ankit");
        givenThat(ankit).can(BrowseTheWeb.with(theBrowser));
        //theBrowser.manage().window().maximize();

    }

    @Given("^the Flipkart application$")
    public void launch_application() {
        ankit.attemptsTo(OpenBrowser.withDefaultURL());
    }

    @When("^the user enters valid username as (.*) and password as (.*)$")
    public void enter_valid_credentials(String username, String password) {
        ankit.attemptsTo(Login.with(username, password));
    }

    @Then("^they should be able to see their First Name displayed in the salutation$")
    public void login_successful() {
        ankit.should(seeThat(FlipkartSalutationText.displayed(), is((ankit.toString()))));
    }

    @When("^the user enters invalid username as (.*) and/or password as (.*)$")
    public void enter_invalid_credentials(String username, String password) {
        ankit.attemptsTo(Login.with(username, password));
    }

    @Then("^they should be able to see the error message as \"Your username or password is incorrect\"$")
    public void login_unsuccessful() {
        ankit.should(seeThat(ErrorMessage.displayed(), equalToIgnoringCase(("Your username or password is incorrect"))));
    }
}
