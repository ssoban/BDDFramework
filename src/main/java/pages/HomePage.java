package pages;

import com.learning.base.Baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Baseclass {


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Droppable']")
    private WebElement droppable;

    @FindBy(xpath = "//*[text()='Testimonials']")
    private WebElement drag;

    @FindBy(xpath = "//*[text()='Testimonials']")
    private WebElement drop;

    @FindBy(xpath = "//*[@class=\"oxygen-unslider-container unslider-horizontal\"]/ul/li/div/div[2]/div[1]")
    private List<WebElement> cleintName;
 public void verifyUrl(){

     Assert.assertEquals(driver.getCurrentUrl(),"https://jqueryui.com/");
 }

 public void clickOnDroppable(){
     droppable.click();
 }
    public void performDragDrop() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame("content");
        Actions action = new Actions(driver);
        action.dragAndDrop(drag,drop).build().perform();


    }

     public void clickOnTestimonals(){
         Assert.assertTrue(drag.isDisplayed(),"Share confirmation option is not present");
         drop.click();
     }


    public void getClientName(){
      //  List<WebElement> listElement = driver.findElements(By.xpath(String.valueOf(cleintName)));

        for(int i =0;i<cleintName.size();i++) {
            String elementText = cleintName.get(i).getText();
            System.out.println(elementText);
        }


    }
}
