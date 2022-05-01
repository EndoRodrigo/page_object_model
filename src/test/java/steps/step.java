package steps;


import PageObject.SingOnPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class step {

    private WebDriver driver;
    private SingOnPage login = new SingOnPage(driver);

    @Given("el usuario ha de introducir de forma correcta su usuario y su contraseña, que ha registrado previamente.")
    public void el_usuario_ha_de_introducir_de_forma_correcta_su_usuario_y_su_contraseña_que_ha_registrado_previamente() {
        // Write code here that turns the phrase above into concrete actions
        driver = login.chromeDriverConnection();
        login.AbrirNavegador();

    }
    @When("el usuario clica sobre el botón de iniciar sesión.")
    public void el_usuario_clica_sobre_el_botón_de_iniciar_sesión() {
        // Write code here that turns the phrase above into concrete actions
        login.SingOnUser();
    }
    @Then("el usuario puede iniciar sesión de forma correcta.")
    public void el_usuario_puede_iniciar_sesión_de_forma_correcta() {
        // Write code here that turns the phrase above into concrete actions
        login.ValidarLogin();
    }

}
