package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources/feature/SingOn.feature"},
        glue = {"src/test/java/steps"})
public class RunCucumberTest {

    //Test Driven Development (TDD) -> Desarrollo Dirigido por Pruebas
    //Behavior Driven Development (BDD) -> Desarrollo Dirigido por Comportamiento.
    //Gherkin es un Lenguaje Específico de Dominio (DSL)
}
