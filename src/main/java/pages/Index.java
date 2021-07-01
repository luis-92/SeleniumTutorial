package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.JsonFiles;

import java.nio.file.NoSuchFileException;


public class Index {

    WebDriver driver = null;

    public Index(WebDriver driver){

        this.driver = driver;
    }

    By button_Login = By.xpath("//a[contains(@href,'om/login')]");

    By input_Email = By.cssSelector("input[placeholder='E-mail*']");

    By input_Password = By.cssSelector("input[placeholder='Contraseña']");

    By button_Submit = By.cssSelector("input[type='submit']");

    By link_Inicio = By.cssSelector("a[class='active' ]");


    By link_Compra = By.xpath("//a[contains(text(),\'Compra\')]");

    By compras_Telas = By.cssSelector("li[class='menuRecursos'] a[href*='catalogue/design']");

    By compras_Hogar = By.cssSelector("li[class='menuRecursos'] a[href*='catalogue/products/articulos-del-hogar']");

    By compras_Moda = By.cssSelector("li[class='menuRecursos'] a[href*='catalogue/products/moda']");

    By compras_Cubrebocas = By.cssSelector("li[class='menuRecursos'] a[href*='catalogue/products/cubrebocas']");

    By compras_CatalogoTelas = By.cssSelector("li[class='menuRecursos'] a[href*='catalogue/products/catalogo-de-telas']");

    By link_DiseñaYVende = By.xpath("//a[contains(text(),'Diseña y vende')]");

    By link_DiseñaYVende_ComoSubirDiseño = By.xpath("//a[contains(text(),'¿Cómo subo un diseño?')]");

    By link_DiseñaYVende_ComoCrearUnPatron = By.xpath("//a[contains(text(),'¿Cómo crear un patrón?')]");

    By button_Profile = By.cssSelector("a[class='nav-link']");



    /*
    @FindBy(xpath = "//div[contains(@class,'lafPageHost')]")
    private WebElement labelPanelTab;

    @FindBy(xpath = "//a[contains(text(),'¿Cómo crear un patrón?')]")
    private WebElement link_DiseñaYVendea;
    */

    public void clickLogin(){

        waitElement(button_Login,30);
        WebElement login = driver.findElement(button_Login);
        login.click();

    }

    public boolean waitElement(By webElement, int timeOutInSeconds){
        boolean statusOperation = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            wait.until(ExpectedConditions.presenceOfElementLocated(webElement));
            statusOperation = true;
        } catch (Exception e) {

        }
        return statusOperation;
    }


    public void enterCredentials() throws NoSuchFileException {

        JsonFiles jsonfiles = new JsonFiles();

        jsonfiles.setFileName("Credentials");

        WebElement enterMail = driver.findElement(input_Email);
        enterMail.sendKeys(jsonfiles.getField("email"));
        WebElement enterPassword = driver.findElement(input_Password);
        enterPassword.sendKeys(jsonfiles.getField("password"));
        WebElement clickRegistro = driver.findElement(button_Submit);
        clickRegistro.click();

    }

    public void clickProfileButton(){

        waitElement(button_Profile,30);
        WebElement profile_Button = driver.findElement(button_Profile);
        profile_Button.click();

    }






}



