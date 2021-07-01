package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class register {

    WebDriver driver = null;

    public register(WebDriver driver){

        this.driver = driver;
    }


    By button_registrate = By.cssSelector("a[class=\"activo\"]");
    By text_box_usuario = By.cssSelector("input[type='text'][name='username']");
    By text_box_nombre = By.cssSelector("input[type='text'][name='name']");
    By text_box_apellidos = By.cssSelector("input[type='email'][name='email']");
    By tex_box_fecha_nacimiento = By.cssSelector("input[type='text'][name='designer[birthdate]']");

    By button_Submit = By.cssSelector("input[type='submit']");







    public void clickLogin(){

        WebElement login = driver.findElement(button_Submit);
        login.click();

    }

    /*
    public void enterCredentials(){

        WebElement enterMail = driver.findElement(input_Email);
        enterMail.sendKeys("prueba@gmail.com");
        WebElement enterPassword = driver.findElement(input_Password);
        enterPassword.sendKeys("123432543");
        WebElement clickRegistro = driver.findElement(button_Submit);
        clickRegistro.click();

    }
*/




}



