package SeleniumGroupId;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;


import utils.JsonFiles;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private WebDriver driver;
    By test = By.xpath("");

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    throws Exception
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://allypat.com");
        Index home = new Index(driver);
        driver.manage().window().maximize();
        home.clickLogin();
        home.enterCredentials();
        home.clickProfileButton();

        myProfile myProfile = new myProfile(driver);
        myProfile.clickMisDiseños();

        myDesigns myDesigns = new myDesigns(driver);
        myDesigns.clickSubirDsn();

        createStepOne createStepOne = new createStepOne(driver);
        createStepOne.clickOwnership();
        createStepOne.clickTerms();
        createStepOne.uploadDesign();
        createStepOne.clickContinue();
        createStepTwo createStepTwo = new createStepTwo(driver);
        createStepTwo.enterDesginName();
        createStepTwo.selectStyleAnimalPrint();
        createStepTwo.selectStyleAbstacto();
        createStepTwo.selectStyleArabe();
        createStepTwo.suggestNewTags();
        createStepTwo.selectColorsRojoOscuro();
        createStepTwo.selectColorsVerdeOscuro();
        createStepTwo.clickCheckMarkPublic();
        createStepTwo.clickContinue();
        createStepTwo.clickGuardar();
    }

}
