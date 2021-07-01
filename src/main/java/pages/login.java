package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class login {

    WebDriver driver = null;

    public login(WebDriver driver){

        this.driver = driver;
    }

    By text_box_email = By.xpath("input[type='email']");

    By input_Password = By.cssSelector("input[placeholder='Contraseña']");

    By button_Submit = By.cssSelector("input[type='submit']");





    public void clickLogin(){

        WebElement login = driver.findElement(button_Submit);
        login.click();

    }

    public void enterCredentials(){

        WebElement enterMail = driver.findElement(text_box_email);
        enterMail.sendKeys("prueba@gmail.com");
        WebElement enterPassword = driver.findElement(input_Password);
        enterPassword.sendKeys("123432543");
        WebElement clickRegistro = driver.findElement(button_Submit);
        clickRegistro.click();

    }





}



