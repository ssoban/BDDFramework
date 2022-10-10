package pages;

import com.learning.base.Baseclass;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Baseclass {
    public static final Logger log = Logger.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        Baseclass.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Droppable']")
    private WebElement droppable;
    @FindBy(xpath = "//iframe[@class='demo-frame']")
    private WebElement frame;

    @FindBy(id = "draggable")
    private WebElement drag;

    @FindBy(id = "droppable")
    private WebElement drop;

    @FindBy(xpath = "//a[normalize-space()='Selectable']")
    private WebElement selectable;

    @FindBy(xpath = "//ol[@id=\"selectable\"]/*")
    private List<WebElement> selectableitems;

    @FindBy(xpath = "//a[normalize-space()='Controlgroup']")
    private WebElement controlgroup;

    @FindBy(xpath = "//label[@for='transmission-automatic']//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']")
    private WebElement automatic;

    @FindBy(xpath = "//label[@for='insurance']//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']")
    private WebElement insurance;
    @FindBy(xpath = "//label[@for='transmission-standard-v']//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']")
    private WebElement standard;
    @FindBy(xpath = "//label[@for='insurance-v']//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']")
    private WebElement insurance2;
    @FindBy(xpath = "//button[@id='book']")
    private WebElement booknow;








 public void verifyUrl(){
     Assert.assertEquals(driver.getCurrentUrl(),"https://jqueryui.com/");
 }

 public void clickOnDroppable() throws InterruptedException {
     Thread.sleep(2000);
     Assert.assertTrue(droppable.isDisplayed(),"Droppable option not displayed");
     droppable.click();
 }
    public void performDragDrop() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame(frame);
        Assert.assertTrue(drag.isDisplayed(),"Drag option not displayed");
        Actions action = new Actions(driver);
        action.dragAndDrop(drag,drop).build().perform();
        Assert.assertTrue(drop.isDisplayed(),"Drop option not displayed");
        //verify text changed in to 'Drop here' box
        String textTo = drop.getText();

        if(textTo.equals("Dropped!")) {
            log.info("PASS: Source is dropped to target as expected");
        }else {
            log.info("FAIL: Source couldn't be dropped to target as expected");
        }


    }

     public void clickOnSelectable() throws InterruptedException {
         Thread.sleep(2000);
         Assert.assertTrue(selectable.isDisplayed(),"Selectable option not dispalyed");
         selectable.click();
     }


    public void selectitems() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame(frame);
        for(int i =0;i<selectableitems.size();i++) {
            String elementText = selectableitems.get(i).getText();
            log.info(elementText);
        }
        //Build the select Item action.
        Actions toSelect = new Actions(driver);
        toSelect.clickAndHold(selectableitems.get(0)).clickAndHold(selectableitems.get(2)).clickAndHold(selectableitems.get(6)).click();
        //Perform action.
        Action selectItems = toSelect.build();
        selectItems.perform();

    }

    public void clickOnControlGroup() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(controlgroup.isDisplayed(),"Selectable option not dispalyed");
        controlgroup.click();
        driver.switchTo().frame(frame);
        Thread.sleep(1000);
        automatic.click();
        insurance.click();
        standard.click();
        insurance2.click();
        booknow.click();
    }
}
