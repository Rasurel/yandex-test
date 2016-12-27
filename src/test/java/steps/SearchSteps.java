package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import page.YandexPage;

public class SearchSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	private YandexPage yandex;
	
	@Step
	public void openYandex() {
		yandex.open();
	}
	
	@Step
	public void search(String query) {
		yandex.locateInput(query);
	}
}
