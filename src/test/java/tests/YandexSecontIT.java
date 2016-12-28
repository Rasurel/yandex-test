package tests;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.SearchSteps;

public class YandexSecontIT {
	
	@Steps
	private SearchSteps searchSteps;
	
	@Then("^user enters anja$")
	public void user_enters_anja() throws Throwable {
		searchSteps.search("anja");
	}
	
	@Then("^user enters heilbronn$")
	public void user_enters_heilbronn() throws Throwable {
		searchSteps.search("heilbronn");
	}
	
	@Then("^user enters fat$")
	public void user_enters_fat() throws Throwable {
		searchSteps.search("fat");
	}

}
