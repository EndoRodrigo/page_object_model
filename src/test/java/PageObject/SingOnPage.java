package PageObject;

import BaseObjectModel.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingOnPage extends Base {

    public SingOnPage(WebDriver driver) {
        super(driver);
    }

    //Variables globales
    By user = By.name("userName");
    By pass = By.name("password");
    By submit = By.name("submit");
    By getTexto = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b");

    public void SingOnUser(){
        if (isDisplayed(user)){
            type("endo",user);
            type("12345",pass);
            click(submit);
        }else {
            System.out.println("Localizador del campos usuario no esta disponible");
        }


    }

    public String ValidarLogin(){
        return getText(getTexto);
    }
}
