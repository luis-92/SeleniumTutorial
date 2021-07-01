package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class createStepOne {


    WebDriver driver = null;

    public createStepOne(WebDriver driver){

        this.driver = driver;
    }

    By checkBox_ownership = By.cssSelector("label[class='checkbox'] input[name='ownership']");
    By checkBox_terms = By.cssSelector("label[class='checkbox'] input[name='terms']");
    By upload_New_Design = By.cssSelector("div[class='transparentDragZone']");
    By button_Continue =  By.cssSelector("input[class='continuar']");





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

    public void clickOwnership(){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        waitElement(checkBox_ownership,30);
        WebElement click_Ownersihp = driver.findElement(checkBox_ownership);
        js.executeScript("arguments[0].click();",click_Ownersihp);

    }

    public void clickTerms(){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        waitElement(checkBox_terms,30);
        WebElement click_Terms = driver.findElement(checkBox_terms);
        js.executeScript("arguments[0].click();",click_Terms);

    }

    public void uploadDesign() throws AWTException, InterruptedException {

        waitElement(upload_New_Design,30);
        WebElement upload_Design= driver.findElement(upload_New_Design);

        upload_Design.click();

        //put path to your image in a clipboard
        StringSelection ss = new StringSelection("C:\\Users\\kznn088\\repo\\SeleniumTutorial\\img\\test_img.jpg");

        //imitate mouse events like ENTER, CTRL+C, CTRL+V

        Robot robot = new Robot();

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        /*ROBOT CLASS TO EXECUTE ALT + TAB OPERATION*/
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);

        /*ROBOT CLASS TO EXECUTE ALT + TAB OPERATION*/
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);

        /*ROBOT CLASS TO EXECUTE CNTRL +V OPERATION*/
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        /*ROBOT CLASS TO EXECUTE ENTER OPERATION*/
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //Runtime.getRuntime().exec(strFileLocation);// execute the AutoIT script
        Thread.sleep(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    public void clickContinue(){

        waitElement(button_Continue,30);
        WebElement continue_Element = driver.findElement(button_Continue);
        Actions actions = new Actions(driver);
        actions.moveToElement(continue_Element);
        continue_Element.click();
    }




}







