package Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin  = {"com.cucumber.listener.ExtentCucumberFormatter:"},
        features = {"src/test/java/Features"},
        glue = {"StepDefinition"}
        )


public class TestRunner {
}
