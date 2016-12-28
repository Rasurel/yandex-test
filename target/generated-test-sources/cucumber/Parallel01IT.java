import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"/Users/anna/Documents/workspace/testio/src/test/resources/features/yandexfirst.feature:4"},
plugin = {"json:target/cucumber-parallel/1.json"},
monochrome = true,
tags = {},
glue = { "basic", "tests" })
public class Parallel01IT {
}
