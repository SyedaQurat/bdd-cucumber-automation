package StepDefinition;

import Configuration.BaseConfiguration;
import PajeObjects.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;

public class LoginMethods extends BaseConfiguration {

@Before
    public void openBrowser()
    {
        getDriver();
        System.out.println("Initialized");
    }

    @Given("^a user opens Cotton Trader App$")
    public void aUserOpensCottonTraderApp() {
        System.out.println("Hi");
    }

    @When("^a user clicks on navigation$")
    public void aUserClicksOnNavigation() {
    }

    @And("^navigate to Knitwear category$")
    public void navigateToKnitwearCategory() {
    }

    @And("^add the (\\d+)th item to the bag$")
    public void addTheThItemToTheBag(int arg0) {
    }

    @Then("^view the bag$")
    public void viewTheBag() {
    }
}


