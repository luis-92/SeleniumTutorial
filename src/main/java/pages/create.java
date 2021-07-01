package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class create {


    WebDriver driver = null;

    public create(WebDriver driver){

        this.driver = driver;
    }

    By input_Text_Project_Name = By.cssSelector("input[name='project[name]']");
    By button_Guardar_Proyecto = By.cssSelector("input[value='Guardar proyecto']");



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

    public void enterNameProject(){

        waitElement(input_Text_Project_Name,30);
        WebElement project_Name = driver.findElement(input_Text_Project_Name);
        project_Name.sendKeys("test_New_Project");

    }

    public void clickGuardarProyecto(){
        waitElement(button_Guardar_Proyecto,30);
        WebElement guardar_Proyecto = driver.findElement(button_Guardar_Proyecto);
        guardar_Proyecto.click();
    }


}
