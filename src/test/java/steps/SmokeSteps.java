package steps;

import io.cucumber.java.en.*;

public class SmokeSteps {

    @Given("I print hello world")
    public void i_print_hello_world() {
        System.out.println("Hello World");
    }

    @Then("everybody is happy")
    public void everybody_is_happy() {
        System.out.println("We are happy");
    }

    @Given("I run cucumber test")
    public void i_run_cucumber_test() {

        for (int i = 0; i < 100; i++){
            System.out.println("This is Cucumber test!!!!");
        }

    }
    @Then("verify this is Cucumber")
    public void verify_this_is_cucumber() {

        for (int i = 0; i < 20; i++){
            System.out.println("Indeed this cucumber!!!!!!!!!!!!!!!");
        }

    }

}
