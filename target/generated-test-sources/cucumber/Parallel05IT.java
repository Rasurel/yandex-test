import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"/Users/anna/Documents/workspace/testio/src/test/resources/features/yandexsecond.feature:6"},
plugin = {"json:target/cucumber-parallel/5.json"},
monochrome = true,
tags = {},
glue = { "basic", "tests" })
public class Parallel05IT {
}
