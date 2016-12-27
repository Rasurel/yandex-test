package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://yandex.ru/")
public class YandexPage extends PageObject {
	public void locateInput(String query) {
		Actions actions = new Actions(getDriver());
		WebElement test = $(".input.suggest2-form__input");
		actions.moveToElement(test);
		actions.click();
		actions.sendKeys(query);
		actions.build().perform();
	}
}