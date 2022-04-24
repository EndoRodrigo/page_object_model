package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step {
    @Given("today is Sunday")
    public void today_is_sunday() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Paso 1");
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Paso 2");
    }

    @Then("I should be told")
    public void i_should_be_told() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Paso 3");
    }

}
