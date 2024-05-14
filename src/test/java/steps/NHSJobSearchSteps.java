package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NHSJobSearchSteps {

    @Given("I am a jobSeeker on NHS Jobs website")
    public void i_am_a_job_seeker_on_nhs_jobs_website() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jobs.nhs.uk/candidate/search");
        Thread.sleep(5000);


    }
    @When("I put my preferences into the Search functionality")
    public void i_put_my_preferences_into_the_search_functionality() {


    }
    @Then("I should get a list of jobs which matches my preferences")
    public void i_should_get_a_list_of_jobs_which_matches_my_preferences() {


    }
    @Then("the search results should be sorted by the newest Date Posted")
    public void the_search_results_should_be_sorted_by_the_newest_date_posted() {

    }
}