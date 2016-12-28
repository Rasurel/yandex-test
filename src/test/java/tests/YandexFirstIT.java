package tests;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.SearchSteps;

public class YandexFirstIT {

	@Steps
	private SearchSteps searchSteps;
	
	@Then("^yandex is opened$")
	public void google_is_opened() throws Throwable {
		searchSteps.openYandex();
	}
	
	@Then("^user enters test$")
	public void user_enters_test() throws Throwable {
		searchSteps.search("test");
	}
	
	@Then("^user enters school$")
	public void user_enters_school() throws Throwable {
		searchSteps.search("school");
	}
	
	@Then("^user enters ski$")
	public void user_enters_ski() throws Throwable {
		searchSteps.search("ski");
	}
	
}