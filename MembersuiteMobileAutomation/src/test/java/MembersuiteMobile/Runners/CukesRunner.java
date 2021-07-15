package MembersuiteMobile.Runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "MembersuiteMobile/StepDefinitions",
        plugin = {
                "json:target/cucumber.json"
        },
        dryRun = false,
        tags =   "@LoginFunctionality"
)
public class CukesRunner {
}