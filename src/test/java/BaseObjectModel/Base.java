package BaseObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {

    // Intancia del controlador de webdriver
    // Modificador de acceso solo puede ser usuado por la misma clase
    private WebDriver driver;

    //Al heredar la clase se espera que se envie un parametro
    public Base(WebDriver driver){
        this.driver = driver;
    }

    //Esta funcion establece la conecion al navegador a usar
    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver","src/test/java/resource/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    //Esta funcion se encuntran los localizadores
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    //Esta funciones permite encontrar una lista de elementos
    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    //Esta funcion permite obtener el texto de un elemento
    public String getText(WebElement element) {
        return element.getText();
    }

    //Esta funcion permite obtener el texto de un elemento
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    //Esta funcion realiza un acciones sobre un campos
    public void type(String input, By locator) {
        driver.findElement(locator).sendKeys(input);
    }

    //Esta funcion realiza un click sobre un campo
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    //Esta funcion verifica si un elemento esta presente
    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    //Esta funcion se ingresa la url de navegacion
    public void visit(String Url) {
        driver.get(Url);
    }
}
