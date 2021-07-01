package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class createStepTwo {

    WebDriver driver = null;

    public createStepTwo(WebDriver driver){

        this.driver = driver;
    }

    By input_Design_Name = By.cssSelector("input[name='design[name]']");

    By input_List_Tag_New_Tag_Colors = By.cssSelector("input[class=\'select2-search__field\']");

    By checkBox_Public = By.cssSelector("input[id='public-design']");

    By button_Continue =  By.cssSelector("input[class='continuar']");

    By button_Save = By.cssSelector("input[value='Guardar >']");

    //*[contains(text(),'Consent No.')]/following::*[@data-output-element-id='output-field']



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

    public void enterDesginName(){
        waitElement(input_Design_Name,30);
        WebElement name = driver.findElement(input_Design_Name);
        name.sendKeys("test_Name_Design");
    }

    public void selectStyleAnimalPrint(){

        waitElement(input_List_Tag_New_Tag_Colors,30);
        List<WebElement> list = driver.findElements(input_List_Tag_New_Tag_Colors);
        list.get(0).click();
        list.get(0).sendKeys("Animal print");
        list.get(0).sendKeys(Keys.ENTER);

    }

    public void selectStyleAbstacto(){

        waitElement(input_List_Tag_New_Tag_Colors,30);
        List<WebElement> list = driver.findElements(input_List_Tag_New_Tag_Colors);
        list.get(0).click();
        list.get(0).sendKeys("Abstracto");
        list.get(0).sendKeys(Keys.ENTER);

    }

    public void selectStyleArabe(){

        waitElement(input_List_Tag_New_Tag_Colors,30);
        List<WebElement> list = driver.findElements(input_List_Tag_New_Tag_Colors);
        list.get(0).click();
        list.get(0).sendKeys("Arabe");
        list.get(0).sendKeys(Keys.ENTER);

    }


    public void suggestNewTags(){

        waitElement(input_List_Tag_New_Tag_Colors,30);
        List<WebElement> list = driver.findElements(input_List_Tag_New_Tag_Colors);
        list.get(1).click();
        list.get(1).sendKeys("new_Tag_Test");
        list.get(1).sendKeys(Keys.ENTER);
    }

    public void selectColorsRojoOscuro(){

        waitElement(input_List_Tag_New_Tag_Colors,30);
        List<WebElement> list = driver.findElements(input_List_Tag_New_Tag_Colors);
        list.get(2).click();
        list.get(2).sendKeys("Rojo Oscuro");
        list.get(2).sendKeys(Keys.ENTER);
    }

    public void selectColorsVerdeOscuro(){

        waitElement(input_List_Tag_New_Tag_Colors,30);
        List<WebElement> list = driver.findElements(input_List_Tag_New_Tag_Colors);
        list.get(2).click();
        list.get(2).sendKeys("Verde Oscuro");
        list.get(2).sendKeys(Keys.ENTER);
    }



    public void  clickCheckMarkPublic(){

        /*
        WebElement check_Public = driver.findElement(list_Check_Mark_Public_Private);
        waitElement(list_Check_Mark_Public_Private,30);
        List<WebElement> list = driver.findElements(list_Check_Mark_Public_Private);
        Actions actions = new Actions(driver);
        actions.moveToElement(check_Public);
        check_Public.click();
        //list.get(1).click();
        */
        waitElement(checkBox_Public,30);

        WebElement check_Public = driver.findElement(checkBox_Public);
        /*
        Actions actions = new Actions(driver);
        actions.moveToElement(check_Public);
        */
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", check_Public);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", check_Public);

    }



    public void clickContinue(){

        waitElement(button_Continue,30);
        WebElement continue_Element = driver.findElement(button_Continue);
        Actions actions = new Actions(driver);
        actions.moveToElement(continue_Element);
        continue_Element.click();
    }

    public void clickGuardar(){

        waitElement(button_Save,30);
        WebElement saveDesign = driver.findElement(button_Save);
        saveDesign.click();

    }



}
