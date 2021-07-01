package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.JsonFiles;

import java.nio.file.NoSuchFileException;


public class myProfile {


    WebDriver driver = null;

    public myProfile(WebDriver driver){

        this.driver = driver;
    }

    By button_Mis_Diseños = By.xpath("//a[contains(@href,'my-designs')]");


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

    public void clickMisDiseños(){

        waitElement(button_Mis_Diseños,30);
        WebElement mis_Diseños = driver.findElement(button_Mis_Diseños);
        mis_Diseños.click();
    }

    public  void clickAgregarDiseño(){

    }

}
