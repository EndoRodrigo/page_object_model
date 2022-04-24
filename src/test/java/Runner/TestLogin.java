package Runner;

import PageObject.SingOnPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TestLogin {
    SingOnPage login;
    private WebDriver driver;

    @Before
    public void setUp() {
        login = new SingOnPage(driver);
        driver = login.chromeDriverConnection();
        login.visit("https://demo.guru99.com/test/newtours/login.php");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void SingTest()  {
        login.SingOnUser();
        System.out.println(login.ValidarLogin());
        assertEquals("Thank you for Loggin.",login.ValidarLogin());

    }


}
