package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class myDesigns {


    WebDriver driver = null;

    public myDesigns(WebDriver driver){

        this.driver = driver;
    }

    By button_Agregar_Proyecto = By.cssSelector("a[class='mosaico']");
    By button_Subir_Dsn = By.cssSelector("a[class='big']");


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

    public void clickAgregarProyecto(){


        JavascriptExecutor js = (JavascriptExecutor)driver;
        waitElement(button_Agregar_Proyecto,30);
        WebElement agregar_Proyecto = driver.findElement(button_Agregar_Proyecto);
        js.executeScript("arguments[0].click();",agregar_Proyecto);
    }

    public void clickSubirDsn(){
        waitElement(button_Subir_Dsn,30);
        WebElement subir_Dsn = driver.findElement(button_Subir_Dsn);
        subir_Dsn.click();

    }






}
