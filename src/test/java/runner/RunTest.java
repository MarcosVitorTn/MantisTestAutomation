package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"steps"}, tags = "@smoke", publish = true, plugin = {"json:target/cucumber.json"})
public class RunTest {
}
