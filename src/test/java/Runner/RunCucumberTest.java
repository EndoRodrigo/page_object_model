package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources/feature/SingOn.feature"},
        glue = {"src/test/java/steps"})
public class RunCucumberTest {
}